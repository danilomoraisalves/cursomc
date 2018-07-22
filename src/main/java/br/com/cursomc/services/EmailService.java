/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursomc.services;

import br.com.cursomc.domain.Cliente;
import br.com.cursomc.domain.Pedido;
import org.springframework.mail.SimpleMailMessage;

/**
 *
 * @author Danilo
 */
public interface EmailService {
    
    void sendOrderConfirmationEmail(Pedido obj);

    void sendEmail(SimpleMailMessage msg);

    void sendNewPasswordEmail(Cliente cliente, String newPass);
    
}
