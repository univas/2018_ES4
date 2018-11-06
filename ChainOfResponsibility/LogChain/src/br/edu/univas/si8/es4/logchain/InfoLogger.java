package br.edu.univas.si8.es4.logchain;

public class InfoLogger extends Logger {

	@Override
	public void log(Level level, String message) {
		if (level == Level.INFO) {
			System.out.println("[INFO] " + message);
		} else {
			super.log(level, message);
		}
	}
}
