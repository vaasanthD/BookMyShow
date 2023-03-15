package com.BookMyShow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookMyShow.entity.Movie;
import com.BookMyShow.exceptionHandling.ResourceNotFoundException;
import com.BookMyShow.movieDto.MovieResponse;
import com.BookMyShow.repo.MovieRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class MovieServiceImplementation implements MovieService {

	@Autowired
	private final MovieRepository movieRepository;
	
	
	
	@Override
	public MovieResponse getMovieById(int movieId){
		
		  MovieResponse movieResponse = new MovieResponse();
		  
		  
		  Movie movie = movieRepository.findById(movieId).orElseThrow(()-> new ResourceNotFoundException ("movie","movieId",Integer.toString(movieId)));
		  
		  
		  movieResponse.setMovieId(movie.getMovieId());
		  movieResponse.setMovieName(movie.getMovieName());
		  movieResponse.setGenre(movie.getGenre());
		  movieResponse.setLanguage(movie.getLanguage());
		  movieResponse.setOverview(movie.getOverview());
		  movieResponse.setHero(movie.getHero());
		  movieResponse.setHeroein(movie.getHeroein());
		  movieResponse.setPosterPath(movie.getPoster());
		  movieResponse.setReleaseDate(movie.getReleaseDate());
		  
		  return movieResponse;
		 
  }
	
	/*
	 * public MovieResponse getMovieByName(String movieName){
	 * 
	 * MovieResponse movieResponse = new MovieResponse();
	 * 
	 * 
	 * Movie movie = movieRepository.findByMovieName(movieName);
	 * 
	 * 
	 * movieResponse.setMovieId(movie.getMovieId());
	 * movieResponse.setMovieName(movie.getMovieName());
	 * movieResponse.setGenre(movie.getGenre());
	 * movieResponse.setLanguage(movie.getLanguage());
	 * movieResponse.setOverview(movie.getOverview());
	 * movieResponse.setHero(movie.getHero());
	 * movieResponse.setHeroein(movie.getHeroein());
	 * movieResponse.setPosterPath(movie.getPoster());
	 * movieResponse.setReleaseDate(movie.getReleaseDate());
	 * 
	 * return movieResponse; }
	 */
	
	@Override
	public Movie saveMovie(Movie movie){
		Movie newMovie = movieRepository.save(movie);
		return newMovie;
		
	}
	
	
	public List<Movie> getAll(){
	
		return movieRepository.findAll();
	}
	
	
	public MovieResponse findByMovieGenreOrLanguage(String movieName){
	
		return null;
	}
	
	@Override
	public MovieResponse findByMovieName(String movieName){
		
MovieResponse movieResponse = new MovieResponse();
		
		
		Movie movie = movieRepository.findByMovieName(movieName);
		if(movie==null) {
			throw new ResourceNotFoundException("movie", "movieName", movieName);
		}
		
		
		movieResponse.setMovieId(movie.getMovieId());
		movieResponse.setMovieName(movie.getMovieName());
		movieResponse.setGenre(movie.getGenre());
		movieResponse.setLanguage(movie.getLanguage());
		movieResponse.setOverview(movie.getOverview());
		movieResponse.setHero(movie.getHero());
		movieResponse.setHeroein(movie.getHeroein());
		movieResponse.setPosterPath(movie.getPoster());
		movieResponse.setReleaseDate(movie.getReleaseDate());
	
		return movieResponse;
		
	}
}
	
