package com.dano.soccer.dashboard.entity.scores;

public class League {
     private int id;

     private String name,logo_path;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogo_path() {
		return logo_path;
	}

	public void setLogo_path(String logo_path) {
		this.logo_path = logo_path;
	}

	@Override
	public String toString() {
		return "League [id=" + id + ", name=" + name + ", logo_path=" + logo_path + "]";
	}
}
