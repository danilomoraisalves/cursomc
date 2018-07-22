/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursomc.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Danilo
 */
@Entity
public class ItemPedido implements Serializable{
    

    @JsonIgnore
    @EmbeddedId
    private ItemPedidoPK id = new ItemPedidoPK();
    
    private double desconto;
    private Integer quantidade;
    private double preco;

    public ItemPedido() {
    }

    public ItemPedido(Pedido pedido, Produto produto, double desconto, Integer quantidade, double preco) {
        super();
        id.setPedido(pedido);
        id.setProduto(produto);
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    public double getSubTotal(){
      return (preco - desconto) * quantidade;
    }
    
    public void setPedido(Pedido pedido) {
        id.setPedido(pedido);
    }
    
    public void setProduto(Produto produto) {
        id.setProduto(produto);
    }

    public ItemPedidoPK getId() {
        return id;
    }

    public void setId(ItemPedidoPK id) {
        this.id = id;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @JsonIgnore
    public Pedido getPedido(){
      return id.getPedido();
    }
    
    
    public Produto getProduto(){
      return id.getProduto();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemPedido other = (ItemPedido) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getProduto().getNome());
        builder.append(", Qte: ");
        builder.append(getQuantidade());
        builder.append(", Preço Unitário: ");
        builder.append(getPreco());
        builder.append(", Subtotal: ");
        builder.append(getSubTotal());
        builder.append("\n");
        return builder.toString();
    }
    
    
    
}
