package com.dano.soccer.dashboard.entity.scores;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Match implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int league_id,season_id,localteam_id, visitorteam_id;
	private Scores scores;
	private ScoreTime time;

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public int getLeague_id() {
		return league_id;
	}



	public void setLeague_id(int league_id) {
		this.league_id = league_id;
	}



	public int getSeason_id() {
		return season_id;
	}



	public void setSeason_id(int season_id) {
		this.season_id = season_id;
	}



	public int getLocalteam_id() {
		return localteam_id;
	}



	public void setLocalteam_id(int localteam_id) {
		this.localteam_id = localteam_id;
	}



	public int getVisitorteam_id() {
		return visitorteam_id;
	}



	public void setVisitorteam_id(int visitorteam_id) {
		this.visitorteam_id = visitorteam_id;
	}



	public Scores getScores() {
		return scores;
	}



	public void setScores(Scores scores) {
		this.scores = scores;
	}



	public ScoreTime getTime() {
		return time;
	}



	public void setTime(ScoreTime time) {
		this.time = time;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	private static final long serialVersionUID = 1L;
}
