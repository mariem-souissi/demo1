package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.entities.AncienSolde;



public interface IAncienSoldeService {
	List<AncienSolde> retrieveAllAncienSoldes();
	AncienSolde addAncienSolde(AncienSolde a);
	void deleteAncienSolde(String id);
	
	AncienSolde retrieveAncienSoldeById(String id);
	public List<AncienSolde> getAncienSolde(String id,int date);
	public List<AncienSolde> getAncienSoldeByDate(LocalDate date);

}
