package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Devloper;
import com.example.demo.entities.Projects;



public interface DevloperService {
	
	Devloper saveDevloper(Devloper d);
	
	Devloper updateDevloper(Devloper d);
	
	void deleteDeveloper(Devloper d);
	
	void deleteDevloperById(Long id);
	 
	Devloper getDevloper(Long id);
	 
	List<Devloper> getAllDevlopers();
	/*List<Projects>findByNomProduit(String nom);
	List<Projects> findByNomProduitContains(String nom);
	List<Projects> findByNomPrix (String nom, Float prix);
	List<Projects> findByDeveloper (Devloper devloper);
	List<Projects> findByDeveloperIdDev(Long id);
	List<Projects>findByOrderByNomProjtAsc();
	List<Projects> trierProjectsNomsPrix();*/
}
