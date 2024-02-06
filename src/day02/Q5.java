package day02;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== 표준 체중 구하기 ====");
		Scanner input = new Scanner(System.in);
		int height = 0;
		//double standard_weight = (height - 100) * 0.9;
		System.out.print("키를 입력하세요: ");
		height = input.nextInt();
		double standard_weight = (height - 100) * 0.9;
		System.out.println("표준 체중은 " + standard_weight + "입니다.");
		
		System.out.println("==== 비만도 구하기 ====");
		System.out.print("키를 입력하세요: ");
		height = input.nextInt();
		int weight = 0;
		System.out.print("현재 체중을 입력하세요: ");
		weight = input.nextInt();
		double obesity = (weight / standard_weight) * 100;
		System.out.printf("표준 체중은 %.1f이고 비만도는 %.2f입니다.", standard_weight, obesity);
	}

}
