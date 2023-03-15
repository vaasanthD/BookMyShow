package com.theatreservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theatreservice.entity.Theatre;
import com.theatreservice.service.TheatreService;
import com.theatreservice.theatreDto.TheatreDetails;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TheatreServiceController{
	
	
	@Autowired
	TheatreService theatreService;
	
	
	@PostMapping("/theatre/create")
	public Theatre createTheatre(@RequestBody Theatre theatre) {
		
		 return theatreService.saveTheatre(theatre);
		
		}
	
	
	
	@GetMapping("/theatre/{movieId}")
	public TheatreDetails getTheatreByMovieId(@PathVariable("movieId") int movieId) {
		
		return theatreService.findTheatreByMovieId(movieId);
	}
}
