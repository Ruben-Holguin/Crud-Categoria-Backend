package com.example.categoria.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.categoria.entity.Categoria;
import com.example.categoria.repository.CategoriaRepository;
import com.example.categoria.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	public Categoria create(Categoria c) {
		// TODO Auto-generated method stub
		return categoriaRepository.save(c);
	}

	@Override
	public Categoria update(Categoria c) {
		// TODO Auto-generated method stub
		return categoriaRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		categoriaRepository.deleteById(id);
	}

	@Override
	public Optional<Categoria> read(Long id) {
		// TODO Auto-generated method stub
		return categoriaRepository.findById(id);
	}

	@Override
	public List<Categoria> readAll() {
		// TODO Auto-generated method stub
		return categoriaRepository.findAll();
	}

}
