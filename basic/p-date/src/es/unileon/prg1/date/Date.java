package es.unileon.prg1.date;
/**
 * Clase Date para la superacion de la practica de PGOG1 .
 * @author xiao
 *
 */

public class Date {
	
	private int day;
	private int month;
	private int year;
	
	/**
	 * Constructor de la clase date
	 */
	
	public Date() throws DateException {
		
			this.day   = 1;
			this.month = 1;
			this.year  = 2017;
			
	}
	
	

	public Date(int day, int month, int year) throws DateException {

		setMonth(month);
		setDay(day);
		setYear(year);

		
	}


	
	public Date(Date today) {
		this.day=today.getDay();
		this.month=today.getMonth();
		this.year=today.getYear();
		
	}

	
	public void setDay(int day)throws DateException {
		
		if(day<1 || day >this.daysOfMonth()) {
			throw new DateException("error en el dia introducido.El dia debe estar entre 1 y "+this.daysOfMonth());
		}
		else {
			this.day = day;
		}
		
	}
	
	public int getDay() {
		
		return day;
		
	}

	
	public void setMonth(int month)throws DateException {
		
		if((month<1) || (month >12)) {
			throw new DateException("error en el mes introducido.El mes tiene que estar entre 1 y 12");
		}
		else {
			this.month = month;
		}
		
	}

	
	public int getMonth() {
		
		return month;
		
	}


	public void setYear(int year)throws DateException{
		
		if(year<1) {
			throw new DateException("error en el mes introducido el mes tiene que estar entre 1 y 12");
		}else {
			this.year = year;
		}
		
	}

	
	public int getYear() {
		
		return year;
		
	}


	public boolean isSameYear(Date myFecha2) {//comprobar si es el mismo años

		return this.year == myFecha2.getYear();
	}
	
	
	public boolean isSameMonth(Date myFecha2) {//comprobar si es el mismo mes
		
		return this.month == myFecha2.getMonth();
	}
	
	
	public boolean isSameDay(Date myFecha2) {//Comprobar si es el mismo dia
		
		
		return this.day == myFecha2.getDay();
		
	}
	
	
	public boolean isSame(Date myFecha2) {//Comprobar si es la misma fecha
	
		return ( (this.year == myFecha2.getYear()) && (this.month == myFecha2.getMonth()) && (this.day == myFecha2.getDay()) );
	}
	
	
	public String getMonthName() {//Metodo que muestra el nombre del mes
		
		String name ="";
		
		switch(this.month) {
		
		case 1 : 
			name = "January";
			break;
		case 2:
			name = "February";
			break;
		case 3:	
			name = "March";
			break;
		case 4:
			name = "April";
			break;
		case 5:
			name = "May";
			break;
		case 6:
			name = "June";
			break;
		case 7:
			name = "July";
			break;
		case 8:
			name = "August";
			break;
		case 9:
			name = "September";
			break;
		case 10:
			name = "October";
			break;
		case 11:
			name = "November";
			break;
		case 12:
			name = "December";
			break;
			
		}
		
		return name;
		
	}
	
	
	
	public int daysOfMonth() {//Dias maximos que puede tener cada mes, para hacer los ejercicios siguientes
		
		int dayMax=0;
		
		switch(this.month) {
		case 2:
				dayMax = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
				dayMax = 30;
			break;
			
		default: dayMax=31;
		}
		return dayMax;
		
	}
		
	
	public String getSeasonName() {//Metodo que muestra la estacion del mes
		
		String estacion ="";
		
		switch(this.month) {
		
		case 12:
		case 1: 
		case 2:
			estacion = "Winter";
			break;
		case 3:	
		case 4:
		case 5:
			estacion = "Spring";
			break;
		case 6:
		case 7:
		case 8:
			estacion = "Summer";
			break;
		case 9:
		case 10:
		case 11:
			estacion = "Autumn";
			break;
		}
		
		return estacion;
		
	}
	
		
	public String getMonthsLeft() throws DateException {//return the months left until the end of the year.
		
		StringBuffer monthLeft=new StringBuffer();
	
		for(int i =this.month; i<12; i++) {
			
			setMonth(i+1);

			monthLeft.append(getMonthName()+" ");
		}

		
	
		
		
		
		return monthLeft.toString();
		
	}
	
	
	public String versionDate() {//devuelve la version de la fecha.
		return this.day+"/"+this.month+"/"+this.year;
	}
	
	
	
	
	public String getDaysLeftOfMonth() {//Dias que quedan para terminar el mes
		
		StringBuffer dayLeft= new StringBuffer();
		
		int max = daysOfMonth();		//el dia maximo que tiene un mes
		
		for(int i= this.day; i <max; i++ ) {
			
			this.day+=1;

			dayLeft.append(versionDate()+" ");
		}
		
		return dayLeft.toString();
	}

	
	public String getMonthsSameDays()  {//devuelve los meses que tienen los mismos dias
		
		StringBuffer sameDay= new StringBuffer();
		
		int max = daysOfMonth();		//el dia maximo que tiene un mes
		
		for (int i=1; i<=12; i++) {
			
			this.month=i;
			
		if(max == this.daysOfMonth() ) {
			
				sameDay.append(this.getMonthName()+" ");
			}
		}
	
		return sameDay.toString();
	}
	
	
	public int daysPast() throws DateException{

		int past = 0;
		int mes = this.month;
		
		for(int i = 1; i < mes ; i++) {
			this.setMonth(i);
			past = past + daysOfMonth();
		}
		
		past = past +(this.getDay())-1;

		return past;
	}

	
	
	public int numRandomTriesEqualDate(){

		int day2 = 0;
		int month2 = 0;
		int intento = 0;

		while((day2 != this.day) || (month2 != this.month)){
			day2 = (int)((Math.random()*this.daysOfMonth())+1);
			month2 = (int)((Math.random()*12)+1);
			intento = intento + 1;
		}

		return intento;
	}
	
	
	public String dayOfWeek(int day) throws DateException {
		
		String valor_dia = " ";
		int diaSemana = this.daysPast() % 7;
		
		switch(diaSemana) {
			case 0:
				valor_dia = "Monday";
				break;
			case 1:
				valor_dia = "Tuesday";
				break;
			case 2:
				valor_dia = "Wednesday";
				break;
			case 3:
				valor_dia = "Thursday";
				break;
			case 4:
				valor_dia = "Friday";
				break;
			case 5:
				valor_dia = "Saturday";
				break;
			case 6:
				valor_dia = "Sunday";
				break;
		}    
	    return valor_dia;
	}	
	
	
	@Override
	public String toString() {
		return day+"/"+month+"/"+year;
	}


	public Date tomorrow() throws DateException {
		
		int day,month,year;
		
		day=this.day;
		month=this.month;
		year=this.year;
		
		day++;
		
		if( day > daysOfMonth()) {
			month++;
			day = 1;
		}
		
		if(month > 12) {
			year ++;
			month = 1;
		}
		
		
		Date date= new Date(day,month,year);

		return date;
	}
	
/*
	private boolean isMonthDayRight() throws DateException {
 
		
		if( (getDay()<1) || (getDay()>this.daysOfMonth()) ){
			return false;
		}else {
			return true;
		}
	}
*/

}
