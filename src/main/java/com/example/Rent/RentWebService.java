package com.example.Rent;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RentWebService {
@GetMapping("/")
public String hello() {
return "Bonjour";
}
}