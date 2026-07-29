package com.tracker.jobtracker.webapp.domain.dto;

import java.util.List;

public class PointOfContactView {

    private String firstName;

    private String middleName;

    private String lastName;

    private String position;

    private String contactNo;

    public PointOfContactView(String firstName, String middleName, String lastName, String position, String contactNo) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.position = position;
        this.contactNo = contactNo;
    }

    public static PointOfContactView buildByEntity(PointOfContactForm pointOfContact) {
        return new PointOfContactView(
            pointOfContact.getFirstName(),
            pointOfContact.getMiddleName(),
            pointOfContact.getLastName(),
            pointOfContact.getPosition(),
            pointOfContact.getContactNo()
        );
    }

    public static List<PointOfContactView> buildByEntities(List<PointOfContactForm> pointOfContact) {
        return pointOfContact.stream().map(PointOfContactView::buildByEntity).toList();
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
