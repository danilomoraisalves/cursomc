/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursomc.services;

import br.com.cursomc.domain.Categoria;
import br.com.cursomc.domain.Produto;
import br.com.cursomc.repositorories.CategoriaRepository;
import br.com.cursomc.repositorories.ProdutoRepository;
import br.com.cursomc.services.exceptions.ObjectNotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 *
 * @author Danilo
 */
@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository repo;
    
    @Autowired
    private CategoriaRepository categoriaRepository;
    
      public Produto find(Integer id) {  
        Optional<Produto> obj = repo.findById(id);  
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Produto.class.getName())); 
    
      }
      
      public Page<Produto> search(String nome, List<Integer> ids,Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction),
                orderBy);
        List<Categoria> categorias = categoriaRepository.findAllById(ids);
        return repo.findDistinctByNomeContainingAndCategoriasIn(nome, categorias, pageRequest);
      }
         
      
}
