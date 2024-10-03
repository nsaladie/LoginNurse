package com.example.loginNurse;

/*public record Nurse(boolean isLogged) {
}*/

public class Nurse {
	private int idNurse;
	private String name;
	private String password;
	private boolean isLogged;
	private static int totalNurse;

	public Nurse(String name, String password) {
		this.idNurse = totalNurse + 1;
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isLogged() {
		return isLogged;
	}

	public void setLogged(boolean isLogged) {
		this.isLogged = isLogged;
	}

}