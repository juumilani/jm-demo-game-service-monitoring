package com.example.demo.config;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * Configuration class for application-wide metrics.
 *
 * Adds tags to all metrics for easier identification
 * in monitoring systems.
 */
@Configuration
public class MetricsConfig {

    private final MeterRegistry meterRegistry;

    public MetricsConfig(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }

    @PostConstruct
    public void init() {
        meterRegistry.config().commonTags("application", "game-service-demo");
    }
}