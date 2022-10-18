package com.dano.soccer.dashboard.services;

import java.util.List;

import com.dano.soccer.dashboard.entity.scores.League;
import com.dano.soccer.dashboard.entity.scores.Match;
import com.dano.soccer.dashboard.entity.scores.ScoreDashboard;
import com.dano.soccer.dashboard.entity.scores.Team;

public interface ISportMonksService {
	public static String api_token = "mLWJEQqLpTieESX6JrdUyvtWOASxtUxivVhPuCd160fSA9Fsqit76CqwOjd0";
	public static String livescores_url = "https://soccer.sportmonks.com/api/v2.0/livescores?api_token=" + api_token;
	public static String league_by_id_url = "https://soccer.sportmonks.com/api/v2.0/leagues/%s?api_token=" + api_token;
	public static String last_fixture_url = "https://soccer.sportmonks.com/api/v2.0/fixtures/updates?api_token="+ api_token;
	public static String team_by_id_url = "https://soccer.sportmonks.com/api/v2.0/teams/%s?api_token=" + api_token;
	public static String scores_by_date_url = "https://soccer.sportmonks.com/api/v2.0/fixtures/date/%s?api_token=" + api_token;

	public List<Match> getLiveScores();

	public League getLeagueById(int id);

	public Team getTeamById(int id);

	public List<Match> getScoresByDate(String date);

	public List<ScoreDashboard> getScoresDashboardByDate(String date);
}
