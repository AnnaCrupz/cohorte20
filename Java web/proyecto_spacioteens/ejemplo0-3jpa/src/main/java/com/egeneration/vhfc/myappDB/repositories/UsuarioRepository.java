package com.egeneration.vhfc.myappDB.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.egeneration.vhfc.myappDB.models.UsuarioModel;

@Repository
public interface UsuarioRepository extends  CrudRepository<UsuarioModel, Long> {
  public ArrayList<UsuarioModel>findByPrioridad(Integer prioridad);
}
