package es.unileon.prg1.agregados;

/**
 * Clase que representa un almacen de productos de capacidad
 * limitada.
 *
 * @author PRG
 * @version 1.0
 */
class Almacen{

	/**
	 * Matriz de productos que contiene el almacen
	 */
	private Producto productos[];
	/**
	 * Capacidad del almacen en tipos de productos distintos
	 */
	final int MAXIMO_PROD = 10;
	/**
	 * Numero de tipos de productos almacenados en cada momento
	 * en el almacen (o primera posicion libre de la matriz de
	 * productos)
	 */
	private int siguiente;

	/**
	 * Constructor de la clase que inicializa sus atributos
	 */
	Almacen(){
		//COMPLETAR
		
		productos = new Producto[MAXIMO_PROD];
		
		for(int i=0; i<MAXIMO_PROD; i++) {
			productos[i]=new Producto("a",0,0);
		}
		
		
	}

	/**
	 * Metodo que sirve para aniadir un producto al almacen,
	 * siempre que no este repetido y haya sitio.
	 *
	 * @param producto el producto que se desea aniadir
	 * @return verdadero si el producto ya sido aniadido con exito
	 * y falso en caso contrario
	 */
	boolean anyadir(Producto producto) {
		//COMPLETAR
	
		
		boolean resultado=false;
		
			if(existe(producto)) {
				System.out.println("Este producto ya existe en el almacen");
				resultado=false;
			}
			else {
				if(siguiente==MAXIMO_PROD) {
					System.out.println("El almacen esta lleno. No se puede introducir "+producto.obtenerNombre());
					resultado=false;
				}
				else {
					this.productos[this.siguiente]=producto;
					resultado=true;
				
					this.siguiente++;
				}
			}
			
			return resultado;	
		
	}
		
		
		
		
/*	
		this.siguiente=0;
		
		boolean ok = false;
		
		if(this.existe(producto)) {
			
			System.out.println("Error: el producto "+producto.obtenerNombre()+" ya se encuentra en el almacen.");
			
			ok=false;
		}
		
		if(this.siguiente == this.MAXIMO_PROD) {
		
			System.out.println("Error: almacen de productos lleno. El producto "+producto.obtenerNombre()+" no se ha introducido.");
			
			ok=false;
	        
		}
		
		if(this.existe(producto)==false && this.siguiente != this.MAXIMO_PROD) {
				
				System.out.println("hola");
			
			this.productos[siguiente] = producto;
			
			this.ordenar();
			
			this.siguiente++;
			
			ok=true;
		}
		
		return ok;

	}
*/
	/**
	 * Comprueba si un producto se encuentra ya en el almacen.
	 *
	 * @param producto el producto buscado
	 * @return verdadero si el producto ya se encuentra en el almacen
	 * y falso en caso contrario
	 */
	boolean existe(Producto producto){
		//COMPLETAR
		
		int existir=0;	//0 cuando no existe actualmente el producto que quisiera añadir, y 1 cuando existe ya el producto.
		


			if(producto.obtenerNombre().equalsIgnoreCase("a")) {
				existir=1;
			}
		
			if(existir==1) {
				return true;
			}else {
				return false;
			}
	
	}

	/**
	 * Utiliza el algoritmo de la busqueda binaria sobre la
	 * coleccion ordenada de los productos.
	 *
	 * @param nombre nombre del producto que se desea localizar
	 * @return el producto buscado si se encuentra en el almacen
	 * o nulo en caso contrario
	 */
	Producto buscar(String nombre) {
		//COMPLETAR
		
		int inf =0;
		int centro;
		int sup=MAXIMO_PROD-1;
		
		while(inf<sup) {
			centro=((inf+sup)/2);
			
			if(productos[centro].obtenerNombre().equalsIgnoreCase(nombre)) {
				
				System.out.println("Producto encontrado:"+productos[centro]);
				
				return productos[centro];

			}else if(productos[centro].esMenor(nombre)){
				sup=centro-1;
			}else if(productos[centro].esMayor(nombre)){
				inf=centro+1;
			}else if(productos[centro].esIgualA(nombre)){
				
				System.out.println("El producto "+nombre+" encontrado.");
			}else {		
				System.out.println("Error: el producto "+nombre+" no se ha encontrado");
			}
		}

		return null;

	}

	/**
	 * Intercambia la posicion de dos productos dentro 
	 * de la matriz.
	 *
	 * @param i posicion del primer producto
	 * @param j posicion del segundo producto
	 */
	void cambiar(int i, int j){
		
		//COMPLETAR
		
		Producto[] copia=new Producto[1];
		
		copia[0]=productos[i];
		
		productos[i]=productos[j];
		
		productos[j]=copia[0];
		
	}

	/**
	 * Utiliza el algoritmo de la burbuja bidireccional para 
	 * ordenar los productos del almacen de manera ascente en orden
	 * alfabetico por su nombre.
	 */
	void ordenar(){
		int limiteSuperior, limiteInferior;
		
		boolean fin, cambiado;

		limiteSuperior = productos.length;
		limiteInferior = -1;
		fin = false;

		while ( (limiteInferior < limiteSuperior) && !fin ) {
			limiteInferior++;
			limiteSuperior--;
			cambiado = false;
			for (int j = limiteInferior; j < limiteSuperior; j++){
				if ( productos[j].esMayor(productos[j + 1]) ) {
					cambiar(j,j+1);
					cambiado = true;
				}
			}
			if (!cambiado){
				fin = true;
			}else{
				cambiado = false;
				for (int j = limiteSuperior; --j > limiteInferior; ) {
					if ( productos[j].esMayor(productos[j + 1]) ) {
						cambiar(j,j+1);
						cambiado = true;
					}
				}
				if (!cambiado) {
					fin = true;
				}
			}
		}
	}

	/**
	 * Devuelve una cadena de caracteres con los productos del almacen ordenados.
	 */
	public String toString(){
		StringBuffer salida = new StringBuffer();
		ordenar();
		salida.append("---------");
		salida.append("PRODUCTOS");
		salida.append("---------");
		for (int i=0; i < siguiente; i++){
			salida.append(productos[i].toString());
		}
		return salida.toString();
	}

}
