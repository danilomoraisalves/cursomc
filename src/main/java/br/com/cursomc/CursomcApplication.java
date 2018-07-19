package br.com.cursomc;

import br.com.cursomc.domain.Categoria;
import br.com.cursomc.domain.Cidade;
import br.com.cursomc.domain.Estado;
import br.com.cursomc.domain.Produto;
import br.com.cursomc.repositorories.CategoriaRepository;
import br.com.cursomc.repositorories.CidadeRepository;
import br.com.cursomc.repositorories.EstadoRepository;
import br.com.cursomc.repositorories.ProdutoRepository;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CursomcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
