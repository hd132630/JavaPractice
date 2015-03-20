package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
				System.out.println(" << 도형 넓이 비교 >> ");
				
				int a = 9, a1 = 9;
				int b= 10;
				double c = 5.8, c1 = 5.4;
				
				double d1 =  (a + b) * c * 0.5;
				double d2 = a1*c1;
				System.out.println(" 사다리꼴 넓이 : " + d1);
				System.out.println(" 평행사변형 넓이 : " + d2);
				
				System.out.println("");
				
				if(d1 > d2) {
					System.out.println(" 사다리꼴이 평행사변형 보다 " + (d1 - d2) + " 더 큽니다. ");
				}
				else if(d1 == d2) {
					System.out.println(" 사다리꼴과 평행사변형의 넓이는 같습니다. ");
				}
				else {
					System.out.println(" 사다리꼴이 평행사변형 보다 " + (d2-d1) + " 더 작습니다. ");
				}

	}

}
