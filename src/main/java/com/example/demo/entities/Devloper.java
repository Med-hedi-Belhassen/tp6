package com.example.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Devloper {
	  @Id
	    @GeneratedValue (strategy = GenerationType.IDENTITY)
		private Long idDev;
		private String LastNameDev;
		private String firstNameDev;
		private String mailDev;
		private String adressDev;
		@JsonIgnore
		@OneToMany(fetch = FetchType.EAGER,mappedBy = "devloper")
		private List<Projects> projectes;
}
