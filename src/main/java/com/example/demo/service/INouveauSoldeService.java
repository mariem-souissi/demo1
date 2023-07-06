package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.NouveauSolde;

public interface INouveauSoldeService {
	List<NouveauSolde> retrieveAllNouveauSoldes();
	NouveauSolde addNouveauSolde(NouveauSolde a);
	void deleteNouveauSolde(String id);
	NouveauSolde updateNouveauSolde(NouveauSolde a);
	NouveauSolde retrieveNouveauSoldeById(Long id);
	public List<NouveauSolde> getNouveauSolde(String idCategory,int date);
	public List<NouveauSolde> getNouveauSoldeByDate(int date);

}
