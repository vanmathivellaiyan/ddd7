package aa;

import java.util.Scanner;

public class leapyear {
	public static void main(String[] args) 
	{
	int num;
	Scanner s=new Scanner(System.in);
	num=s.nextInt();
	if((num%4==0)||(num%400==0)&&(num%100!=0)){
		System.out.println("leap year");
	}
	else{
		System.out.println("not a leap year");
	}
}
}