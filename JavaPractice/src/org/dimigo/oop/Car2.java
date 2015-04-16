package org.dimigo.oop;

	public class Car2 {
		private String company = "현대자동차";
		private String model = "제네시스";
		private String color = "검정색";
		private int maxspeed = 225;
		private int price = 50000000;		

		public Car2(){
			
		}	

		public Car2(String newCompany, String newModel, String newColor, int newMaxSpeed, int newPrice){
			company = newCompany;
			model = newModel;
			color = newColor;
			maxspeed = newMaxSpeed;
			price = newPrice;			
		}

		

		public String getCompany(){
			return company;
		}
		
		public String getModel(){
			return model;
		}

		public String getcolor(){
			return color;
		}

		public int getMaxSpeed(){
			return maxspeed;
		}

		public int getPrice(){
			return price;
		}
	}

	


