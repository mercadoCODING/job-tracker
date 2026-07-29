package com.tracker.jobtracker.webapp.domain.model;

public enum JobStatus {
    APPLIED("APPLIED"),
    REJECTED("REJECTED"),
    IN_PROCESS("In Process"),
    GHOSTED("GHOSTED"),
    NOT_APPLICABLE("N/A")
    ;

    private final String displayName;

    JobStatus(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
