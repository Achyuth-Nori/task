package com.springboottask.Task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesService {

	 @Autowired
    private MoviesRepository moviesRepository;
   
       public void save(List<Movies> movie){

        moviesRepository.saveAll(movie);
    }
       
       public List<Movies> findByGenres(String genres){
    	   return moviesRepository.findByGenres(genres);
       }
       
}
