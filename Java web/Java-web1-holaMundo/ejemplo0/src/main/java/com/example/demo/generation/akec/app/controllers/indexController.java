package com.example.demo.generation.akec.app.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ControllerAdvice;
@ControllerAdvice
@RequestMapping("/")
public class indexController {
@RequestMapping(value="2", method= RequestMethod.GET)
public String getUserForm() {
	return "index";
}

}
