package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias condicionales:
 * sentencias con la instrucciin "switch".
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030103 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Instruccion switch";
	}

	/**
	 * Instruccion switch - Ejercicio1.
	 *
	 * Modificar el metodo  para que al introducir un calificacion numerica  por teclado(1-10) se muestre 
	 * la calificacion de forma textual (1-4 -> Insuficiente , 5 -> Suficiente, 6 -> Bien, 
	 * 7-8 -> Notable, 9 -> Sobresaliente, 10 -> Matricula)
	 *
	 */
	public void ejercicio01() {
		cabecera("01","");

		// Inicio modificacion

		System.out.println("Introducir un calificacion numerica ");
		int calificacion=Teclado.readInteger();

		switch(calificacion){
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Insuficiente");
				break;
			case 5:
				System.out.println("Suficiente");
				break;
			case 6:
				System.out.println("Bien");
				break;
			case 7:
			case 8:
				System.out.println("Notable");
				break;
			case 9:
				System.out.println("Sobresaliente");
				break;
			case 10:
				System.out.println("Matricula");
				break;
			default:
				System.out.println("Calificacion incorrecta, debe introdur un numero entre 1 y 10");

		}



        // Fin modificacion
	}

	/**
	 * Instruccion switch - Ejercicio2.
	 *
	 * Modificar el metodo  para que retorne el numero de anillos que tiene un digito entero 
	 * introducido por el teclado. Se definen los anillos de un digito como el numero de circulos
	 * que tiene un digito. Ej.: 0 -> 1 anillo, 2 -> 0 anillos, 8 -> 2 anillos, etc.).
	 *
	 */
	public void ejercicio02() {
		cabecera("02", "");

		// Inicio modificacion
		System.out.println("Indroducir un numero entero");
		int anillo=Teclado.readInteger();

		switch(anillo){
			case 0:
				System.out.println(" 1 anillo");
				break;
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println(" 0 anllos");
				break;
			case 6:
				System.out.println(" 1 anillo");
				break;
			case 7:
				System.out.println(" 0 anillos");
				break;
			case 8:
				System.out.println(" 2 anillos");
				break;
			case 9:
				System.out.println(" 1 anillo");
				break;
			default:
				System.out.println(" Indrocuzca un numero entre 0 y 9 pls");

		}


		// Fin modificacion
	}

	/**
	 * Instruccion switch - Ejercicio3.
	 *
	 * Modificar el metodo ejercicio3() del Apartado030103, utilizando una sentencia switch, 
	 * para que realice la misma funcionalidad que el metodo ejercicio4() del Apartado030102.
	 *
	 */
	public void ejercicio03() {
		cabecera("03", "");

		// Inicio modificacion

		int n1, n2 ,op;
		System.out.println("Indroduzca el primer numero");
		n1=Teclado.readInteger();
		System.out.println("Indroduzca el segundo numero");
		n2=Teclado.readInteger();
		System.out.println("Que operacion quieres hacer?");
		System.out.println("1-Sumar. 2-Multiplicar. 3-Dividir");
		op=Teclado.readInteger();

		switch(op){
			case 1:
				System.out.println( n1+n2 );
				break;
			case 2:
				System.out.println( n1*n2 );
				break;
			case 3:
				if(n1%n2==0){
					System.out.println( n2 +" es divisor de "+n2);
				}
				if(n2%n1==0){
					System.out.println( n1 +" es divisor de "+n2);
				}
				if(n2%n1!=0 && n2%n1 !=0){
					System.out.println( "ninguna es divisor de otra");
				break;
				}
			default:
				System.out.println( "Opcion incorrecta");
			

		}
		
		// Fin modificacion
	}

	/**
	 * Instruccion switch - Ejercicio4.
	 *
	 * Modificar el metodo ejercicio4() del Apartado030103  para que al introducir una cadena de caracteres 
	 * por teclado  se indique si el primer caracter de la cadena es una vocal escrita en minusculas, 
	 * si es una vocal escrita en mayusculas o si es otro tipo de caracter.
	 * 
	 */
	public void ejercicio04() {
		cabecera("04", "");

		
		// Inicio modificacion

		String cadena;
		System.out.println(" Indroduzca una cadena ");
		cadena=Teclado.readString();
		
		int tipo =0;

		if(cadena.charAt(0)== 'a' || cadena.charAt(0)== 'e' || cadena.charAt(0)== 'i' || cadena.charAt(0)== 'o' || cadena.charAt(0)== 'u'){
			tipo =1;
		}
		
		if(cadena.charAt(0)== 'A' || cadena.charAt(0)== 'E' || cadena.charAt(0)== 'I' || cadena.charAt(0)== 'O' || cadena.charAt(0)== 'U'){
			tipo =2;
		}
		
		switch(tipo){
			case 1:
				System.out.println("el primer caracter de la cadena es una vocal escrita en minusculas");
				break;
			case 2:
				System.out.println("el primer caracter de la cadena es una vocal escrita en Mayusculas");
				break;
		default:
				System.out.println("el primer caracter de la cadena es otro tipo de caracter");
		}
		
	
		// Fin modificacion

	}
}
