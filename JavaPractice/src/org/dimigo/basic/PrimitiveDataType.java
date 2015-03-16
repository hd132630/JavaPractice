package org.dimigo.basic;

public class PrimitiveDataType {
	
	public static void main(String[] args) {
		
			
			String name = "아이유";
			
			System.out.println("<< 아이유 프로필 >>");
			System.out.println("이름 : " + name);
			
			boolean gender = true;
			if(gender){
				System.out.println("성별 : 여자");
			}
			else{
				System.out.println("성별 : 남자");
			}
			int i = 23;
			double d = 161.8;
			float f = 44.3f;			
			char ch = 'A';	
						
			System.out.println("나이 : " + i +"세");
			System.out.println("키 : " + d + "cm");
			System.out.println("몸무게 : " + f + "kg");
			System.out.println("혈액형 : " + ch + "형");
	}
}
