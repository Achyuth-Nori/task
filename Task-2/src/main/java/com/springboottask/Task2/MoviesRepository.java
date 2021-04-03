package com.springboottask.Task2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends JpaRepository<Movies,String> {

		List<Movies> findByGenres(String genres);
}
