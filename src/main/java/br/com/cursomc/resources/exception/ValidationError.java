/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursomc.resources.exception;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danilo
 */
public class ValidationError extends StandarError{
    
    private List<FieldMessage> errors = new ArrayList<>();
    
    public ValidationError(Integer status, String msg, Long timeStamp) {
        super(status, msg, timeStamp);
    }

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String fieldName, String message) {
        errors.add(new FieldMessage(fieldName, message));
    }
    
    
    
}
