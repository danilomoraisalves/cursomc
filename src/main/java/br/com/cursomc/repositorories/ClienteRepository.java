/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursomc.repositorories;

import br.com.cursomc.domain.Cliente;
import br.com.cursomc.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Danilo
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer>{
    
  
}
