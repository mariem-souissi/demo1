package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import com.example.demo.entities.*;
@Entity
@Table(name = "ancien_solde")
@Data
@AllArgsConstructor
@NoArgsConstructor


public class AncienSolde {
	//@PersistenceContext
		//EntityManager entityManager;
		@Column(name="code_enregistrement",length = 2)
		int code_enregistrement;
		@Column(name="code_banque",length = 5)
		String code_banque;
		@Column(name="code_guichet",length = 5)
		String code_guichet ;
		@Column(name="code_devise",length = 3)
		String code_devise ;
		@Column(name="nombre_dec_mont",length = 1)
		int nombre_dec_mont;
		private static final long serialVersionUID = 1L;
		@Id
		@Column(name="numero_compte",length = 11)
		String numero_compte;

		@Column(name="date_anc_solde",length = 6)
		@DateTimeFormat(pattern = "ddMMyy")
		private LocalDate date_anc_solde;

		
		@Column(name="mont_anc_solde",length = 14)
		String mont_anc_solde ;
		@Column(name="zoneC",length =4)
		String ZoneC;
		@Column(name="zoneG",length = 1)
		String ZoneG;
		@Column(name="zoneI",length = 2)
		String ZoneI ;
		@Column(name="zoneK",length = 50)
		String ZoneK ;
		@Column(name="zoneM",length = 16)
		String ZoneM;
		
		@OneToOne
	    private NouveauSolde nouveauSolde;
	    
	    @OneToMany(fetch=FetchType.LAZY,mappedBy = "ancienSolde")
	    private List<Mouvement> mouvements;
	    

}
