package org.dimigo.oop;

public class CarTest2 {
	
	public static void main(String[] args){	
		Car2 car = new Car2("현대자동차", "제네시스", "검정색", 225, 50000000);
		Car2 car1 = new Car2("기아자동차", "K7", "흰색", 246, 40000000);
		Car2 car2 = new Car2("삼성자동차", "SM7", "회색", 200, 38000000);		

		System.out.println("<< 자동차 목록 >>");
		System.out.println("제조사명 : " + car.getCompany());
		System.out.println("모델명 : " + car.getModel());
		System.out.println("색상 : " + car.getcolor());
		System.out.println("최대속도 : " + car.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d",  car.getPrice()) + "원");
		System.out.println();	
	
		//car1.setCompany("기아자동차");
		//car1.setModel("K7");
		//car1.setColor("흰색");
		//car1.setMaxSpeed(246);
		//car1.setPrice(40000000);		

		System.out.println("제조사명 : " + car1.getCompany());
		System.out.println("모델명 : " + car1.getModel());
		System.out.println("색상 : " + car1.getcolor());
		System.out.println("최대속도 : " + car1.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d",  car1.getPrice()) + "원");
		System.out.println();	

		//car2.setCompany("삼성자동차");
		//car2.setModel("SM7");
		//car2.setColor("회색");
		//car2.setMaxSpeed(200);
		//car2.setPrice(38000000);		

		System.out.println("제조사명 : " + car2.getCompany());
		System.out.println("모델명 : " + car2.getModel());
		System.out.println("색상 : " + car2.getcolor());
		System.out.println("최대속도 : " + car2.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d",  car2.getPrice()) + "원");
		System.out.println();	
		
		//car3.setCompany("삼성자동차");
		//car3.setModel("SM7");
		//car3.setColor("회색");
		//car3.setMaxSpeed(200);
		//car3.setPrice(38000000);
	}

}
