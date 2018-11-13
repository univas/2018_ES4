package br.edu.univas.si8.es4.state.conexao;

public class EstadoConectado implements EstadoConexao {

	@Override
	public void conectar(Conexao conexao) {
		System.err.println("Estado inválido!!!");
	}

	@Override
	public void desconectar(Conexao conexao) {
		System.out.println("Desconectando...");
		conexao.setEstado(new EstadoDesconectado());
	}

	@Override
	public void enviar(String mensagem, Conexao conexao) {
		System.out.println("Enviando mensagem...");
		conexao.setEstado(new EstadoAguardando());
	}

	@Override
	public String receber(Conexao conexao) {
		System.err.println("Estado inválido!!!");
		return null;
	}

}
