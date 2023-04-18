package br.unibh.sdm.backend_pessoas.entidades;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;


public class Servico {

    private String barbeiroId;
    private String pessoaId;
    private String descricao;
    private Decimal preco;

    public Servico() {
    }
    
}
