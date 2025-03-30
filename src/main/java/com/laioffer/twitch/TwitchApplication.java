package com.laioffer.twitch;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class TwitchApplication {


    public static void main(String[] args) {
        SpringApplication.run(TwitchApplication.class, args);
    }


}
