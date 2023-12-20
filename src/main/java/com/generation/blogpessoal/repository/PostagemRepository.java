package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.blogpessoal.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	public List <Postagem> findAllByTituloContainingIgnoreCase (@Param("titulo") String titulo);
}




/*Uma interface em Java é uma Classe Abstrata (uma Classe que serve de modelo para outras Classes),
composta somente por Métodos abstratos. E como tal, obviamente não pode ser instanciada, ou seja, 
ela só contém as declarações dos Métodos e constantes, nenhuma implementação, apenas as assinaturas dos
Métodos, que serão implementados em uma Classe.*/