package com.dano.soccer.dashboard.entity.scores;

public class ScoreDashboard {
	private Team local_team;
	private Team visitor_team;
	private League league;
	private Scores scores;
	private ScoreTime time;

	public Team getLocal_team() {
		return local_team;
	}

	public void setLocal_team(Team local_team) {
		this.local_team = local_team;
	}

	public Team getVisitor_team() {
		return visitor_team;
	}

	public void setVisitor_team(Team visitor_team) {
		this.visitor_team = visitor_team;
	}

	public League getLeague() {
		return league;
	}

	public void setLeague(League league) {
		this.league = league;
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

	public ScoreDashboard(Team local_team, Team visitor_team, League league,Match match) {
		this.local_team = local_team;
		this.visitor_team = visitor_team;
		this.league = league;
		this.scores = match.getScores();
		this.time = match.getTime();
	}


}
