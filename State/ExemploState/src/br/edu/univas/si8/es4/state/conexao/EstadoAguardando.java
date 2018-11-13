package br.edu.univas.si8.es4.state.conexao;

public class EstadoAguardando implements EstadoConexao {

	@Override
	public void conectar(Conexao conexao) {
		System.err.println("Estado inv�lido!!!");
	}

	@Override
	public void desconectar(Conexao conexao) {
		System.err.println("Estado inv�lido!!!");
	}

	@Override
	public void enviar(String mensagem, Conexao conexao) {
		System.err.println("Estado inv�lido!!!");
	}

	@Override
	public String receber(Conexao conexao) {
		System.out.println("Recebendo mensagem...");
		conexao.setEstado(new EstadoConectado());
		return "mensagem...";
	}

}
