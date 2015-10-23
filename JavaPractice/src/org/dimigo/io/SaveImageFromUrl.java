package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class SaveImageFromUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String imageUrl = "http://www.etobang.com/data/mw.cheditor/150130/16e51622faaa2bc4d85adb714b2afcbe_b7dLkFWaorl2fnvomaMsVOnygk.jpg";
		try {
			URL url = new URL(imageUrl);
			
			try(InputStream is = url.openStream();
				OutputStream os = new FileOutputStream("files/logo.png")) {
				
				int result;
				// 파일에 write하기
				while((result = is.read()) != -1){
					os.write(result);
				}
				
				System.out.println("파일 쓰기 완료!!!");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
