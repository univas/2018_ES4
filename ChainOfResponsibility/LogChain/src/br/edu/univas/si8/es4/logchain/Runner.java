package br.edu.univas.si8.es4.logchain;

public class Runner {

	public static void main(String[] args) {
		Logger logger = buildChain();

		logger.log(Level.DEBUG, "Mensagem de debug...");
		logger.log(Level.INFO, "Mensagem informativa...");
		logger.log(Level.WARNING, "Mensagem de alerta!!!");
	}

	private static Logger buildChain() {
		WarningLogger warning = new WarningLogger();
		InfoLogger info = new InfoLogger();
		DebugLogger debug = new DebugLogger();
		warning.setNext(info);
		info.setNext(debug);
		return warning;
	}
}
