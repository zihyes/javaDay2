package day02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); // scanner 자료형 input 변수명 입력받으려면 이 한 줄 무조건 넣어줘야 함
		int num;
		String name;
		System.out.println("이름 입력 : ");
		name = input.next(); // 문자열 입력받을 때 사용하는 기능
		
		System.out.print("수 입력 : ");
		num = input.nextInt(); // 정수 입력받을 때 사용
		
		System.out.println("이름 : " + name);
		System.out.println("입력 수 : " + num);
		
		double dou;
		System.out.println("실수 입력");
		dou = input.nextDouble();
		System.out.println("실수 : " + dou);
	}

}
