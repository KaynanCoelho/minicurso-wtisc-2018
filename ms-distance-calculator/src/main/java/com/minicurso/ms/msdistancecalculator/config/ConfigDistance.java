package com.minicurso.ms.msdistancecalculator.config;

import com.minicurso.ms.msdistancecalculator.commons.DistanceCalculatorType;
import com.minicurso.ms.msdistancecalculator.services.DistanceCalculator;
import com.minicurso.ms.msdistancecalculator.services.HaversineDistanceCalculator;
import com.minicurso.ms.msdistancecalculator.services.OdometerDistanceCalculator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigDistance {

    @Value("${distance-calculator.algorithm:HARVESINE}")
    private DistanceCalculatorType type;

    @Bean
    public DistanceCalculator getDistanceCalculator() {
        if (type.equals(DistanceCalculatorType.HARVESINE)) {
            return new HaversineDistanceCalculator();
        } else {
            return new OdometerDistanceCalculator();
        }
    }
}
