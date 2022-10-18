package com.dano.soccer.dashboard.entity.scores;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DateRequest {
	@JsonProperty("scores_date")
    @NotNull
	private String scores_date;
	
	public String getScoresDate() {
		return scores_date;
	}

	public void setScoresDate(String scores_date) {
		this.scores_date = scores_date;
	}
}
