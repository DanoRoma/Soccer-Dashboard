package com.dano.soccer.dashboard.entity.scores;

public class ScoreTime{
	int minute, added_time;
	StartingAt starting_at;

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getAdded_time() {
		return added_time;
	}

	public void setAdded_time(int added_time) {
		this.added_time = added_time;
	}

	public StartingAt getStarting_at() {
		return starting_at;
	}

	public void setStarting_at(StartingAt starting_at) {
		this.starting_at = starting_at;
	}
}
