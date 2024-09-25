package com.group.projeto.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository {

	Object findById(Long id);

}
