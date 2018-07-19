/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursomc.repositorories;

import br.com.cursomc.domain.Categoria;
import br.com.cursomc.domain.Produto;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Danilo
 */
@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Integer>{
  
   
   @Transactional(readOnly=true)
   @Query("SELECT DISTINCT obj FROM Produto obj INNER JOIN obj.categorias cat WHERE obj.nome LIKE %:nome% AND cat IN :categorias")  
   Page<Produto> search(
           @Param("nome") String nome,
           @Param("categorias") List<Categoria> categorias,
           Pageable pageRequest);   
   
   @Transactional(readOnly=true)
   Page<Produto> findDistinctByNomeContainingAndCategoriasIn(
           String nome,
           List<Categoria> categorias,
           Pageable pageRequest);   
  
}
