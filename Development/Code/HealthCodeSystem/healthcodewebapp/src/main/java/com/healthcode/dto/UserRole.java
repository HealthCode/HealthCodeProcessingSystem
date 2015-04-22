package com.healthcode.dto;

public enum UserRole {

	Patient(0),
	Doctor(1),
	Hospital(2),
	MedicalDiagnostics(3),
	MedicalStore(4);
	
	private int roleId;
	
	private UserRole(int id)
	{
		this.roleId = id;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
}
