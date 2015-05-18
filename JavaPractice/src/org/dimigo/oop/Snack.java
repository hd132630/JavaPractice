package org.dimigo.oop;

public class Snack {
	private String Name;
	private String Company;
	private int Price;
	private int Number;
	
	public Snack(){
		
	}
	
	public Snack(String name, String company, int price, int number){
		this.Name = name;
		this.Company = company;
		this.Price = price;
		this.Number = number;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		Number = number;
	}
	
	
		
	public void printSnack() {
		System.out.println("이름 : " + Name);
		System.out.println("제조사 : " + Company);
		System.out.println("가격 : " + String.format("%,d", Price) + "원");
		System.out.println("개수 : " + Number + "개");
		System.out.println();
	}	
	
	public int calcPrice() {
		return Number*Price;
	}
}	

