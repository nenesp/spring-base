package br.com.itau.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"br.com.itau.rest"})
@SpringBootApplication
public class BoletoApp {

    public static void main(String[] args) {
        SpringApplication.run(BoletoApp.class, args);
    }

}
