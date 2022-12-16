package com.example.demo.myappdb.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.example.demo.myappdb.models.UsuarioModel;
import com.example.demo.myappdb.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepositorio;
	
	public ArrayList<UsuarioModel> obtenerUsuarios() {
		return (ArrayList<UsuarioModel>) usuarioRepositorio.findAll();
	}
	public UsuarioModel guardarUsuario(UsuarioModel usuario) {
		return usuarioRepositorio.save(usuario);
	}
	public ArrayList<UsuarioModel> obtenerPorPrioridad(Integer prioridad) {
		return usuarioRepositorio.findByPrioridad(prioridad);
	}

	public Optional<UsuarioModel> obtenerPorId(long id) {
		return usuarioRepositorio.findById(id);
	}
	public boolean eliminarUsuario(Long id) {
		if(usuarioRepositorio.findById(id) !=null) {
		usuarioRepositorio.deleteById(id);
		return true;}
		else {
			return false;
		}
	}

}
