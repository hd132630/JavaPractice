package org.dimigo.inheritance;

public class IPhone extends SmartPhone {
		public IPhone(){
			
		}
		
		public IPhone(String model, String company, int price){
			super(model, company, price);
		}
		
		public void pay(){
			System.out.println("애플 페이로 결제합니다.");
		}
		
		public void useAirDropFunction(){
			System.out.println("Air drop의 기능을 이용합니다.");
		}
		
		
}
