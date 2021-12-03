package com.example.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Devloper;
import com.example.demo.entities.Projects;
import com.example.demo.service.DevloperService;
import com.example.demo.service.DevloperServiceImpl;
import com.example.demo.service.ProjectsService;


@RestController
@RequestMapping("/devs")
@CrossOrigin(origins="http://localhost:4200")
public class DevloperRESTController {
	@Autowired 
	DevloperService devloperservice;
	
	@RequestMapping(path="all",method = RequestMethod.GET)
	public List<Devloper> getAllDevlopers() {
	return devloperservice.getAllDevlopers();
	}
	

	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Devloper getDevloperById(@PathVariable("id") Long id) {
	return devloperservice.getDevloper(id) ;
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public Devloper createDevloper(@RequestBody Devloper devloper) {
	return devloperservice.saveDevloper(devloper);
	}

	
	@RequestMapping(method = RequestMethod.PUT)
	public Devloper updateDevloper(@RequestBody Devloper devloper) {
	return devloperservice.updateDevloper(devloper);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteDevloper(@PathVariable("id") Long id)
	{
		devloperservice.deleteDevloperById(id);
	}
	
	
}
