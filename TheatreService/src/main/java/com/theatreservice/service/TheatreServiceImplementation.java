package com.theatreservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theatreservice.entity.Theatre;
import com.theatreservice.repo.TheatreServiceRepository;
import com.theatreservice.theatreDto.TheatreDetails;

import lombok.RequiredArgsConstructor;



@Service
@RequiredArgsConstructor
public class TheatreServiceImplementation implements TheatreService {

	@Autowired
	TheatreServiceRepository theatreRepo;
	
	@Override
	public Theatre saveTheatre(Theatre theatre) {
		
		Theatre savedTheatre = theatreRepo.save(theatre);
		
		return savedTheatre;
	}
	
	
	@Override 
	public TheatreDetails findTheatreByMovieId(int movieId) {
		
		TheatreDetails theatreDetails = theatreRepo.findTheatreByMovieId(movieId);
		
		return theatreDetails;
	}



	
}
