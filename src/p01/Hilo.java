package p01;

public class Hilo implements Runnable {
	private Ball bola;
	private Board tablero;

	public Hilo(Ball b, Board t) {
		bola = b;
		tablero = t;
	}

	@Override
	public void run() {
		try {
			for (;;) {
				bola.reflect();
				bola.move();
				tablero.repaint();
				Thread.sleep(10);
			}
		} catch (InterruptedException e) {
			return;
		}
	}
}