package org.springcore.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Tuna getTuna(){
        return new Tuna();
    }

    @Bean
    public Sample getSample(){
        Sample sample = new Sample(getTuna());
        return sample;
    }
}
