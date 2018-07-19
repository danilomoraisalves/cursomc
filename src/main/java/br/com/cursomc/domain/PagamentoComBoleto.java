/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursomc.domain;

import br.com.cursomc.domain.enums.EstadoPagamento;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;

/**
 *
 * @author Danilo
 */
@Entity
@JsonTypeName("pagamentoComBoleto") 
public class PagamentoComBoleto extends Pagamento{
  
   @JsonFormat(pattern = "dd/MM/yyyy") 
   private Date dataVencimento;
   
   @JsonFormat(pattern = "dd/MM/yyyy")
   private Date dataPagamento;

    public PagamentoComBoleto() {
    }

    public PagamentoComBoleto(Date dataVencimento, Date dataPagamento) {
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }

    public PagamentoComBoleto(Date dataVencimento, Date dataPagamento, Integer id, EstadoPagamento estado, Pedido pedido) {
        super(id, estado, pedido);
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.dataVencimento);
        hash = 43 * hash + Objects.hashCode(this.dataPagamento);
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
        final PagamentoComBoleto other = (PagamentoComBoleto) obj;
        if (!Objects.equals(this.dataVencimento, other.dataVencimento)) {
            return false;
        }
        if (!Objects.equals(this.dataPagamento, other.dataPagamento)) {
            return false;
        }
        return true;
    }

   
   
}
