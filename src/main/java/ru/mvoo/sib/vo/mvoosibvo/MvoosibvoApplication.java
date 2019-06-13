package ru.mvoo.sib.vo.mvoosibvo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class MvoosibvoApplication {
	public static void main(String[] args) {
		SpringApplication.run(MvoosibvoApplication.class, args);
	}
}
