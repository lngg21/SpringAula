package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;





import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

@Configuration
public class Configuration {
    
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
