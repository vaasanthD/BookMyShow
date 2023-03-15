package com.BookMyShow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.BookMyShow.entity.Movie;
import com.BookMyShow.movieDto.MovieResponse;
import com.BookMyShow.service.MovieService;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/movie")
@RequiredArgsConstructor
public class MovieServiceController{
	
	@Autowired
	private final MovieService service;
	
	
	@PostMapping("/create")
	public ResponseEntity<?> CreateMovie(@RequestBody Movie movie) {
		
		//Movie savedMovie = service.saveMovie(movie);
		
		return ResponseEntity.ok(service.saveMovie(movie));
	}
	
	@GetMapping("/getAllMovies")
	public List<Movie> getAllMovies(){
		
		return service.getAll();
		
	}
	
	@GetMapping("/movieId/{movieId}")
	public MovieResponse findByMovieId(@PathVariable("movieId")int movieId) {
		
		return service.getMovieById(movieId);
		
	}
	
	@GetMapping("/moviename/{movieName}")
	public MovieResponse findByMovieName(@PathVariable("movieName")String movieName) {
		
		return service.findByMovieName(movieName);
		
	}
	@GetMapping("/searchMovie/{movieName}")
	
	public MovieResponse findMovieByName(@PathVariable("name")String name) {
		
		return service.findByMovieName(name);
	}
	
	@GetMapping("/filterBy/{moviename}")
	public MovieResponse findMovie(@PathVariable("movieName")String movieName) {
		
		return service.findByMovieGenreOrLanguage(movieName);
	}
	
}
