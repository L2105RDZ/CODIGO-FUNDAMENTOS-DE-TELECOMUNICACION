package u1recursividad;

public class ResolverUnLaberinto {

	public static void main(String[] args) {
		char[][] laberinto = new char[][] {
			{'#', '#', '#', '#', '#', '#'},
			{'#', '.', '#', ' ', ' ', '#'},
			{'#', ' ', ' ', ' ', '#', '#'},
			{'#', ' ', '#', '#', '#', '#'},
			{'#', ' ', ' ', ' ', '#', '#'},
			{'#', ' ', '#', ' ', ' ', '#'},
			{'#', '#', '#', '#', ' ', '#'}
		};
		
		ResolverUnLaberinto laber = new ResolverUnLaberinto();
		System.out.println("\nSituacion inicial: ");
		laber.imprime(laberinto);
		laber.resuelve(laberinto, 1, 1);
	}

	public boolean resuelve(char[][] lab, int x, int y) {
		lab[y][x] = '.';
		if (x == 0 || y == 0 || x == lab[0].length - 1 || y == lab.length - 1) {
			System.out.println("\nSoluuion Encontrada");
			imprime(lab);
			return true;
		}

		// arriba
		if (lab[y - 1][x] == ' ') {
			if (resuelve(lab, x, y - 1) == true) {
				return true;
			}
		}

		// abajo
		if (lab[y + 1][x] == ' ') {
			if (resuelve(lab, x, y + 1) == true) {
				return true;
			}
		}

		// izquierda
		if (lab[y][x - 1] == ' ') {
			if (resuelve(lab, x - 1, y) == true) {
				return true;
			}
		}

		// derecha
		if (lab[y][x + 1] == ' ') {
			if (resuelve(lab, x + 1, y) == true) {
				return true;
			}
		}

		// Este camino no tiene sulucion
		lab[y][x] = ' ';
		return false;

	}

	public void imprime(char[][] lab) {
		for (int i = 0; i < lab.length; i++) {
			for (int j = 0; j < lab[i].length; j++) {
				System.out.print(lab[i][j]);
			}
			System.out.println();
		}
	}

}


