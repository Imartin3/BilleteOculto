package billeteOculto;
import java.util.Random;
public class Billete {
	 private int filas = 8;
	 private int columnas = 4;
	 private int x;
	 private int y;
	 private String[][] tablaDinero;

	 public void tabla() {
		  Random random = new Random();
		  tablaDinero=new String[filas][columnas];
		  x = random.nextInt(filas);
		  y = random.nextInt(columnas);
	 }

	 public void esconderTabla() {
		  for (int i = 0; i < filas; i++) {
				for (int j = 0; j < columnas; j++) {
					 if (i == x && j == y) {
						  tablaDinero[i][j] = "[€]";
					 } else {
						  tablaDinero[i][j] = "     ";
					 }
				}
		  }
	 }

	 public void mostrarTabla() {
		  System.out.println("El billete está escondido en la fila " + (x + 1) + " columna " + (y + 1));
		  System.out.println("Tabla:");
		  for (int i = 0; i < filas; i++) {
				for (int j = 0; j < columnas; j++) {
					 System.out.print(tablaDinero[i][j] + "(·  - ·)");
				}
				System.out.println();
		  }
	 }
}
