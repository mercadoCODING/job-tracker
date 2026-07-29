package com.tracker.jobtracker.webapp.domain.dto;

import com.tracker.jobtracker.webapp.domain.model.Job;
import com.tracker.jobtracker.webapp.domain.model.JobStatus;

public class JobForm {

    private final String companyName;

    private final String address;

    private final String position;

    private final String contactNo;

    private final String landline;

    private final String referenceLink;

    private final JobStatus jobStatus;

    private final String remarks;

    public JobForm(String companyName, String address, String position, String contactNo, String landline,
        String referenceLink,JobStatus jobStatus, String remarks) {
        this.companyName = companyName;
        this.address = address;
        this.position = position;
        this.contactNo = contactNo;
        this.landline = landline;
        this.referenceLink = referenceLink;
        this.jobStatus = jobStatus;
        this.remarks = remarks;
    }

    public JobForm(Job job) {
        this.companyName = job.getCompanyName();
        this.address = job.getAddress();
        this.position = job.getPosition();
        this.contactNo = job.getContactNo();
        this.landline = job.getLandline();
        this.referenceLink = job.getReferenceLink();
        this.jobStatus = job.getJobStatus();
        this.remarks = job.getRemarks();
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddress() {
        return address;
    }

    public String getPosition() {
        return position;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getLandline() {
        return landline;
    }

    public String getReferenceLink() {
        return referenceLink;
    }

    public JobStatus getJobStatus() {
        return jobStatus;
    }

    public String getRemarks() {
        return remarks;
    }

}
