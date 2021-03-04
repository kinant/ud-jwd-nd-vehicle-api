package com.udacity.jwdnd.p2.pricingservice;

import com.udacity.jwdnd.p2.pricingservice.domain.price.PriceRepository;
import com.udacity.jwdnd.p2.pricingservice.service.PricingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PricingServiceApplication implements CommandLineRunner {

    @Autowired
    private PriceRepository priceRepository;

    public static void main(String[] args) {
        SpringApplication.run(PricingServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for(int i = 1; i < 20; i++){
            priceRepository.save( PricingService.getPrice((long) i));
        }
    }
}
