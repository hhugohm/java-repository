package org.neos.tread.primos;

public class PrimosThread extends Thread {
	private int x, y, n = 0;

	public PrimosThread(int x, int y) {
		this.x = x;
		this.y = y;
	}

	private boolean esPrimo(int n) {
		int raiz = (int) Math.sqrt((double) n);
		for (int i = 2; i <= raiz; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void run() {
		for (int i = x; i <= y; i++) {
			if (esPrimo(i)) {
				n++;
			}
		}
	}

	public int cuantos() {
		return n;
	}
}