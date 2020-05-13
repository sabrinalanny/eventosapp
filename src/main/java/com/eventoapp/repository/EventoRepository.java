package com.eventoapp.repository;

import com.eventoapp.models.Evento;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
public interface EventoRepository extends CrudRepository<Evento,String>{
	Evento findByCodigo(long codigo);
}
