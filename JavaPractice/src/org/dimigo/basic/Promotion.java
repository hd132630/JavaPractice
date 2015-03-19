package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
				System.out.println("<< 디미베네 연간 인거비 >>");
				
				long salary = 1700000L;
				int employee = 3;
				int store = 1500;
				
				System.out.println("월 평균 급여 : " + String.format("%,d", salary) + "원");
				System.out.println("점포 내 직원 수 : " + employee + "명");
				System.out.println("점포 수 : " + String.format("%,d", store) + "개");
				System.out.println(" ");
				
				System.out.println("연간 인거비 : " + String.format("%,d", salary * 12 * employee * store)+ "원");								
	}

}
