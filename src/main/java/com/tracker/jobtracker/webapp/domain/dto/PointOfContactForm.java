package com.tracker.jobtracker.webapp.domain.dto;

import com.tracker.jobtracker.webapp.domain.model.PointOfContact;

public class PointOfContactForm {

    private String firstName;

    private String middleName;

    private String lastName;

    private String position;

    private String contactNo;

    public PointOfContactForm(String firstName, String middleName, String lastName, String position, String contactNo) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.position = position;
        this.contactNo = contactNo;
    }

    public PointOfContactForm(PointOfContact pointOfContact) {
        this.firstName = pointOfContact.getFirstName();
        this.middleName = pointOfContact.getMiddleName();
        this.lastName = pointOfContact.getLastName();
        this.position = pointOfContact.getPosition();
        this.contactNo = pointOfContact.getContactNo();
    }

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
}
