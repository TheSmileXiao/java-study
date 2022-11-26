package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias condicionales:
 * sentencias con la instruccion "if-else".
 *
 * @author PRG
 * @version 1.0
 */
	public class Apartado030102 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Instruccion if-else";
	}

	/**
	 * Instruccion if-else - Ejercicio1.
	 *
	 * </br>
	 
	 *
	 * Realizar las modificaciones necesarias para que al ejecutar el metodo se ofrezca 
	 * al usuario la posibilidad de obtener el area o el perimetro del rectangulo.
	 * 
	 */
	public void ejercicio01() {
		cabecera("01","");

		Rectangulo rectangulo=new Rectangulo(10,5);
		System.out.println("Introduce una opcion (1 - Area, 2 - Perimetro):");
		// Inicio modificacion
		int n ;
        n=Teclado.readInteger();
        if( (n>2) || (n<=0)){
        	System.out.println("Debes introducir el numero 1 o 2");
        }else	if(n==1){
				System.out.println( "Area es: " + rectangulo.getArea());
			}	else if (n==2) {
				System.out.println( "Perimetro es :" + rectangulo.getPerimetro());
			}

		
		// Fin modificacion
	}

	/**
	 * Instruccion if-else - Ejercicio2.
	 *
	 *  Realizar las modificaciones necesarias para que al ejecutar el metodo  se ofrezca al 
	 *  usuario la posibilidad de introducir un anio por el teclado y se le diga si es un anio bisiesto o no.
	 *  Un anio es bisiesto si es multiplo de 400 o si es multiplo de 4 sin serlo de 100
	 *
	 */
	public void ejercicio02() {
		cabecera("02", "");
		// Inicio modificacion
		System.out.println("Indroduzca un año");
		int year = Teclado.readInteger();
		if (year<0){
			System.out.println(" El valor introducido no es valido");
		}else if (year%400==0 || (year%100 !=0 && year%4 ==0)){
			System.out.println(" Es un año bisiesto");
		}else {
			System.out.println(" No es un año bisiesto");
		}
		// Fin modificacion
	}

	/**
	 * Instruccion if-else - Ejercicio3.
	 *
	 * Se pide
	 * 
	 * <ul>
	 * <li> Quitar los comentarios indicados y compilar  el metodo 02.
	 * <li> Identificar los errores de compilacion.
	 * <li> Explicar en el fichero LEEME.TXT los errores existentes.
	 * <li> Implementar el metodo int compareTo(NumeroEntero n) de la clase NumeroEntero de forma que:
	 * <ul>
	 * <li>	retorne -1 si el valor del NumeroEntero sobre el que se ejecuta el metodo  
	 * 		es menor que  el valor del numero n.
	 * <li> retorne 0 si el valor de los dos objetos NumeroEntero son iguales.
	 * <li> retorne 1 si el valor del NumeroEntero sobre el que se ejecuta el metodo  
	 * 		es mayor que  el valor del numero n.
	 * </ul>
	 * <li> Modificar el  metodo realizando las comparaciones entre los numeros usando  el metodo compareTo.
	 * <li> Compilar y ejecutar el metodo y analizar los resultados obtenidos.
	 * </ul>
	 *
	 */
	public void ejercicio03() {
		cabecera("03", "");

        // Inicio modificacion
		
        NumeroEntero n1 = new NumeroEntero(10);
        NumeroEntero n2 = new NumeroEntero(10);
        
       
        //if (n1 > n2){
        if(n1.compareTo(n2)==1){
        	 System.out.println("N1-> "+n1);
             System.out.println("N1 es mayor que N2");
        }
        else if (n1.compareTo(n2)==-1) {
            System.out.println("N1 -> "+n1);
            System.out.println("N1 es menor que N2");
        }
        else
           System.out.println("N1 y N2 son iguales -> N1 ->"+n1+" N2 -> "+n2);
		
		
		// Fin modificacion
		
	}

	/**
	 * Instruccion if-else - Ejercicio4.
	 *
	 * </br>
	 *
	 * 
	 * Modificar el metodo para que al ejecutarlo se le pida al usuario que introduzca dos numeros 
	 * y a continuacion se le ofrezcan las siguientes opciones:
	 * <ul>
	 * <li>	1 - Sumar: Se mostrara por panta lla la suma de los numeros
	 * <li> 2 - Multiplicar:Se mostrara por pantalla la multiplicacion de los dos numeros
	 * <li> 3 - Divisores:	Se mostrara por pantalla: si el primero es divisor del segundo, si el segundo es divisor del primero o si ninguno es divisor del otro.
	 *  		Si no introduce ninguna de las opciones se mostrara el mensaje : Opcion incorrecta
	 *  </ul>
	 *  	 
	 */
	public void ejercicio04() {
		cabecera("04", "");

		// Inicio modificacion
		int n1, n2 ,op;
		System.out.println("Indroduzca el primer numero");
		n1=Teclado.readInteger();
		System.out.println("Indroduzca el segundo numero");
		n2=Teclado.readInteger();
		System.out.println("Que operacion quieres hacer?");
		System.out.println("1-Sumar. 2-Multiplicar. 3-Dividir");
		op=Teclado.readInteger();

		if(op==1){
			System.out.println( n1+n2 );
		}else if(op==2){
			System.out.println( n1*n2 );
		}else if(op==3){
			if(n1%n2==0){
				System.out.println( n2 +" es divisor de "+n2);
			}
			if(n2%n1==0){
				System.out.println( n1 +" es divisor de "+n2);
			}
			if(n2%n1!=0 && n2%n1 !=0){
				System.out.println( " ninguna es divisor de otra");
			}else{
				System.out.println(" Opcion incorrecta");
			}
		}

        // Fin modificacion
	}

	/**
	 * Instruccion if-else - Ejercicio5.
	 *
	 * Crear una clase denominada Ecuacion2Grado que tenga como atributos los coeficientes de 
	 * una ecuacion de segundo grado (a,b,c)  (ax2 +bx +c=0). Definir e implementar los siguientes metodos
	 * <ul>
	 * <li>	Un constructor que reciba los tres coeficientes de la ecuacion que se va a crear (a,b,c)
	 * <li>	Tres metodos get para cada uno de sus atributos.
	 * <li> Un metodo numeroDeSoluciones que retorne el numero de  soluciones de la ecuacion.
	 * <li> El metodo String toString() que retorne un String representativo de la ecuacion indicando el numero de soluciones que tiene 
	 * 		y el valor para cada una de las soluciones que tenga.
	 * </ul>
	 * 
	 * Probar la clase realizando las modificaciones necesarias y ejecutando el metodo ejercicio5().
	 * 
	 */
	public void ejercicio05() {
		cabecera("05","");

		int a=2, b=5, c=1; //Modificar los valores para realizar pruebas o leerlos por teclado
		
		Ecuacion2Grado ecuacion=new Ecuacion2Grado(a,b,c);
		// Inicio modificacion
		System.out.println(ecuacion.getA());
		System.out.println(ecuacion.getB());
		System.out.println(ecuacion.getC());
		System.out.println(ecuacion);
		
        // Fin modificacion
	}

	/**
	 * Instruccion if-else - Ejercicio6.
	 *
	 * Modificar el metodo  para que al ejecutarlo se le pida al usuario que introduzca tres numeros  
	 * y se indique cual es el mayor de los tres. Tambien se informara si hay dos o tres numeros iguales
	 * y cuales son. 
	 *
	 */
	public void ejercicio06() {
		cabecera("06", "");

		// Inicio modificacion
		int n1, n2, n3, max;
		
		System.out.println("Introduzca tres valores: ");
		n1 = Teclado.readInteger();
		n2 = Teclado.readInteger();
		n3 = Teclado.readInteger();
		max = n3;

			if (n3 < n2) {
				max = n2;
			}
			if (max < n1 ) {
				max = n1;
			}

			System.out.println("El numero mayor es: " + max);
			if (n1 == n2 || n1 == n3) {
				System.out.print( n1+" esta repetido");
			} else if (n2==n3) {
				System.out.print(n2+" esta repetido");
			}

		}
		// Fin modificacion

}