package com.babl.BABL;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BablApplication {

	public static void main(String[] args) {
		SpringApplication.run(BablApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
			System.out.println("Beans: ");
			String[] names = ctx.getBeanDefinitionNames();
			Arrays.sort(names);
			for (String bName : names) {
				System.out.println(bName);
			}
		};
	}
}
