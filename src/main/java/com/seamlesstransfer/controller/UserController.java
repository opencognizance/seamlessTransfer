package com.seamlesstransfer.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
   @GetMapping("/user")
   public String user(@AuthenticationPrincipal UserDetails userDetails) {
	   return "user";
   }
}
