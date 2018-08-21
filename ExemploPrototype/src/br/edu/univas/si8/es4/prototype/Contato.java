package br.edu.univas.si8.es4.prototype;

import java.util.Date;

public class Contato implements Cloneable {

	private String nome;
	private String email;
	private Date nascimento;
	private String cidade;
	private String estado;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ",\n email=" + email + ",\n nascimento=" + nascimento + ",\n cidade=" + cidade
				+ ",\n estado=" + estado + "]";
	}

	@Override
	public Contato clone() {
		Contato novo = null;
		try {
			novo = (Contato) super.clone();
			novo.nascimento = (Date) this.nascimento.clone();
		} catch (CloneNotSupportedException e) {
			// Nunca vai acontecer!!!
		}
		return novo;
	}

}
