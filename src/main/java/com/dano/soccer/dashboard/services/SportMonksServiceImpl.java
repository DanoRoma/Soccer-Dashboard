package com.dano.soccer.dashboard.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dano.soccer.dashboard.entity.scores.League;
import com.dano.soccer.dashboard.entity.scores.LeagueData;
import com.dano.soccer.dashboard.entity.scores.Match;
import com.dano.soccer.dashboard.entity.scores.ScoreDashboard;
import com.dano.soccer.dashboard.entity.scores.ScoresData;
import com.dano.soccer.dashboard.entity.scores.Team;
import com.dano.soccer.dashboard.entity.scores.TeamData;

@Service
public class SportMonksServiceImpl implements ISportMonksService{

	@Override
	public List<Match> getLiveScores() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<ScoresData> response = restTemplate.getForEntity(last_fixture_url, ScoresData.class);
		List<Match> result = response.getBody().getData();
		return result;
	}

	@Override
	public League getLeagueById(int id) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<LeagueData> response = restTemplate.getForEntity(String.format(league_by_id_url,id), LeagueData.class);
		League league = response.getBody().getData();
		return league;
	}

	@Override
	public Team getTeamById(int id) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<TeamData> response = restTemplate.getForEntity(String.format(team_by_id_url,id), TeamData.class);
		Team team = response.getBody().getData();
		return team;
	}

	@Override
	public List<Match> getScoresByDate(String date){
		RestTemplate restTemplate = new RestTemplate();
		System.out.println(String.format(scores_by_date_url,date));
		ResponseEntity<ScoresData> response = restTemplate.getForEntity(String.format(scores_by_date_url,date), ScoresData.class);
		List<Match> matches = response.getBody().getData();
		return matches;
	}

	@Override
	public List<ScoreDashboard> getScoresDashboardByDate(String date) {
		List<Match> matches = getScoresByDate(date);
		return getDashboardDetails(matches);
	}

	public List<ScoreDashboard> getDashboardDetails(List<Match> matches) {
		List<ScoreDashboard> score_dashboard_list= new ArrayList<>();

        for(Match match : matches) {
        	Team local_team = getTeamById(match.getLocalteam_id());
        	Team visitor_team = getTeamById(match.getVisitorteam_id());
        	League league = getLeagueById(match.getLeague_id());

        	ScoreDashboard score_dashboard = new ScoreDashboard(local_team,visitor_team,league,match);
        	score_dashboard_list.add(score_dashboard);
        }

		return score_dashboard_list;
	}

}
