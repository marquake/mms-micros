package com.mms.app_config_client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class ControllerApp {

    @Autowired
    UserClient userClient;

    @Value("${micro.name}")
    String microName;

    @Value("${ip.sapserver}")
    String ipServer;

    @Value("${ip.mail}")
    String ipMail;

    @GetMapping
    public String mensaje(){

        System.out.println("Llamando a User...");
        System.out.println("userClient.getMensajeUser(): " + userClient.getMensajeUser());

        return  "* microName: " + microName + "<br/>" +
                "* ipServer: " + ipServer + "<br/>" +
                "* ipMail: " + ipMail + "<br/>";
    }
}