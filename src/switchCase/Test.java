package switchCase;

import cases.Days;
import ifElse.Division;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.print(intervale());
		
		
//		Division d=new Division();
//		d.setA(336);
//		System.out.println(d.toString());
		
		Days d=new Days(6);
		d.setYear(2021);
		d.setMonth(7);
		System.out.println(d.dayName());
		System.out.println(d.toString());
	}

}
