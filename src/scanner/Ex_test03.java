package scanner;

import java.util.Scanner;

public class Ex_test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, num1, num2;
		
		System.out.println("수 입력 : ");
		num = sc.nextInt();
		
		String bae = (num % 3 == 0) ? "홀수" : "짝수";
		String bae1 = (bae == "홀수")? "3의 배수다.":"3의 배수가 아니다.";
		System.out.println(num + " = " + bae);
		System.out.println(num + " = " + bae1);
		
		System.out.println("두 수 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		String result = (num1 > num2) ? "num1이 num2보다 크다." : "num2가 num1보다 크다.";
		
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		System.out.println(result);
	}

}
