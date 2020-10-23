package org.acme.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Ticket extends PanacheEntity {
    @Id
    public Integer numero;
    public  Enum<Tipo> tipo;
    public String titulo;
    public String descricao;
    public String fechadopor;
    public Date dataAbertura;
    public Date dataFechamento;
    public String abertoPor;
    public String statusSla;
    public String grupo;
    public Date dataExpiracao;
    public String servico;
    public String category;
    public String subcategory;
    public String productType;
    public string problemType;
    public String designado;


}