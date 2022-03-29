package com.te.asses.cinima;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "director_details")
public class Director {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dirID;
	private String dirName;
	private int dirAge;

	@OneToMany
	private List<Movie> movies;

	public Director(String dirName, int dirAge) {
		super();
		this.dirName = dirName;
		this.dirAge = dirAge;
	}

}
