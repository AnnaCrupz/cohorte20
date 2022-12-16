package com.example.demo.myappdbjwt.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
public class PruebaController {
@GetMapping("/mensaje")
  public ResponseEntity<?> getMensaje(){
	Map<String, String> mensaje=new HashMap<>();
	
	mensaje.put("contenido","Hola Mundo");
	return ResponseEntity.ok(mensaje);
}
}
