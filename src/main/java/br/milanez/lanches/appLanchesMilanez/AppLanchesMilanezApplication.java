package br.milanez.lanches.appLanchesMilanez;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppLanchesMilanezApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppLanchesMilanezApplication.class, args);
		
		System.out.println(Arrays.toString(args));
	}

}
