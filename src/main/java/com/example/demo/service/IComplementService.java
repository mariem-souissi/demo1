package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Complement;



public interface IComplementService {
	List<Complement> retrieveAllComplements();
	Complement addComplement(Complement a);
	void deleteComplement(String id);
	Complement retrieveComplementById(String id);
	

}
