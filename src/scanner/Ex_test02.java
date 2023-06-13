package scanner;

import java.util.Scanner;

public class Ex_test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kscore;
		int escore;
		int sscore;
		
		System.out.println("당신의 이름은 무엇입니까 ? ");
		name = sc.next();
		
		System.out.println(name + "님의 국어 점수 : ");
		kscore = sc.nextInt();
		System.out.println(name + "님의 영어 점수 : ");
		escore = sc.nextInt();
		System.out.println(name + "님의 수학 점수 : ");
		sscore = sc.nextInt();
		
		System.out.println("================");
		System.out.println("이 름 : " + name);
		System.out.println("================");
		System.out.println("국 어 : " + kscore);
		System.out.println("영 어 : " + escore);
		System.out.println("수 학 : " + sscore);
		System.out.println("================");
		System.out.println("합 계 : " + (kscore + escore + sscore));
		System.out.println("================");
	}

}
