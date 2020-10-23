package org.acme.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="censored")
public class Ticket extends PanacheEntity {
    @Column(name="NUMERO")
    public Integer numero;
    @Column(name="TIPO")
    public  String tipo;
    @Column(name="TITULO")
    public String titulo;
    @Column(name="DESCRICAO")
    public String descricao;
    @Column(name="FECHADOPOR")
    public String fechadopor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="DATAABERTURA")
    public Date dataAbertura;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="DATAFECHAMENTO")
    public Date dataFechamento;
    @Column(name="ABERTOPOR")
    public String abertoPor;
    @Column(name="STATUSSLA")
    public String statusSla;
    @Column(name="GRUPO")
    public String grupo;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="DATAEXPIRACAO")
    public Date dataExpiracao;
    @Column(name="SERVICO")
    public String servico;
    @Column(name="CATEGORY")
    public String category;
    @Column(name="subcategory")
    public String subcategory;
    @Column(name="PRODUCT_TYPE")
    public String productType;
    @Column(name="PROBLEM_TYPE")
    public String problemType;
    @Column(name="DESIGNADO")
    public String designado;


}
