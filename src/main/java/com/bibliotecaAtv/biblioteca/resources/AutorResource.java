package com.bibliotecaAtv.biblioteca.resources;

import com.bibliotecaAtv.biblioteca.domains.Autor;
import com.bibliotecaAtv.biblioteca.domains.dtos.AutorDTO;
import com.bibliotecaAtv.biblioteca.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/autor")
public class AutorResource {

    @Autowired
    private AutorService autorService;

    @GetMapping
    public ResponseEntity<List<AutorDTO>> findAll(){
        return ResponseEntity.ok().body(autorService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<AutorDTO> findbyId(@PathVariable Long id){
        Autor obj = this.autorService.findbyId(id);
        return ResponseEntity.ok().body(new AutorDTO(obj));
    }

}
