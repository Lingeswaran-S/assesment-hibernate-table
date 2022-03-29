package com.te.student.hibernate_student;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.asses.cinima.Actor;
import com.te.asses.cinima.Director;
import com.te.asses.cinima.Movie;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu-cinima");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		ArrayList<Movie> movies = new ArrayList<Movie>();
		ArrayList<Actor> actors = new ArrayList<Actor>();
		//ArrayList<Director> directors = new ArrayList<Director>();

		// Movies
		Movie movie01 = new Movie("Gili", 5);
		Movie movie02 = new Movie("Rock", 4);

		movies.add(movie01);
		movies.add(movie02);

		// acotor
		Actor actor01 = new Actor("actor01", 33);
		Actor actor02 = new Actor("actor02", 34);
		actors.add(actor01);
		actors.add(actor02);

		// directors
		Director director01 = new Director("Dir01", 40);
		Director director02 = new Director("Dir03", 28);
		
		//--------------------
		actor01.setMovies(movies);
		actor02.setMovies(movies);
		//-----------------------
		movie01.setActors(actors);
		movie02.setActors(actors);
		//-------------------
		movie01.setDirectors(director01);
		movie02.setDirectors(director01);
		//------------------------
		director01.setMovies(movies);
		
		entityTransaction.begin();
		entityManager.persist(movie01);
		entityManager.persist(movie02);
//		entityManager.persist(director01);
//		entityManager.persist(director02);
//		entityManager.persist(actor01);
//		entityManager.persist(actor02);
		entityTransaction.commit();

	}
}
