/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursomc.services;

import br.com.cursomc.domain.Categoria;
import br.com.cursomc.repositorories.CategoriaRepository;
import br.com.cursomc.services.exceptions.ObjectNotFoundException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Danilo
 */
@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository repo;
    
      public Categoria find(Integer id) {  
        Optional<Categoria> obj = repo.findById(id);  
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName())); 
    
      }
}
