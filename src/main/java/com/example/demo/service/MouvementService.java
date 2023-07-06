package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Mouvement;
import com.example.demo.repositories.MouvementRepository;


@Service
public class MouvementService implements IMouvementService{
	@Autowired
	MouvementRepository mouvementRepository;

	@Override
	public List<Mouvement> retrieveAllMouvements() {
		
		return null;
	}

	@Override
	public Mouvement addMouvement(Mouvement a) {
		
		return null;
	}

	@Override
	public void deleteMouvement(String id) {
		
		
	}

	@Override
	public Mouvement updateMouvement(Mouvement a) {
		
		return null;
	}

	@Override
	public Mouvement retrieveMouvementById(Long id) {
		
		return null;
	}

	@Override
	public List<Mouvement> getMouvement(String idCategory, int date) {
		
		return null;
	}

	@Override
	public List<Mouvement> getMouvementByDate(int date) {
		
		return null;
	}

}
