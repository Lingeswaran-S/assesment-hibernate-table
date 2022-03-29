package com.te.asses.cinima;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movie_details")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movID;
	private String movName;
	private int movRating;

	@ManyToMany(mappedBy = "movies",cascade = CascadeType.ALL)
	private List<Actor> actors;

	@ManyToOne(cascade = CascadeType.ALL)
	private Director directors;

	public Movie(String movName, int movRating) {
		super();
		this.movName = movName;
		this.movRating = movRating;
	}

}
