package scanner;

import java.util.Scanner;

public class TestClass01 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int num;
	String name;
	
	System.out.print("이름 입력 : ");
	name = input.next();
	
	System.out.print("수 입력 : ");
	num = input.nextInt();
	
	System.out.println("이름 : "+name);
	System.out.println("입력 수 :"+num);
	
	int n1 = 10;
	int n2 = ++n1;
	System.out.println("n1 : "+n1);
	System.out.println("n2 : "+n2);
	
	n1 = 10;
	n2 = n1++;
	System.out.println("n1 : "+n1);
	System.out.println("n2 : "+n2);
}
}
