package com.UserApi.demo.DataBases;

import com.UserApi.demo.Models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbaLoader {

    public static final Logger LOGGER = LoggerFactory.getLogger(DbaLoader.class);

    @Bean
    public CommandLineRunner innitUserDataBase(UserDBA repository){
        return args -> {
            LOGGER.info("User added: " + repository.save(
                    new User("Tupac", "Ocampo", "tupacUserName", "Tupac@gmail.com" )
            ));

            LOGGER.info("User added: " + repository.save(
                    new User("Franco", "Balich", "FrancoUserName", "Franco@gmail.com" )
            ));

        };
    }
}
