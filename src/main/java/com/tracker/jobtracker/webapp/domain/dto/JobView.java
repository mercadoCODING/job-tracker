package com.tracker.jobtracker.webapp.domain.dto;

import com.tracker.jobtracker.webapp.domain.model.Job;
import com.tracker.jobtracker.webapp.domain.model.JobStatus;
import com.tracker.jobtracker.webapp.domain.model.PointOfContact;
import java.util.List;

public class JobView {

    private String companyName;

    private String address;

    private String position;

    private String contactNo;

    private String landline;

    private String referenceLink;

    private JobStatus jobStatus;

    private String remarks;

    public JobView(String companyName, String address, String position, String contactNo, String landline,
        String referenceLink, JobStatus jobStatus, String remarks) {
        this.companyName = companyName;
        this.address = address;
        this.position = position;
        this.contactNo = contactNo;
        this.landline = landline;
        this.referenceLink = referenceLink;
        this.jobStatus = jobStatus;
        this.remarks = remarks;
    }

    public static JobView buildByEntity(JobForm job) {
        return new JobView(job.getCompanyName(),
            job.getAddress(),
            job.getPosition(),
            job.getContactNo(),
            job.getLandline(),
            job.getReferenceLink(),
            job.getJobStatus(),
            job.getRemarks()
        );
    }

    public static List<JobView> buildByEntities(List<JobForm> jobs) {
        return jobs.stream().map(JobView::buildByEntity).toList();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getLandline() {
        return landline;
    }

    public void setLandline(String landline) {
        this.landline = landline;
    }

    public String getReferenceLink() {
        return referenceLink;
    }

    public void setReferenceLink(String referenceLink) {
        this.referenceLink = referenceLink;
    }

    public JobStatus getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
