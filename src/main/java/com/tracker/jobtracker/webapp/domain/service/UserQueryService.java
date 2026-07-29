package com.tracker.jobtracker.webapp.domain.service;

import com.tracker.jobtracker.webapp.domain.model.User;
import java.util.Optional;

public interface UserQueryService {

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

}
