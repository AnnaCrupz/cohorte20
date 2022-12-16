package com.egeneration.vhfc.myappDB.services;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egeneration.vhfc.myappDB.models.UsuarioModel;
import com.egeneration.vhfc.myappDB.repositories.UsuarioRepository;

@Service
public class UsuarioServices {
	@Autowired
UsuarioRepository usuarioRepositorio;
	public ArrayList <UsuarioModel> obtenerUsuarios() {
		return  (ArrayList<UsuarioModel>) usuarioRepositorio.findAll();
		
	}
	public UsuarioModel guardarUsuario(UsuarioModel usuario) {
		return usuarioRepositorio.save(usuario);
	}
	
	public ArrayList  <UsuarioModel>obtenerPorPrioridad(Integer prioridad){
		return usuarioRepositorio.findByPrioridad(prioridad);
	}
	public Optional<UsuarioModel> obtenerPorId(long id){
		return usuarioRepositorio.findById(id);
	}
	//public boolean eliminarUsuario(Long id) {
	 //usuarioRepositorio.deleteById(id);
	 //return true;
	//}
	//public boolean eliminarPorId(Long id) {
		//if (usuarioRepositorio.findById(id).isPresent()) {
			//usuarioRepositorio.deleteById(id);
			//return true;
		//}else {
			//return false;
		//}
	
	public boolean eliminarUsuario(Long id) {
		try {
			usuarioRepositorio.deleteById(id);
			return true;
			
		} catch (Exception e) {
			return false;
		}
		 
	}
	
	

}
