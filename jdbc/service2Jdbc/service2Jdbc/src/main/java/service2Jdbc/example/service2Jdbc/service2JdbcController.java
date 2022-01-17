/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service2Jdbc.example.service2Jdbc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author kanan
 */
@RestController
public class service2JdbcController {

@GetMapping("/serv2Jdbc")
public String serv2Jdbc(){
String url ="http://localhost:8080/serv1Jdbc";
RestTemplate restTemplate = new RestTemplate();
String result =restTemplate.getForObject(url, String.class);
return result;
}  
}
