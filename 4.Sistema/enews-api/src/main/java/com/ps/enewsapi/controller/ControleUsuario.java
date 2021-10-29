package com.ps.enewsapi.controller;

import com.ps.enewsapi.model.Usuario;
import com.ps.enewsapi.repository.RepositorioUsuario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuario")
public class ControleUsuario{
    private final RepositorioUsuario repositorioUsuario;

    public ControleUsuario(RepositorioUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }
    @GetMapping
    public String teste(){
        return "ola mundo";
    }
    @PutMapping
    public Long put(@RequestBody Usuario usuario) {
        int a = repositorioUsuario.findByEmail(usuario.getEmail());
        if(a > 0){
            System.out.println("exessão");
        }
        repositorioUsuario.save(usuario);
        return 0L;
    }
    @PostMapping("/login")
    public boolean login(@RequestBody Usuario usuario){
        int a = repositorioUsuario.findByEmailAndSenha(usuario.getEmail(),usuario.getSenha());
        return a != 0;
    }

}
