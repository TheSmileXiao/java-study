package es.unileon.prg1.date;
/**
 * Nueva clase principal
 * @author xiao
 *
 */


public class MainDate {

	public static void main(String[] args) throws DateException {

		Date myFecha = new Date();
		Date myFecha2 = new Date();

		
		myFecha.setDay(19);
		myFecha.setMonth(10);
		myFecha.setYear(2019);
		if (myFecha.isSame(myFecha2)){	
			System.out.println("Es la misma fecha :"+myFecha);
		}else {
			System.out.println(myFecha+"\nEs distinto de \n"+myFecha2+"\n");
		}
/*	
		System.out.println("El nombre del mes es: "+myFecha.getNameOfMonth()); //devuelve el nombre del mes
		System.out.println("El mes: "+myFecha.getMonth()+" puede tener el dia :"+myFecha.getDay()+" ?:"+myFecha.dayOfMonth());
		//Decir que si el mes puede tener ese dia o no
		System.out.println(myFecha.seasonOfMonth());//devuelve la estacion del mes
		System.out.println(myFecha.monthsLeft()); //devuelve meses restante a terminar el año
		System.out.println(myFecha.versionDate());//devuelve la version de la fecha
		System.out.println(myFecha.dayOfMonthLeft());//devuelve todas las fechas hasta el final del mes
		System.out.println(myFecha.monthSameDay());//devuelven los meses que tienen los mismos dias
*/
		
/*		Date today;
		try {
			today = new Date(9, 12, 2017);
			System.out.println(today.toString());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}
*/

		
	}


	
}