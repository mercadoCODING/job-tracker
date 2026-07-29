package com.tracker.jobtracker.webapp.domain.model;

import com.tracker.jobtracker.commons.AuditableAbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class PointOfContact extends AuditableAbstractEntity {

    @Column
    private String firstName;

    @Column
    private String middleName;

    @Column
    private String lastName;

    @Column
    private String position;

    @Column
    private String contactNo;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    protected PointOfContact() {
        //jpa
    }
}
