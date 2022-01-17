/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service1Jdbc;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kanan
 */

@RestController
public class ServiceJdbcController {

    JdbcTemplate jdbcTemplate;

@GetMapping("/serv1Jdbc")
public String serv1Jdbc(){
   String result = (String) jdbcTemplate.queryForObject("Select 'service1 jdbc running' from dual", new BeanPropertyRowMapper(String.class));
return result;
}   
}
