package es.unileon.prg.tema7;
/**
 * Clase con los ejercicios correspondientes a arrays de tipos basicos.
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030102 extends Apartado {

	@Override
	protected String obtenerPractica(){
		return "P-ARR";
	}

	@Override
	protected String obtenerBloque() {
		return "Arrays de tipos basicos";
	}

	/**
	 * Arrays de tipos basicos - Ejercicio1.
	 *
	 * Completar el metodo para crear y rellenar un vector de cien posiciones
	 * que contenga los primeros cien numeros pares. Una vez creada, se debera
	 * mostrar el contenido del vector por pantalla.
	 */
	public void ejercicio01() {
		cabecera("01", "Generar vector con los 100 primeros numeros pares");

		// Inicio modificacion
		
		int[] vector = new int [100];
		
		for(int i=0; i<100; i++) {
			vector[i] = i*2;
		}
		
		for(int i=0; i<100; i++) {
			System.out.println("el "+(i+1)+"º numero par es : "+ vector[i] );
		}
		
        // Fin modificacion
	}

	/**
	 * Arrays de tipos basicos - Ejercicio2.
	 *
	 * Dado el siguiente fragmento de codigo se pide:
	 *
	 * <ul>
	 * <li> Compilar y ejecutar el metodo
	 * <li> Analizar los resultados obtenidos
	 * <li> Explicar en el fichero LEEME.TXT el porque de los resultados
	 * <li> Modificar el odigo a fin de evitar la excepcion producida
	 * </ul>
	 */
	public void ejercicio02() {
		cabecera("02","Mostrar vector por pantalla");

		// Inicio modificacion
		int[] arrayEnteros = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.print(" { ");
		for(int i=0 ; i < arrayEnteros.length ; i++) {
			System.out.print(" "+arrayEnteros[i]+",");
		}
		System.out.println(" } ");
        // Fin modificacion
	}

	/**
	 * Arrays de tipos basicos - Ejercicio3.
	 *
	 * Completar el metodo para crear una matriz que contenga la tabla de
	 * multiplicar del numero 8. Una vez creada, se debera mostrar el
	 * contenido del vector por pantalla.
	 */
	public void ejercicio03() {
		cabecera("03", "Tabla de multiplicar del ocho");

		// Inicio modificacion

		int[][] matriz = new int[10][3];
		int valor = 8;
		
		for(int f=0; f<10; f++)
		{
			matriz[f][0] = f+1;
			matriz[f][1] = valor;
			matriz[f][2] = matriz[f][0] * matriz[f][1];	
		}
		
		for (int j=0; j<3; j++)
		{
			for(int f=0; f<10; f++)
			{

				System.out.print("\t ["+matriz[f][j]+"]");
				
			}
			System.out.println("");
		}
		
        // Fin modificacion
	}

	/**
	 * Arrays de tipos basicos - Ejercicio4.
	 *
	 * Se pide completar el metodo para mostrar por pantalla el tablero
	 * indicado en el enunciado de la practica.
	 */
	public void ejercicio04() {
		cabecera("04", "BonoLotoADA");

		// Inicio modificacion
		
		int[] tabla = new int[50];
		
		for(int i=0; i<tabla.length; i++)
		{
			tabla[i] = i;
		}
		
		for(int l=1; l<=3; l++) {
			
			System.out.println("Apuesta: "+l);
			
			for( int k=0; k<5; k++) {
				for(int j=0; j<10; j++) {
					if(k==0) {
						System.out.print("[ "+tabla[10*k+j]+"] ");
					}else {
					System.out.print("["+tabla[10*k+j]+"] ");
					}
				}
				System.out.println();
			}
			
		}
		// Fin modificacion

	}
}
