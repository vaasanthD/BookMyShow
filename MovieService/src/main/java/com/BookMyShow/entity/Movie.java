package com.BookMyShow.entity;

import java.util.Date;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="movie")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id")
	private int movieId;
	
	@Column (name = "movie_name")
	private String movieName;
	
	@Enumerated(EnumType.STRING)
	@Column (name = "genre")
	private Genre genre;
	
	@Enumerated(EnumType.STRING)
	@Column (name = "language")
	private Language language;
	
	@Column (name = "overview")
	private String overview;
	
	@Column (name = "hero")
	private String hero;
	
	@Column (name = "heroein")
	private String heroein;
	
	@Column (name = "poster")
	private String poster;
	
	@JsonProperty("releaseDate")
	@Column (name = "release_date")
	@JsonFormat(pattern="dd-mm-yy")
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
		return genre.name();
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public String getLanguage() {
		return language.name();
	}

	public void setLanguage(Language language) {
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

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	
	
}
