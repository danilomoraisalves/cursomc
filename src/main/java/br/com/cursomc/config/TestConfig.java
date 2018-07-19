/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursomc.config;

import br.com.cursomc.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author Danilo
 */
@Configuration
@Profile("test")
public class TestConfig {

    @Autowired
    private DBService dbService;

    public boolean instantiateDatabase() {
        dbService.instatiateTestDatabase();
        return true;
    }

}
