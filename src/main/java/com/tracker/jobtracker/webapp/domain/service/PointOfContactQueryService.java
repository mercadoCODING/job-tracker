package com.tracker.jobtracker.webapp.domain.service;

import com.tracker.jobtracker.webapp.domain.model.PointOfContact;
import java.util.List;

public interface PointOfContactQueryService {

    List<PointOfContact> findByLastNameContainingIgnoreCase(String lastName);

    List<PointOfContact> findByContactNo(String contactNo);
}
