package br.edu.univas.si8.es4.state.conexao;

public class EstadoDesconectado implements EstadoConexao {

	@Override
	public void conectar(Conexao conexao) {
		System.out.println("Estabelecendo conexão...");
		conexao.setEstado(new EstadoConectado());
	}

	@Override
	public void desconectar(Conexao conexao) {
		System.err.println("Estado inválido!!!");
	}

	@Override
	public void enviar(String mensagem, Conexao conexao) {
		System.err.println("Estado inválido!!!");
	}

	@Override
	public String receber(Conexao conexao) {
		System.err.println("Estado inválido!!!");
		return null;
	}

}
