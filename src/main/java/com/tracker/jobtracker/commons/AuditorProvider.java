package com.tracker.jobtracker.commons;

import java.util.Optional;

public final class AuditorProvider {

    private static AuditorSupplier supplier = Optional::empty;

    private AuditorProvider() {
    }

    public static void setSupplier(AuditorSupplier supplier) {
        AuditorProvider.supplier = supplier;
    }

    public static Optional<String> getCurrentAuditor() {
        return supplier.getCurrentAuditor();
    }

}
