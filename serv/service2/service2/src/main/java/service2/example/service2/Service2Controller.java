/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service2.example.service2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author kanan
 */

@RestController
public class Service2Controller {


@GetMapping("/serv2")
public String serv2(){
String url ="http://localhost:8080/serv1";
RestTemplate restTemplate = new RestTemplate();
String result =restTemplate.getForObject(url, String.class);
return result;
} 
    
}
