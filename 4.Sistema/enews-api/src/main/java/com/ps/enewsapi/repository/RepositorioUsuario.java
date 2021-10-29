package com.ps.enewsapi.repository;

import com.ps.enewsapi.model.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import java.util.Optional;


public interface RepositorioUsuario extends CrudRepository<Usuario,Long> {
    @Override
    Optional<Usuario> findById(Long id);

    @Query("select count(u) from Usuario u where u.email = :email")
    int findByEmail(String email);

    @Query("select count(u) from Usuario u where u.email = :email and u.senha = :senha")
    int findByEmailAndSenha(String email,String senha);
}
