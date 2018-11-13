package br.edu.univas.si8.es4.state.conexao;

public class Runner {

	public static void main(String[] args) {
		Conexao conexao = new Conexao();
		
		// cenários de sucesso:
		conexao.conectar();
		conexao.enviar("aaa");
		conexao.receber();
		conexao.desconectar();
		
		sleep();
		
		// erros para o estado desconectado:
		conexao.desconectar();
		conexao.enviar("aaa");
		conexao.receber();
		
		sleep();
		
		// indo para o estado conectado
		conexao.conectar();
		
		sleep();
		
		// erros para o estado conectado:
		conexao.conectar();
		conexao.receber();
		
		sleep();
		
		// indo para o estado aguardando
		conexao.enviar("aaa");
		
		sleep();
		
		// erros para o estado aguardando:
		conexao.conectar();
		conexao.enviar("aaa");
		conexao.desconectar();
	}

	private static void sleep() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
