package com.theatreservice.service;

import com.theatreservice.entity.Theatre;
import com.theatreservice.theatreDto.TheatreDetails;

public interface TheatreService {

public Theatre saveTheatre(Theatre theatre);
	
	public TheatreDetails findTheatreByMovieId(int movieId);
	
}
