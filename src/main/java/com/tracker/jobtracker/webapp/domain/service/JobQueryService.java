package com.tracker.jobtracker.webapp.domain.service;

import com.tracker.jobtracker.webapp.domain.model.Job;
import java.util.List;

public interface JobQueryService {

    List<Job> findByCompanyNameContainingIgnoreCase(String companyName);

    List<Job> findByPosition(String position);

    List<Job> findByPointOfContactId(String pointOfContactId);

    boolean existsByCompanyNameAndPosition(String companyName, String position);
}
