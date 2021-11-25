package com.example.demo.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.demo.entities.Devloper;
import com.example.demo.entities.Projects;


@RepositoryRestResource(path = "rest")
public interface ProjectsRepository extends JpaRepository<Projects, Long>  {
	
	 List<Projects> findBynomProj(String nom);
	 
	 List<Projects> findBynomProjContains(String nom); 
	 
	 @Query("select p from Projects p where p.nomProj like %?1 and p.prixProj > ?2")
	 List<Projects> findByNomPrix (String nom, Float prix);
	 
	 @Query("select p from Projects p where p.devloper = ?1")
	 List<Projects> findByDevloper (Devloper devloper);
	 
	 List<Projects> findByDevloperIdDev (Long id);
	 
	 List<Projects> findByOrderByNomProjAsc();
	 
	 @Query("select p from Projects p  order by p.nomProj DESC, p.prixProj DESC")
	  List<Projects> trierProjsNomsPrix ();
	  

}
