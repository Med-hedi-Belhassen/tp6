package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Devloper;
import com.example.demo.entities.Projects;



public interface ProjectsService {
	
	Projects saveProject(Projects p);
	
	Projects updateProject(Projects p);
	
	void deleteProject(Projects p);
	
	void deleteProjectById(Long id);
	 
	Projects getProject(Long id);
	 
	List<Projects> getAllProjects();
	List<Projects>findByNomProduit(String nom);
	List<Projects> findByNomProduitContains(String nom);
	List<Projects> findByNomPrix (String nom, Float prix);
	List<Projects> findByDeveloper (Devloper devloper);
	List<Projects> findByDeveloperIdDev(Long id);
	List<Projects>findByOrderByNomProjtAsc();
	List<Projects> trierProjectsNomsPrix();
}
