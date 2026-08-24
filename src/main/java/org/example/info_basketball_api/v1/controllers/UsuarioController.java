package org.example.info_basketball_api.v1.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {
    //  TODO: TODO ESTO SERA MODIFICADO CUANDO TERMINE MIS PRUEBAS
    private List<String> usuarios = new ArrayList<>(
            List.of("Ana", "Maria", "Julieta", "Rachell")
    );

    @GetMapping
    public List<String> obtenerUsuario(){
        return usuarios;
    }

    @PostMapping
    public String agregarUsuario(@RequestBody String usuario){
        usuarios.add(usuario);
        return usuario;
    }
}
