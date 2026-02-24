package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class csecontroller {
   @GetMapping("/home")
   public String rocks() {
	   return "Welcome to Jenkins AWS";
	   
   }
   
   @GetMapping("/cse")
   public String cse() {
	   return "Welcome to Jenkins AWS";
	   
   }
}
