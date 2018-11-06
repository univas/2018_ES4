package br.edu.univas.si8.es4.logchain;

public abstract class Logger {

	private Logger next;

	public void log(Level level, String message) {
		if (next != null) {
			next.log(level, message);
		}
	}

	public void setNext(Logger next) {
		this.next = next;
	}
}
