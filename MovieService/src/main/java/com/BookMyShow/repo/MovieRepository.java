package com.BookMyShow.repo;

import com.BookMyShow.entity.Movie;
import com.BookMyShow.movieDto.MovieResponse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;






@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{
	public MovieResponse findByMovieId(int movieId);
	@Query(value = "select * from movie where movie_name = :movieName OR hero = :movieName OR heroein = :movieName",nativeQuery = true)
	public Movie findByMovieName(@Param("movieName") String movieName);
	
	
}