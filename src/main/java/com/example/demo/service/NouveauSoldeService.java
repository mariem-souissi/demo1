package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.NouveauSolde;

import com.example.demo.repositories.NouveauSoldeRepository;

@Service
public class NouveauSoldeService implements INouveauSoldeService{
	@Autowired
	NouveauSoldeRepository nouveauSoldeRepository;

	@Override
	public List<NouveauSolde> retrieveAllNouveauSoldes() {
		
		return null;
	}

	@Override
	public NouveauSolde addNouveauSolde(NouveauSolde a) {
		
		return null;
	}

	@Override
	public void deleteNouveauSolde(String id) {
		
		
	}

	@Override
	public NouveauSolde updateNouveauSolde(NouveauSolde a) {
		
		return null;
	}

	@Override
	public NouveauSolde retrieveNouveauSoldeById(Long id) {
		
		return null;
	}

	@Override
	public List<NouveauSolde> getNouveauSolde(String idCategory, int date) {
		
		return null;
	}

	@Override
	public List<NouveauSolde> getNouveauSoldeByDate(int date) {
		
		return null;
	}

}
