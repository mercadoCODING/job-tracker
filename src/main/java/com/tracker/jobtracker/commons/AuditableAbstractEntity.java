package com.tracker.jobtracker.commons;

import jakarta.persistence.Column;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

public class AuditableAbstractEntity extends AbstractEntity {

    static final String SYSTEM_AUDITOR = "SYSTEM";

    @Column(nullable = false, updatable = false)
    private String createdBy;

    @Column(nullable = false)
    private String updatedBy;

    @PrePersist
    protected void onAuditCreate() {
        String actor = AuditorProvider.getCurrentAuditor().orElse(SYSTEM_AUDITOR);
        createdBy = actor;
        updatedBy = actor;
    }

    @PreUpdate
    protected void onAuditUpdate() {
        updatedBy = AuditorProvider.getCurrentAuditor().orElse(SYSTEM_AUDITOR);
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    protected AuditableAbstractEntity() {
        // jpa
    }
}
