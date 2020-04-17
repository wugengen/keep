package com.proxy;

import java.util.Scanner;

public class Office{
	public static void main(String[] args){
		/*if("Word".equals(arg0[0])){
			Word w = new Word();
			w.start();
		}*/
		System.out.println("输入要使用的");
		Scanner scan =new Scanner(System.in);
		String arg=scan.nextLine();
		try{

			Class ec =Class.forName("com.proxy."+arg);
			System.out.println(ec);
			OfficeP off=(OfficeP)ec.newInstance();
			off.start();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("*****");
		}
		
	}
	interface OfficeP{
		void start();
	}
}