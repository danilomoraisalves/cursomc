/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursomc.services;

import br.com.cursomc.repositorories.CategoriaRepository;
import br.com.cursomc.repositorories.CidadeRepository;
import br.com.cursomc.repositorories.EstadoRepository;
import br.com.cursomc.repositorories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Danilo
 */
@Service
public class DBService {
    
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CidadeRepository cidadeRepository;

    @Autowired
    private EstadoRepository estadoRepository;
    
    public void instatiateTestDatabase()
    {
        
        //       Categoria cat1 = new Categoria(null, "Informatica");
//       Categoria cat2 = new Categoria(null, "Escritorio");
//       
//       Produto p1 = new Produto(null, "Computador",2000.00);
//       Produto p2 = new Produto(null, "Impressora",800.00);
//       Produto p3 = new Produto(null, "Mouse",80.00);
//       
//       cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
//       cat2.getProdutos().addAll(Arrays.asList(p2));
//       
//       p1.getCategorias().addAll(Arrays.asList(cat1));
//       p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
//       p3.getCategorias().addAll(Arrays.asList(cat1));
//       
//       categoriaRepository.saveAll(Arrays.asList(cat1, cat2)); 
//       produtoRepository.saveAll(Arrays.asList(p1,p2,p3)); 
//       
//       
//        Estado est1 = new Estado(null, "Minas Gerais"); 
//        Estado est2 = new Estado(null, "São Paulo");
//
//        Cidade c1 = new Cidade(null, "Uberlândia", est1);
//
//        Cidade c2 = new Cidade(null, "São Paulo", est2);
//
//        Cidade c3 = new Cidade(null, "Campinas", est2);
//
//        est1.getCidades().addAll(Arrays.asList(c1));
//
//        est2.getCidades().addAll(Arrays.asList(c2, c3));
//
//        estadoRepository.saveAll(Arrays.asList(est1, est2));
//
//        cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));

    
    }
    
}
