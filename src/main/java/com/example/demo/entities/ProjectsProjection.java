package com.example.demo.entities;

import org.springframework.data.rest.core.config.Projection;

public interface ProjectsProjection {
	@Projection(name = "nomProj", types = { Projects.class })
	public interface ProduitProjection {
	public String getNomProj();
	}

}
