package com.tracker.jobtracker.webapp.domain.model;

public enum AuthProvider {
    GOOGLE("GOOGLE"),
    LINKEDIN("LINKEDIN"),
    GITHUB("GITHUB");

    private final String provider;

    AuthProvider(String provider){
        this.provider = provider;
    }

    public String getAuthProvider() {
        return provider;
    }
}
