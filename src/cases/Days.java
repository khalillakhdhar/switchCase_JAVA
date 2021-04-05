package cases;

public class Days {
private int day;
private int year;




public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public int getDay() {
	return day;
}

public void setDay(int day) {
	this.day = day;
}

public Days(int day) {
	this.day = day;
}


String dayName()
{
	switch (this.day) {
	case 1: 
		return "lundi";
	case 2:
		return "mardi";
	case 3:
		return "mercredi";
	case 4:
		return "jeudi";
	case 5:
		return "vendredi";
	case 6:
		return "samedi";
	case 7: 
		return "dimanche";
	default:
		return "jour incorrecte";
	}	


}


}
