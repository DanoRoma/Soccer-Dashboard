package com.dano.soccer.dashboard.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dano.soccer.dashboard.entity.scores.DateRequest;
import com.dano.soccer.dashboard.entity.scores.League;
import com.dano.soccer.dashboard.entity.scores.Match;
import com.dano.soccer.dashboard.entity.scores.ScoreDashboard;
import com.dano.soccer.dashboard.entity.scores.Team;
import com.dano.soccer.dashboard.services.ISportMonksService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/scores")
public class ScoresRestController {

	@Autowired
    private ISportMonksService smc;

	@GetMapping("/getLiveScores")
	public List<Match> getLiveScores() {
		return smc.getLiveScores();
	}

	@GetMapping("/getLeague")
	public League getLeague(int id) {
		return smc.getLeagueById(id);
	}

	@GetMapping("/getTeam")
	public Team getTeam(int id) {
		return smc.getTeamById(id);
	}

	@GetMapping("/getScoresByDate")
	public List<Match> getScoresByDate(@Valid @RequestBody DateRequest request) {
		return smc.getScoresByDate(request.getScoresDate());
	}

	@GetMapping("/getScoresDashboard")
	public List<ScoreDashboard> getScoresDashboardByDate(@Valid @RequestBody DateRequest request){
		return smc.getScoresDashboardByDate(request.getScoresDate());
	}
}
