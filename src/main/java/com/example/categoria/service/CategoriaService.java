package com.example.categoria.service;

import java.util.List;
import java.util.Optional;

import com.example.categoria.entity.Categoria;

public interface CategoriaService {
	Categoria create(Categoria c);
	Categoria update(Categoria c);
	void delete(Long id);
	Optional<Categoria> read(Long id);
	List<Categoria> readAll();
}
