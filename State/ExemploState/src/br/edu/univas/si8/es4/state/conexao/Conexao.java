package br.edu.univas.si8.es4.state.conexao;

public class Conexao {

	private EstadoConexao estado;

	public Conexao() {
		estado = new EstadoDesconectado();
	}

	public void conectar() {
		estado.conectar(this);
	}

	public void desconectar() {
		estado.desconectar(this);
	}

	public void enviar(String mensagem) {
		estado.enviar(mensagem, this);
	}

	public String receber() {
		return estado.receber(this);
	}

	public void setEstado(EstadoConexao estado) {
		this.estado = estado;
	}
}
