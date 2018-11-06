package br.edu.univas.si8.es4.logchain;

public class DebugLogger extends Logger {

	@Override
	public void log(Level level, String message) {
		if (level == Level.DEBUG) {
			System.out.println("[DEBUG] " + message);
		} else {
			super.log(level, message);
		}
	}
}
