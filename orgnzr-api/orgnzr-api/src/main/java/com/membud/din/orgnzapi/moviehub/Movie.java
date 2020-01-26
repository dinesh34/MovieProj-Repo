package com.membud.din.orgnzapi.moviehub;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Movies", schema = "Topics")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private String movId;
	private String movname;
	private String reledate;
	private String lastwatched;
	private String director ;
	private String imdbrating;
	
	public Movie() {
		
	}
	
	public Movie (String movId, String movname, String reledate, String lastwatched, String director, String imdbrating) {
		this.movId = movId;
		this.movname = movname;
		this.reledate = reledate;
		this.lastwatched = lastwatched;
		this.director = director;
		this.imdbrating = imdbrating;
		
	}

	public String getMovId() {
		return movId;
	}
	
	public void setMovId(String movId) {
		this.movId = movId;
	}
	public String getMovname() {
		return movname;
	}
	public void setMovname(String movname) {
		this.movname = movname;
	}
	public String getReledate() {
		return reledate;
	}
	public void setReledate(String reledate) {
		this.reledate = reledate;
	}
	public String getlastwatched() {
		return lastwatched;
	}
	public void setlastwatched(String lastwatched) {
		this.lastwatched = lastwatched;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getImdbrating() {
		return imdbrating;
	}
	public void setImdbrating(String imdbrating) {
		this.imdbrating = imdbrating;
	}
	
}



