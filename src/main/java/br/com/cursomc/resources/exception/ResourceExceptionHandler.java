/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursomc.resources.exception;

import br.com.cursomc.services.exceptions.DataIntegrityException;
import br.com.cursomc.services.exceptions.ObjectNotFoundException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author Danilo
 */
@ControllerAdvice
public class ResourceExceptionHandler {
    
    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandarError> objectNotFound(ObjectNotFoundException e,HttpServletRequest request)
    {
       StandarError err = new StandarError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
       return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }
    
    @ExceptionHandler(DataIntegrityException.class)
    public ResponseEntity<StandarError> dataIntegrity(DataIntegrityException e,HttpServletRequest request)
    {
       StandarError err = new StandarError(HttpStatus.BAD_REQUEST.value(), e.getMessage(), System.currentTimeMillis());
       return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
    }
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<StandarError> validation(MethodArgumentNotValidException e,HttpServletRequest request)
    {
       ValidationError err = new ValidationError(HttpStatus.BAD_REQUEST.value(), "Erro de validação", System.currentTimeMillis());
       
       for(FieldError x : e.getBindingResult().getFieldErrors())
       {
          err.addError(x.getField(), x.getDefaultMessage());
       }
       
       return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
    }
    
}
