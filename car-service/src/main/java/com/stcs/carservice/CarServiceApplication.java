package com.stcs.carservice;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@EnableEurekaClient
@SpringBootApplication
public class CarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarServiceApplication.class, args);
	}

}

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
class Car {
    @Id
    private UUID id;
    private String name;
    private LocalDate releaseDate;
}
