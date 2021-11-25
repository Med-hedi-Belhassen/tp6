package com.example.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Projects;
import com.example.demo.service.ProjectsService;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProjectsRESTController {
	
	@Autowired
	ProjectsService projetservice;
	
	@RequestMapping(path="all",method = RequestMethod.GET)
	public List<Projects> getAllProjects() {
	return projetservice.getAllProjects();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Projects getProduitById(@PathVariable("id") Long id) {
	return projetservice.getProject(id) ;
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public Projects createProject(@RequestBody Projects projects) {
	return projetservice.saveProject(projects);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Projects updateProject(@RequestBody Projects projects) {
	return projetservice.updateProject(projects);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteProjet(@PathVariable("id") Long id)
	{
		projetservice.deleteProjectById(id);
	}
	
	@RequestMapping(value="/projscat/{idDev}",method = RequestMethod.GET)
	public List<Projects> getProduitsByCatId(@PathVariable("idDev") Long idDev) {
	return projetservice.findByDeveloperIdDev(idDev) ;
	}

}
