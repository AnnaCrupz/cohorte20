package com.example.demo.myappdb.repositories;

import com.example.demo.myappdb.models.*;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository 	
public interface UsuarioRepository extends CrudRepository <UsuarioModel,Long>{
	public ArrayList<UsuarioModel>findByPrioridad(Integer prioridad);
}
