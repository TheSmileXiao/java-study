package es.unileon.prg.tema5;

/**
 * Clase con los ejercicios correspondientes a cadenas de caracteres.
 * La clase "String"
 *
 * @author PRG
 * @version 1.0
 */
    public class Apartado030201 extends Apartado {
   
       protected String obtenerPractica(){
         return "P-VAR";
      }
   
       protected String obtenerBloque() {
         return "Cadenas de caracteres - Clase <<String>>";
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio1.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    *	Obtener el numero de caracteres de la cadena.
    *	Calcular la posicion intermedia de la cadena.
    *	Extraer el caracter que ocupa dicha posicion.
    *	Mostrar por pantalla dicho caracter y el codigo que lo representa.
    */
       public void ejercicio01() {
         cabecera("01","");
         String cadena = "En un lugar de la Mancha";
        // Inicio modificacion

	int length= cadena.length();
	char car= cadena.charAt(length/2);

	System.out.println("caracteres total= " + length + " caracter intermedia= " + car );

        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio2.
    *
    * </br>
    *
    *	Comparar las dos cadenas para ver si son iguales y mostrar por pantalla el resultado de la comparacion.
    * Volver a compararlas pero ahora sin tener en cuenta si estan en mayusculas o minusculas y mostrar por pantalla el resultado de la comparacion.
    *	Convertir las dos cadenas a minusculas, volver a compararlas y mostrar por pantalla el resultado de la comparacion.
    *
    */
       public void ejercicio02() {
         cabecera("02", "");
         String cadena = "Viaje al Parnaso";
         String otraCadena = "ViAje al pArnaso";
      // Inicio modificacion

	System.out.println(" Comparar dos cadenas, si son igualeso no	"+ cadena.equals(otraCadena));
	System.out.println("Sin dar de cuenta con las mayusculas	"	+cadena.equalsIgnoreCase(otraCadena));
	System.out.println("Convertir las dos cadenas a minusculas  	"+cadena.toLowerCase().equals(otraCadena.toLowerCase()));
	
	//uzando el comando equals para compartir, y sabiendo buscar en API los comandos utile.
      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio3.
    *
    * </br>
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    *	Concatenar las dos cadenas formando una tercera usando el operador +
    * Concatenar las dos cadenas formando una tercera usando el metodo concat
    * Mostrar los resultados por pantalla.
    */
       public void ejercicio03() {
         cabecera("03", "");

         String cadena = "Viaje al Parnaso";
         String otraCadena = "Persiles y Segismunda";
      // Inicio modificacion

	System.out.println(cadena+ " "+otraCadena);
	System.out.println(new StringBuffer().append(cadena).append(" ").append(otraCadena).toString());
        // Fin modificacion
	//concatenar, con + y con StringBufeer().append().toString();
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio4.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    * Comprobar si la cadena termina con la palabra Parnaso utilizando endsWith.
    * Comprobar si la cadena empieza con la palabra Viaje utilizando startsWith.
    * Mostrar los resultados por pantalla.
    */
       public void ejercicio04() {
         cabecera("04", "");
         String cadena = "Viaje al Parnaso";
        // Inicio modificacion

	System.out.println(cadena.endsWith("Parnaso"));
	System.out.println(cadena.startsWith("Viaje"));
	

        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio5.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes busquedas en cadena utilizando indexOf:
    * Buscar si el caracter p esta en la cadena y mostrar el resultado por pantalla.
    * Buscar si la cadena Par esta en la cadena y mostrar el resultado por pantalla.
    * Buscar la ultima ocurrencia de la letra a en la cadena y mostrar el resultado por pantalla.
    * Buscar la letra a empezando por la posicion 3 y mostrar el resultado por pantalla.
    */
       public void ejercicio05() {
         cabecera("05","");
         String cadena = "Viaje al Parnaso";
      // Inicio modificacion
	
	System.out.println(cadena.indexOf("p"));
	System.out.println(cadena.indexOf("Par"));
	System.out.println(cadena.lastIndexOf("a"));
	System.out.println(cadena.indexOf("a", 3));
	//como la primera da -1, Significa que no hay p minuscula.	
	//y los demas muestra la posicion del dicho letra.
        // Fin modificacion  
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio6.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    *	Reemplazar las ocurrencias de la letra a por * y mostrar el resultado por pantalla.
    * Reemplazar las ocurrencias de la palabra Parnaso por Olimpo y mostrar en resultado por pantalla
    */
       public void ejercicio06() {
         cabecera("06", "");

        String cadena = "Viaje al Parnaso";

	// Inicio modificacion
	
	String nuevaCadena=cadena.replace("a","*");
	String otraCadena=cadena.replace("Parnaso","Olimpo");
	System.out.println(nuevaCadena);
        System.out.println(otraCadena);
	
      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio7.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    * Obtener la subcadena que va desde la mitad al final.
    * Obtener la subcadena que empieza en la primera j y termina antes de la primera s
    */
       public void ejercicio07() {
         cabecera("07", "");
         String cadena = "Viaje al Parnaso";
      // Inicio modificacion
	int length= cadena.length();
	int posicionj= cadena.indexOf("j");
	int posicions= cadena.indexOf("s");

	System.out.println( cadena.substring(length/2));
	System.out.println( cadena.substring(posicionj,posicions));


        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio8.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario quitar los espacios sobrantes al principio y al final.
    */
       public void ejercicio08() {
         cabecera("08", "");
         String cadena = " La Galatea   ";
      // Inicio modificacion
	
	System.out.println( cadena.substring(1,11));
	//con substring quitando los espacios innecesarios.
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio9.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario convertir las variables a String utilizando el metodo valueOf. Mostrar el resultado por pantalla.
    */
       public void ejercicio09() {
         cabecera("09", "");
         double numero = 1.12e12;
         boolean expresion = true;
         long enteroGrande = 1231231L;
      // Inicio modificacion
	String number = new String();
	System.out.println( number.valueOf(numero));
	System.out.println( number.valueOf(expresion));
	System.out.println( number.valueOf(enteroGrande));
 	
	//    Usando el metodo valueOf para convertir las variables a String
 	  // Fin modificacion
      }
   

   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio10.
    *
    * </br>
    *
    * Se pide compara las dos cadenas lexicograficamente y mostrar el resultado por pantalla.
    */
       public void ejercicio10() {
         cabecera("10", "");
         String cadena = "Viaje al Parnaso";
         String otraCadena = "Viaje al Olimpo";
      // Inicio modificacion

	System.out.println( cadena.compareTo (otraCadena));

	//el valor 0 si la cadena de argumento es igual a esta cadena; un valor menor que 0 si esta cadena es lexicográficamente menor que el argumento de cadena; y un valor mayor que 0 si esta cadena es lexicográficamente mayor que el argumento de cadena.
	//
	// Como el resultado da 1, cadena es lexicograficamente mayor que el otraCadena.	
        // Fin modificacion
      }
   }
