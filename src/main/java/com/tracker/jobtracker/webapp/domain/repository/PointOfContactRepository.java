package com.tracker.jobtracker.webapp.domain.repository;

import com.tracker.jobtracker.webapp.domain.model.PointOfContact;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointOfContactRepository extends JpaRepository<PointOfContact, String> {

    List<PointOfContact> findByLastNameContainingIgnoreCase(String lastName);

    List<PointOfContact> findByContactNo(String contactNo);
}
