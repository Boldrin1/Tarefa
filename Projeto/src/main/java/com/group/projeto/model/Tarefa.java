package com.group.projeto.model;

import java.sql.Date;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class Tarefa {
    private String titulo;
    private String descricao;
    private Date dataCriacao;
    private Date prazo;
    @Enumerated(EnumType.STRING)
    private Status status;
    
    public void criarTarefa() {
    	return;
    }
    
    public void excluirTarefa() {
    	return;
    }
    
    public void atualizarTarefa() {
    	return;
    }
    
    
    

	public Tarefa(String titulo, String descricao, Date dataCriacao, Date prazo, Status status) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataCriacao = dataCriacao;
		this.prazo = prazo;
		this.status = status;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getPrazo() {
		return prazo;
	}

	public void setPrazo(Date prazo) {
		this.prazo = prazo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
    
    
}
