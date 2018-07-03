/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursomc.services;

import br.com.cursomc.domain.Pedido;
import br.com.cursomc.repositorories.PedidoRepository;
import br.com.cursomc.services.exceptions.ObjectNotFoundException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Danilo
 */
@Service
public class PedidoService {
    
    @Autowired
    private PedidoRepository repo;
    
      public Pedido find(Integer id) {  
        Optional<Pedido> obj = repo.findById(id);  
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName())); 
    
      }
}
