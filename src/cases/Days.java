package cases;

public class Days {
private int day;
private int year;
private int month;




public int getMonth() {
	return month;
}

public void setMonth(int month) {
	this.month = month;
}

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


public String dayName()
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
public boolean bisextile()
{
return year%4==0;	
}
int intervale()
{
switch(month)
{
case 1,3,5,7,8,10,12:
	return 31;
case 2:
	{if(bisextile())
	return 29;
	else
		return 28;
	}
		
case 4,6,9,11:
	return 30;
default: 
	return 30;


}
}

@Override
public String toString() {
	return "Days [day=" + day + ", year=" + year + ", month=" + month + ", getMonth()=" + getMonth() + ", getYear()="
			+ getYear() + "]";
}

}
