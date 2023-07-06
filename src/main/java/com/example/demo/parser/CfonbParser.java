package com.example.demo.parser;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entities.AncienSolde;
import com.example.demo.entities.Complement;
import com.example.demo.entities.Mouvement;
import com.example.demo.entities.NouveauSolde;
import com.example.demo.service.AncienSoldeService;
import com.example.demo.service.ComplementService;
import com.example.demo.service.MouvementService;
import com.example.demo.service.NouveauSoldeService;


public class CfonbParser {
	public void processFile(MultipartFile file) {
	    Connection conn = null;

	    String dburl = "jdbc:mysql://127.0.0.1:3306/cfonb-120?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	    String username = "root";
	    String pwd = "123456789";
	    
	    
	    try {
	        AncienSoldeService ancienSoldeService = new AncienSoldeService();
	        conn = DriverManager.getConnection(dburl, username, pwd);
	        ComplementService complementService = new ComplementService();

	        Scanner input = new Scanner(new File("CFONB120.txt"));
	        

	        while (input.hasNextLine()) {
	        	String str=input.nextLine();
				System.out.println(str);
				String codeEnr= str.substring(0, 2);
				System.out.println(codeEnr);
				if(codeEnr.equals("01")) {
					String codeBanque = str.substring(2, 7);
					String zoneC = str.substring(7, 11);


					String codeGuichet = str.substring(11, 16);
					String codeDevise = str.substring(16, 19);

					int nbDecMnt = Integer.parseInt(str.substring(19, 20));
					String zoneG = str.substring(20, 21);

					String numCompte = str.substring(21, 32);
					String zoneI = str.substring(32, 34);

					int dateAncienSolde = Integer.parseInt(str.substring(34, 40));
					String zoneK =str.substring(40, 90);

					String mntAncienSolde = str.substring(90, 104);
					String zoneM = str.substring(104);
					System.out.println(codeEnr+codeBanque+zoneC+codeGuichet+codeDevise+nbDecMnt+zoneG+numCompte+zoneI+dateAncienSolde+zoneK+mntAncienSolde+zoneM);
					AncienSolde ancienSolde = new AncienSolde();
					ancienSoldeService.addAncienSolde(ancienSolde);

				}
				if(codeEnr.equals("04")) {
					String codeBanque =str.substring(3, 7);
					String codeOpInt = str.substring(7, 11);
					String codeGuichet = str.substring(11, 16);
					String codeDevise = str.substring(16, 19);

					int nbDecMnt = Integer.parseInt(str.substring(19, 20));
					String zoneG = str.substring(20, 21);

					String numCompte = str.substring(21, 32);
					String codeOpInterBan = str.substring(32, 34);
					int dateComptaOp = Integer.parseInt(str.substring(34, 40));
					String codeMotifRejet= str.substring(40, 42);
					int dateValeur = Integer.parseInt(str.substring(42, 48));

					String libelle = str.substring(48, 79);
					String zoneN = str.substring(79, 81);
					int numEcriture = Integer.parseInt(str.substring(81, 88));
					String indExonerationCom = str.substring(88, 89);
					String indIndisponibilte = str.substring(89, 90);

					String mntMouvement = str.substring(90, 104);
					String zoneS = str.substring(104);
					MouvementService mouvementService = new MouvementService();
					Mouvement mouvement = new Mouvement();
					mouvementService.addMouvement(mouvement);
				
				}
				if(codeEnr.equals("05")) {
					String codeBanque = str.substring(3, 7);
					String codeOpInt = str.substring(7, 11);
					String codeGuichet = str.substring(11, 16);
					
					String codeDevise = str.substring(16, 19);

					int nbDecMnt = Integer.parseInt(str.substring(19, 20));
					String zoneG = str.substring(20, 21);

					String numCompte = str.substring(21, 32);
					String codeOpInterBan = str.substring(32, 34);
					int dateComptaOp = Integer.parseInt(str.substring(34, 40));
					String zoneK = str.substring(40, 45);
					String qualInfCompl = str.substring(45, 48);
					String infCompl = str.substring(48, 118);
					String zoneN = str.substring(118);
					
					
					String str1 = input.nextLine();
					if(!qualInfCompl.equals(str1.substring(45, 48))) {
						Complement complement = new Complement();
						
						complementService.addComplement(complement);
						
					}

				}
				if(codeEnr.equals("07")) {
					String codeBanque = str.substring(3, 7);
					String zoneC = str.substring(7, 11);


					String codeGuichet = str.substring(11, 16);
					String codeDevise = str.substring(16, 19);

					int nbDecMnt = Integer.parseInt(str.substring(19, 20));
					String zoneG = str.substring(20, 21);

					String numCompte = str.substring(21, 32);
					String zoneI = str.substring(32, 34);
					
					int dateNouveauSolde = Integer.parseInt(str.substring(34, 40));
					String zoneK = str.substring(40, 90);

					String mntNouveauSolde = str.substring(90, 104);
					String zoneM = str.substring(104);
					NouveauSoldeService nouveauSoldeService = new NouveauSoldeService();
					NouveauSolde nouveauSolde = new NouveauSolde();
					nouveauSoldeService.addNouveauSolde(nouveauSolde);


				}

	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        // Close the connection and other resources if necessary
	    }
	}


}
