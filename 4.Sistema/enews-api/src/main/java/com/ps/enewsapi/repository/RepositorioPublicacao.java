package com.ps.enewsapi.repository;

import com.ps.enewsapi.model.Publicacao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioPublicacao extends CrudRepository<Publicacao,Long> {
    @Query("select p from Publicacao p where p.titulo = :titulo")
    int findBytitulo(String titulo);
}
