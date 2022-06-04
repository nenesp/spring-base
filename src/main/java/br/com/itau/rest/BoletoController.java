package br.com.itau.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoletoController {

    @RequestMapping("/")
    public String inicial(){

        return "<center><img src='https://logospng.org/download/itau/logo-itau-256.png'> </img><p>Bem vindo a baixa plataforma ;)</p></center>";
    }

}
