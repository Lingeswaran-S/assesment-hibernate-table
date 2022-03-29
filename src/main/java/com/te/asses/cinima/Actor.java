package com.te.asses.cinima;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "actor_table")
public class Actor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int actID;
	private String actName;
	private int actAge;
	
	@ManyToMany
	private List<Movie> movies;

	public Actor(String actName, int actAge) {
		super();
		this.actName = actName;
		this.actAge = actAge;
	}

	
	
	

}
