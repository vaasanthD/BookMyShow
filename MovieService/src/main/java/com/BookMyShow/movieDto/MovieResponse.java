package com.BookMyShow.movieDto;

import java.time.LocalDate;
import java.util.Date;

import com.BookMyShow.entity.Genre;
import com.BookMyShow.entity.Language;



public class MovieResponse{
	
	private int movieId;
	
	private String movieName;
	
	private String genre;
	
	private String language;
	
	private String overview;
	
	private String hero;
	
	private String heroein;
	
	private String posterPath;
	
	private Date releaseDate;
	
	public int getMovieId() {
		return movieId;
	}
	
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getHero() {
		return hero;
	}

	public void setHero(String hero) {
		this.hero = hero;
	}

	public String getHeroein() {
		return heroein;
	}

	public void setHeroein(String heroein) {
		this.heroein = heroein;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}