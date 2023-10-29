package com.rabin.ff4jproject.service;

import com.rabin.ff4jproject.config.FF4jConfig;
import lombok.extern.slf4j.Slf4j;
import org.ff4j.FF4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FF4jService {

    @Autowired
    private FF4j ff4j;



    @Bean
    public CommandLineRunner commandLineRunner(){
        return args -> {
            while(true) {
                if (ff4j.check(FF4jConfig.HELLO_FEATURE)) {
                    log.info("hello rabin");
                } else {
                    log.info("hello sabin");
                }
                Thread.sleep(5000);
            }
        };
    }
}
