package com.tracker.jobtracker.webapp.domain.service;

import com.tracker.jobtracker.webapp.domain.model.PointOfContact;
import com.tracker.jobtracker.webapp.domain.repository.PointOfContactRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PointOfContactQueryServiceImpl implements PointOfContactQueryService {

    private final PointOfContactRepository pointOfContactRepository;

    public PointOfContactQueryServiceImpl(PointOfContactRepository pointOfContactRepository) {
        this.pointOfContactRepository = pointOfContactRepository;
    }


    @Override
    public List<PointOfContact> findByLastNameContainingIgnoreCase(String lastName) {
        return pointOfContactRepository.findByLastNameContainingIgnoreCase(lastName);
    }

    @Override
    public List<PointOfContact> findByContactNo(String contactNo) {
        return pointOfContactRepository.findByContactNo(contactNo);
    }
}
