package br.edu.univas.si8.es4.state.conexao;

public interface EstadoConexao {

	public void conectar(Conexao conexao);

	public void desconectar(Conexao conexao);

	public void enviar(String mensagem, Conexao conexao);

	public String receber(Conexao conexao);

}
