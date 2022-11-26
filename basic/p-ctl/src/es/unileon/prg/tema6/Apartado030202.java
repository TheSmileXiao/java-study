package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias de repeticion:
 * sentencias con la instruccion "while".
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030202 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Instruccion while";
	}

	/**
	 * Instruccion while - Ejercicio1.
	 *
	 * Programar el codigo que lea 10 numeros enteros por teclado y diga cual es el mayor 
	 * y el menor de todos ellos (similar al ejercicio05() de la clase Apartado030201 pero 
	 * utilizando la sentencia while)
	 *
	 */
	public void ejercicio01() {
		cabecera("01","");

		// Inicio modificacion
				int max , min, n, counter;
		max=Integer.MIN_VALUE;
		min=Integer.MAX_VALUE;
		n=0;
		counter=0;

		while (counter<10){
			System.out.println("Indroduzca "+(counter+1)+"º numero ");
			n=Teclado.readInteger();
			while(n<min){
				min=n;
			}
			while(n>max){
				max=n;
			}

			counter=counter+1;

		}


		System.out.println("El numero mayor es "+max+".");
		System.out.println("El numero menor es "+min+".");	
		
					
        // Fin modificacion
	}

	/**
	 * Instruccion while - Ejercicio2.
	 *
	 * Programar el  codigo que lea numeros enteros hasta que el usuario introduzca un valor igual 
	 * a cero  o hasta que el usuario introduzca dos veces seguidas el mismo numero.
	 */
	public void ejercicio02() {
		cabecera("02", "");

		// Inicio modificacion
		int n, counter, a;
		counter=0;
		a=Integer.MAX_VALUE;
		n=Integer.MIN_VALUE;

		while(n!=0 && n!=a){

			a=n;
			System.out.println("Indroduzca "+(counter+1)+"º numero ");
			n=Teclado.readInteger();
			counter=counter+1;
		}
		if(n==0){
			System.out.println("Has introducido un 0.");
		}else{
			System.out.println("Has introducido dos veces seguidas el mismo numero");
		}
		
		// Fin modificacion
	}

	/**
	 * Instruccion while - Ejercicio3.
	 *modificacion
	 * Programar el codigo  que sume los numeros pares por un lado y los impares por otro  entre
	 * dos numeros enteros introducidos por el usuario.
	 * 
	 * Nota: similar al ejercicio06() de la clase Apartado030201 pero utilizando la sentencia while
	 * y sin suponer que el primer numero es siempre par)
	 * 
	 */
	public void ejercicio03() {
		cabecera("03", "");

		// Inicio modificacion

		int pares, impares, intentos, n, numeros;
		pares=0;
		impares=0;
		n=0;

		System.out.println("Cuantos numeros deseas poner? ");
		intentos=Teclado.readInteger();

		while(intentos>0){

			intentos=intentos-1;
			n=n+1;
			System.out.println("Indroduzca "+n+"º numero ");
			numeros=Teclado.readInteger();

			if(numeros%2==0){
				pares=pares+numeros;
			}
			if(numeros%2!=0){
				impares=impares+numeros;
			}

		}

		System.out.println("La suma de los numeros pares = "+pares+" .");
		System.out.println("La suma de los numeros impares = "+impares+" .");


		// Fin modificacion
	}

	/**
	 * Instruccion while - Ejercicio4.
	 *
	 * Programar el codigo  que calcule la media, de una serie de numeros introducidos por teclado. 
	 * La serie acaba cuando se introduce el tercer 5. Los 5 introducidos se procesaran como numeros 
	 * de la serie, es decir, intervendran a la hora de calcular los valores pedidos.
	 * 
	 */
	public void ejercicio04() {
		cabecera("04", "");

		// Inicio modificacion

		int cincos, n, veces, numeros;
		cincos=0;
		veces=0;
		numeros=0;
		while(cincos<3){

			veces=veces+1;
			System.out.println("Introduce "+veces+"º numero");
			n=Teclado.readInteger();
			numeros=numeros+n;
			if(n==5){
				cincos=cincos+1;
			}


		}
		System.out.println("La suma do todos los numeros son: "+numeros);





		// Fin modificacion
	}

	/**
	 * Instruccion while - Ejercicio5.
	 *
	 * Modificar la clase NumeroEntero definiendo e implementando los siguientes metodos
	 * <ul>
	 * <li> int numeroDigitos():  retornara el numero de digitos del  numero.
	 * <li>	int inverso(): retornara el inverso del numero (Ej.: 23 -> 32)
	 * <li>	booleam  esCapicua(): retorna si el numero es o no capicua.
	 * </ul>
	 * 
	 * Probar los nuevos metodos de la clase numero en el metodo ejercicio05.
	 *
	 */
	public void ejercicio05() {
		cabecera("05","");

		// Inicio modificacion

		System.out.println("Introduce un numero cualquier");

		NumeroEntero n =new NumeroEntero(Teclado.readInteger());

		System.out.println("El nuemero introducido tiene :"+n.numeroDigitos()+" digitos");
		System.out.println("En inverso del numero introducido es :"+n.inverso());

		if(n.esCapicua()){
			System.out.println("El numero introducido es capicua");
		}else{
			System.out.println("El numero introducido no es capicua");
		}
		
        // Fin modificacion
	}

	/**
	 * Instruccion while - Ejercicio6.
	 * 
	 * Teniendo en cuenta el siguiente diagrama de clases del enunciado de la practica
	 * 
	 * <ul>
	 * <li> La clase Partido representa partidos de tenis en los que intervienen dos jugadores
	 * <li> Cada jugador tiene un nombre y una puntuacion en el ranking de la ATP
	 * </ul>
	 * 
	 * Se pide:
	 * 
	 * <ul>
	 * <li>	Consultar el codigo de las clase Partido y Jugador
	 * <li>	Implementar el metodo jugar de la clase Partido
	 * <li>	Simulara que se juega el partido entre los dos jugadores generando el ganador de forma aleatoria
	 * <li>	El jugador con mayor puntuacion en la ATP tendra mayor posibilidad de ganar.
	 * <li> El ganador del partido aumentara en 1 punto su puntuacion en el ranking.
	 * <li>	Nota 1:
	 * <ul>	Una  forma de generar el ganador puede ser:
	 * <li>	
	 * <li>	resultado1= Math.random() * puntos_jugador1;
	 * <li> resultado2= Math.random() * puntos_jugador2;
	 * <li>  el que tenga mayor resultado ganara el partido
	 * </ul>
	 * <li>Nota 2:
	 * <ul>
	 * <li>Hay que tener en cuenta que el resultado puede ser empate, en este caso se volveran a generar resultados hasta que exista un ganador.
	 * <li>
	 * </ul>
	 * </ul>
	 *
	 */
	
	public void ejercicio06() {
		cabecera("06", "");
		
		Jugador j1=new Jugador("Federer",5);
        Jugador j2=new Jugador("Nadal",4);
        
        
        System.out.println("Los Jugadores del Partido son " + j1.getNombre() + " y "+j2.getNombre());
        
        Partido partido=new Partido(j1,j2);
        partido.jugar();
        
        System.out.println("El ganador es: "+ partido.ganador().getNombre());
	}
}
