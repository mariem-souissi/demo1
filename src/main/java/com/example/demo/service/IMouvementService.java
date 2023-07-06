package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Mouvement;

public interface IMouvementService {
	List<Mouvement> retrieveAllMouvements();
	Mouvement addMouvement(Mouvement a);
	void deleteMouvement(String id);
	Mouvement updateMouvement(Mouvement a);
	Mouvement retrieveMouvementById(Long id);
	public List<Mouvement> getMouvement(String idCategory,int date);
	public List<Mouvement> getMouvementByDate(int date);

}
