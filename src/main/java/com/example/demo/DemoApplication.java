package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        GreetingWebClient gwc = new GreetingWebClient();
        System.out.println(gwc.getResult());
    }


    /*@Bean
    public CommandLineRunner demo(StudentRepository universityRepository,StudentRepository highSchoolRepository) {
        return (args) -> {
            universityRepository.save(new Student("Adrian","Kozłowski"));
            universityRepository.save(new Student("Adam","Kozioł"));
            highSchoolRepository.save(new Student("Adrian","Kozłowski"));

        };

        }*/

}

