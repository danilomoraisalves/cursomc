/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursomc.resources.utils;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author Danilo
 */
public class URL {
    
    public static String decodeParam(String s) {
        try {
            return URLDecoder.decode(s, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            return "";
        }
    }
    
    public static List<Integer> decodeIntList(String s)
    {
      String[] vet = s.split(",");
      List<Integer> list = new ArrayList<>();
      for(int i=0;i<vet.length;i++)
      {
        list.add(Integer.parseInt(vet[i]));
      }
      
      //return Arrays.asList(s.split(",")).stream().map(x -> Integer.parseInt(x)).collect(Collectors.toList());
      return list;
    }
  
    
}