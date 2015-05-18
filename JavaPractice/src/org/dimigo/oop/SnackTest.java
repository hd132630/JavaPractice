package org.dimigo.oop;

public class SnackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snack snack [] = new Snack [3];	
		
		snack [0]= new Snack ("새우깡", "농심", 1100, 2);
		snack [1]= new Snack ("콘칲", "크라운", 1200, 1);
		snack [2]= new Snack("허니버터칩", "해태", 1500, 4);	
		
		for(Snack Snack : snack ) {
			Snack.printSnack();			
		} 
		
		System.out.println("총 구매 금액 : " + String.format ("%,d", (snack [0].calcPrice()+snack [1].calcPrice()+snack [2].calcPrice())) + "원");
	}

}
