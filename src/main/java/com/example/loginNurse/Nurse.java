package com.example.loginNurse;

/*public record Nurse(boolean isLogged) {
}*/

public class Nurse {
	private int idNurse;
	private String name;
	private String password;
	private static int totalNurse;

	public Nurse(String name, String password) {
		this.idNurse = totalNurse + 1;
		this.name = name;
		this.password = password;
	}

	public int getIdNurse() {
		return idNurse;
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

}