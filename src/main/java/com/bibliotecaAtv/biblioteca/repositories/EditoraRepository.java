package com.bibliotecaAtv.biblioteca.repositories;


import com.bibliotecaAtv.biblioteca.domains.Editora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditoraRepository extends JpaRepository<Editora,Integer> {
}

