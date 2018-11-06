package br.edu.univas.si8.es4.logchain;

public class WarningLogger extends Logger {

	@Override
	public void log(Level level, String message) {
		if (level == Level.WARNING) {
			System.err.println("[WARNING] " + message);
		} else {
			super.log(level, message);
		}
	}
}
