package com.tracker.jobtracker.webapp.domain.service;

import com.tracker.jobtracker.webapp.domain.model.Job;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class JobQueryServiceImpl implements JobQueryService {

    private final JobQueryService jobQueryService;

    public JobQueryServiceImpl(JobQueryService jobQueryService) {
        this.jobQueryService = jobQueryService;
    }

    @Override
    public List<Job> findByCompanyNameContainingIgnoreCase(String companyName) {
        return jobQueryService.findByCompanyNameContainingIgnoreCase(companyName);
    }

    @Override
    public List<Job> findByPosition(String position) {
        return jobQueryService.findByPosition(position);
    }

    @Override
    public List<Job> findByPointOfContactId(String pointOfContactId) {
        return jobQueryService.findByPointOfContactId(pointOfContactId);
    }

    @Override
    public boolean existsByCompanyNameAndPosition(String companyName, String position) {
        return jobQueryService.existsByCompanyNameAndPosition(companyName, position);
    }
}
