package com.theatreservice.theatreDto;

import java.time.LocalDateTime;

public interface TheatreDetails {
	
	String getTheatreName();
	LocalDateTime getShowDateTime();
	String getCity();
	String getScreenName();

}
