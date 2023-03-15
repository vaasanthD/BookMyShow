package com.BookMyShow.service;

import java.util.List;

import com.BookMyShow.entity.Movie;
import com.BookMyShow.movieDto.MovieResponse;


public interface MovieService{
	
	public Movie saveMovie(Movie movie);
	
	public MovieResponse getMovieById(int movieId);
	
	public MovieResponse findByMovieName(String movieName);
	
	public List<Movie>getAll();
	
	public MovieResponse findByMovieGenreOrLanguage(String moviename);
	
}