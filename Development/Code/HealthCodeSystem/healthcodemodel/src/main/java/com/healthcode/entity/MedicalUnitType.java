package com.healthcode.entity;

public enum MedicalUnitType {
	
	HOSPITAL("1"), DIAGNOSTIC_CENTRE("2"),MEDICAL_STORE("3"),	INSURANCE_UNIT("4");

    private final String value;

    /**
     * Sets paramString.
     * @param paramString
     *          TargetClassType to set.
     */
    private MedicalUnitType(String paramString) {
        this.value = paramString;
    }

    /**
     * Get Value of Target class type.
     * @return String
     */
    public String getValue() {
        return this.value;
    }
}
