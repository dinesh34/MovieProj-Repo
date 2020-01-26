package com.membud.din.orgnzapi.moviehub;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, String> {

	public List<Movie> findByMovname(String movname);
	public List<Movie> findByDirector(String director);
	
}
