package com.example.demo.myappdbjwt.controllers;

import java.security.Security;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import ch.qos.logback.classic.Logger;



@RestController
@RequestMapping("")
public class PruebaController {
	private static final Logger logger =(Logger)LoggerFactory.getLogger(PruebaController.class);
	
	
@GetMapping("/mensaje")
  public ResponseEntity<?> getMensaje(){
	var auth= SecurityContextHolder.getContext().getAuthentication();
	logger.info("Datos usuario {}",auth.getPrincipal());
	logger.info("permisos usuario", auth.getAuthorities());
	logger.info("estado usuario", auth.isAuthenticated());
	Map<String, String> mensaje=new HashMap<>();
	
	mensaje.put("contenido","Hola Mundo");
	return ResponseEntity.ok(mensaje);
}
@GetMapping("/publico")
public ResponseEntity<?> getMensajePublico(){
	var auth= SecurityContextHolder.getContext().getAuthentication();
	logger.info("Datos usuario {}",auth.getPrincipal());
	logger.info("permisos usuario", auth.getAuthorities());
	logger.info("estado usuario", auth.isAuthenticated());
	Map<String, String> mensaje=new HashMap<>();
	
	mensaje.put("contenido","Hola mi querido publico JWT");
	return ResponseEntity.ok(mensaje);
}
@GetMapping("/admin")
public ResponseEntity<?> getMensajeAdmin(){
	var auth= SecurityContextHolder.getContext().getAuthentication();
	logger.info("Datos usuario {}",auth.getPrincipal());
	logger.info("permisos usuario", auth.getAuthorities());
	logger.info("estado usuario", auth.isAuthenticated());
	Map<String, String> mensaje=new HashMap<>();
	
	mensaje.put("contenido","Hola mi querido admin JWT");
	return ResponseEntity.ok(mensaje);
}
}
