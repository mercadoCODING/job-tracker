package com.tracker.jobtracker.commons;

import java.util.Optional;

@FunctionalInterface
public interface AuditorSupplier {
    Optional<String> getCurrentAuditor();
}
