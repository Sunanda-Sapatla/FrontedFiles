package day3;
import java.util.Scanner;
public class example {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String b;
		b=sc.nextLine();
		int h=Integer.parseInt(b.substring(0,2));
		int m=Integer.parseInt(b.substring(3));
		System.out.println("hours"+h);
		System.out.println("minutes"+m);
		int c=h+m;
		System.out.println(c);
		
		}
		
	}



