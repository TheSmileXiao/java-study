package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias de repeticion:
 * sentencias con la instruccion "do-while".
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030203 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Instruccion do-while";
	}

	/**
	 * Instruccion do-while - Ejercicio1.
	 *
	 * Programar el codigo que ofrezca un menu de opciones al usuario  hasta que seleccione la opcion salir.
	 * 
	 */
	public void ejercicio01() {
		cabecera("01","");

		// Inicio modificacion

		int counter, n;
		counter=0;
		do{
			System.out.println("Selecciona tu opcion : \n1: seguir .\n2: sonreir \n3: salir .");
			n=Teclado.readInteger();
			if (n==2){
				System.out.println(" Jajajajajajaaa\n\n ");
			}
		}
		while(n!=3);


        // Fin modificacion
	}

	/**
	 * Instruccion do-while - Ejercicio2.
	 *
	 * Programar el  codigo que lea numeros enteros hasta que el usuario introduzca un valor igual a cero 
	 * o hasta que el usuario introduzca dos veces seguidas el mismo numero.
	 * 
	 * Similar al  ejercicio02() de la clase Apartado030202 pero empleando la sentencia do-while).
	 *
	 */
	public void ejercicio02() {
		cabecera("02", "");

		// Inicio modificacion

		int n, counter, a;
		counter=0;
		a=Integer.MAX_VALUE;
		n=Integer.MIN_VALUE;
		
		do{
			a=n;
			System.out.println("Indroduzca "+(counter+1)+"º numero ");
			n=Teclado.readInteger();
			counter=counter+1;
		}
		while(n!=0 && n!=a);

		if(n==0){
			System.out.println("Has introducido un 0.");
		}else{
			System.out.println("Has introducido dos veces seguidas el mismo numero");
		}

		

		// Fin modificacion
	}

	/**
	 * Instruccion do-while - Ejercicio3.
	 *
	 * Programar el codigo que lea la base y la altura de un numero indeterminado de rectangulos y
	 * cree los correspondientes objetos de tipo Rectangulo. Para cada rectangulo el programa mostrara 
	 * por pantalla su area y si es un cuadrado o un rectangulo. El programa terminara cuando alguno 
	 * de los lados del cuadrilatero sea menor o igual que  0.
	 * 
	 */
	public void ejercicio03() {
		cabecera("03", "");

		// Inicio modificacion

		int base, altura ,n ;
		n=0;
		do{
			n= ++n;
			System.out.println("Indtroduzca la base del rectangulo "+n+"º ");
			base=Teclado.readInteger();
			System.out.println("Indtroduzca la altura del rectangulo"+n+"º ");
			altura=Teclado.readInteger();

			Rectangulo rectangulo =new Rectangulo ((int) base , (int) altura);
			if((base ==0 || base <0 ||altura ==0 || altura <0)){
				System.out.println("Alguno valore introducido es menor o igual que 0.");

			}else{
				System.out.println("El area del rectangulo "+n+"º es :"+rectangulo.getArea()+"\n");
				System.out.println("El rectangulo "+n+"º es un cuadrado: "+rectangulo.esUnCuadrado()+" \n\n");
			}

		}while((base !=0 && base >0) &&(altura !=0 && altura >0));


		// Fin modificacion
	}

	/**
	 * Instruccion do-while - Ejercicio4.
	 *
	 * Programar el codigo que dado un numero entero introducido por teclado indique si es o no perfecto.
	 * Un numero entero es perfecto si es igual a la suma de los sus divisores positivos menores que el.
	 * Ejemplos

	 * <ul>
	 * <li>6 es perfecto porque
	 * <ul>
	 * <li>	Sus divisores menores que el  son 1, 2, 3  y
	 * <li> 1 + 2 + 3 = 6;
	 * </ul>
	 * <li> 8 no es perfecto porque
	 * <ul>
	 * <li>	Sus divisores menores que el son 1, 2,4  y
	 * <li> 1+2+4  !=  8
	 * </ul>
	 * </ul>
	 * 
	 */
	
	public void ejercicio04() {
		cabecera("04", "");

		// Inicio modificacion

		int n ,i ,solucion; 
		//n:numero introducido, i:cada vez +1 , solucion:suma de los divisores.
		System.out.println("Indroduce un numero");

		n=Teclado.readInteger();
		i=0;
		solucion=0;

		do{
			++i;
			if(n%i==0){
				solucion=solucion+i;
			}
		}while(i<(n/2));

		if(solucion==n){
			System.out.println(n+" es un numero perfecto .");
		}else{
			System.out.println(n+" no es un numero perfecto");
		}


	// Fin modificacion
	}
}