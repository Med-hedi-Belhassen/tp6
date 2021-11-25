package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Devloper;
import com.example.demo.entities.Projects;
import com.example.demo.repo.ProjectsRepository;

@Service
public class ProjectsServiceImpl implements ProjectsService {
	
	@Autowired
	ProjectsRepository projectsRepository;

	@Override
	public Projects saveProject(Projects p) {
            
		return this.projectsRepository.save(p);
	}

	@Override
	public Projects updateProject(Projects p) {
		return this.projectsRepository.save(p);
	}

	@Override
	public void deleteProject(Projects p) {
		this.projectsRepository.delete(p);
		
	}

	@Override
	public void deleteProjectById(Long id) {
		this.projectsRepository.deleteById(id);
		
	}

	@Override
	public Projects getProject(Long id) {
		
		return this.projectsRepository.findById(id).get();
	}

	@Override
	public List<Projects> getAllProjects() {
		
		return this.projectsRepository.findAll();
				}

	@Override
	public List<Projects> findByNomProduit(String nom) {
		
		return this.projectsRepository.findBynomProj(nom);
	}

	@Override
	public List<Projects> findByNomProduitContains(String nom) {
		
		return this.projectsRepository.findBynomProjContains(nom);
	}

	public List<Projects> findByNomPrix (String nom, Float prix) {
		
		return this.projectsRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Projects> findByDeveloper(Devloper devloper) {
		
		return  this.projectsRepository.findByDevloper(devloper);
	}

	@Override
	public List<Projects> findByDeveloperIdDev(Long id) {
	
		return this.projectsRepository.findByDevloperIdDev(id)  ;
	}

	@Override
	public List<Projects> findByOrderByNomProjtAsc() {
		
		return this.projectsRepository.findByOrderByNomProjAsc() ;
	}

	@Override
	public List<Projects> trierProjectsNomsPrix() {
		
		return this.projectsRepository.trierProjsNomsPrix();
	}
	


}
