package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias condicionales
 * y de repeticion anidadas.
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030204 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Sentencias anidadas";
	}

	/**
	 * Sentencias anidadas - Ejercicio1.
	 *
	 * Programar el codigo que muestre todos los numeros perfectos comprendidos 
	 * entre dos numeros n1 y n2 introducidos por teclado
	 */
	public void ejercicio01() {
		cabecera("01","");

		// Inicio modificacion
		int n1, n2, nMenor, nMayor;
		StringBuffer salida =new StringBuffer("");

		System.out.println("Indroducir el primer numero ");
		n1=Teclado.readInteger();
		System.out.println("Introducir el segundo numero ");
		n2=Teclado.readInteger();
		int i, solucion;
		nMenor=n1;
		nMayor=n1;
		if(n2<n1){
			nMenor=n2;
		}
		if(n2>n1){
			nMayor=n2;
		}
		//El usuario puede introducir tanto desde pequenio al mayor como desde mayor al pequenio.
		do{
			i=0;
			solucion=0;

			do{
				i=i+1;
				if(nMenor%i==0){
					solucion=solucion+i;
				}
			}while(i<(nMenor/2));

				if(solucion==nMenor){
					salida.append(("\n"+nMenor+" es un numero perfecto ."));
				}
			nMenor=nMenor+1;
	
		}while(nMenor<=nMayor);

			System.out.println("Los numeros perfectos comprendidos entre "+n1+" y "+n2+" son:\n "+salida);
			


        // Fin modificacion
	}

	/**
	 * Sentencias anidadas  - Ejercicio2.
	 *
	 * Un banco quiere implementar una aplicacion para detectar cheques falsificados. 
	 * Un cheque es falso si en su numero (compuesto por 10 digitos) hay: 3 o mas ceros seguidos 
	 * y/o cuatro o mas numeros distintos de cero seguidos.
	 * 
	 * Completar la clase Cheque para que detecte los cheques falsos.
	 * 
	 * Probar la clase Cheque  sobre el metodo ejercicio02() de la clase Apartado030204.
	 * 
	 */
	public void ejercicio02() {
		cabecera("02", "");

		Cheque cheque=null;
		
		//Modificar el numero de cheque para peobar
		cheque=new Cheque("0000000000");    
        //cheque=new Cheque("1010098888");
        //cheque=new Cheque("1009808880");   
        
       
         if (cheque.esFalso()== true)
        	 System.out.println("El cheque es falso");
         else
             System.out.println("El cheque es verdadero");
	}

	/**
	 * Sentencias anidadas  - Ejercicio3.
	 *
	 * Programar el codigo que genere dado un tamanio (entero) introducido por teclado los siguientes dibujos:
	 * 
	 * Ejemplo de ejecucion  
	 * 
	 * Introduce el tamanio: 4
	 * 	Triangulo
	 * 	*
	 * 	**
	 * 	***
	 * 	****
	 * 	Cuadrado Relleno
	 * 	****
	 * 	****
	 * 	****
	 *  ****
	 *  
	 *  Cuadrado vacio
	 *  ****
	 *  *  *
	 *  *  *
	 *  ****
	 * 
	 * 
	 */
	public void ejercicio03() {
		cabecera("03", "");

		/* Inicio modificacion
		
		System.out.println("Introduce un tamanio : ");

		int n=Teclado.readInteger();

		for(int i=0; i<n; i++){
	
		}
		*/
	

		// Fin modificacion
	}

	/**
	 * Sentencias anidadas  - Ejercicio4.
	 *
	 * 
	 * Programar el codigo que plantee un pequenio juego al usuario.
	 * <ul>
	 * <li>	El ordenador pensara un numero entre 1 y 100 (generar un numero aleatorio)
	 * <li>	El usuario dispondra de 5 intentos para acertar el numero.
	 * <li>	Por cada intento el ordenador indicara si el numero buscado es menor o mayor 
	 * 		 al introducido y se el usuario ha acertado.
	 * <li> Cuando se acierte el numero correcto debera mostrarse cuantos ensayos han sido 
	 * 		necesarios hasta llegar a la solucion.
	 * <li>	Una vez hecho esto debera preguntar si se desea empezar de nuevo con otro numero o 
	 * 		si desea terminar el juego.
	 *</ul>
	 * 
	 */
	public void ejercicio04() {
		cabecera("04", "");

		// Inicio modificacion
		int n, introducido, nuevo;
		n=(int) (Math.random()*100);
		nuevo =0;
		System.out.println("Tienes 5 intentos para encontrar el numero creado entre 1 y 100 .");

		for(int i=0; i<5; i++){
			System.out.println("Introduce tu "+(i+1)+"º numero");
			introducido=Teclado.readInteger();
			if(introducido>100 || introducido<0 || introducido == Integer.MAX_VALUE || introducido == Integer.MIN_VALUE ){
				System.out.println("El valor introducido no esta comprendido entre 1 y 100 .");
			}else if(introducido>n){
				System.out.println("El numero buscado es menor que el numero introducido .");

			}else if(introducido<n){
				System.out.println("El numero buscado es mayor que el numero introducido .");
			}

			if(introducido==n){
				System.out.println("Has encontrado el numero buscado: "+n+" en "+(i+1)+"º intentos");
			}
			if(i==4 && introducido!=n){
				System.out.println("\nNo lo has encontrado el numero creado : "+n);

				//Preguntar si desea empezar de nuevo, si: inicializa la variable.

				System.out.println("\nDeseas empezar de nuevo ? .\n 1 : sí \n Otro : No ");
				nuevo=Teclado.readInteger();
				if(nuevo==1){
					n=(int) (Math.random()*100);
					i=-1;
					nuevo=0;
				}

			}
		}


		// Fin modificacion
	}
}
