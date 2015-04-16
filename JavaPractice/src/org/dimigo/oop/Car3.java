package org.dimigo.oop;

	public class Car3 {
		private String company;
		private String model;
		private String color;
		private int maxspeed;
		private int price;		

		public Car3(){		

		}	

		public Car3(String Company, String Model, String Color, int MaxSpeed, int Price){
			this.company = Company;
			this.model = Model;
			this.color = Color;
			this.maxspeed = MaxSpeed;
			this.price = Price;	
		}		

		public Car3(String Company, String Model, String Color, int MaxSpeed){
			this.company = Company;
			this.model = Model;
			this.color = Color;
			this.maxspeed = MaxSpeed;		
		}		

		public Car3(String Company, String Model, String Color){
			this.company = Company;
			this.model = Model;
			this.color = Color;		
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

	


