package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int Price1 = 850;
		int  Price2 = 300;
		int Price3 = 600;
		int plus = 0;
		int price =0;
		
		String car="고속버스";
		int distance=10;

		if(distance % 10 != 0){
			plus = plus + 1;
		}

		plus = plus + (distance / 10) - 1;
		
		switch (car){
		case "고속버스":
			price = Price1 + (plus * 300);
			break;
		case "경차":
			price = Price2 + (plus * 200);
			break;
		default:
			price = Price3 + (plus * 200);
			car = "그 외";
		}
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " +car);
		System.out.println("통행료 : " + price + "원");
	}  

}