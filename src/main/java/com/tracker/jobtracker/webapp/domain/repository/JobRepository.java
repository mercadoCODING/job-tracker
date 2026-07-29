package com.tracker.jobtracker.webapp.domain.repository;

import com.tracker.jobtracker.webapp.domain.model.Job;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, String> {

    List<Job> findByCompanyNameContainingIgnoreCase(String companyName);

    List<Job> findByPosition(String position);

    List<Job> findByPointOfContactId(String pointOfContactId);

    boolean existsByCompanyNameAndPosition(String companyName, String position);
}
