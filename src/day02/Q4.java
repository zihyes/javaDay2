package day02;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int this_year = 0, birth_year = 0;
		System.out.print("올해의 연도를 4자리로 입력하세요: ");
		this_year = input.nextInt();
		System.out.print("당신이 태어난 년도를 4자리로 입력하세요: ");
		birth_year = input.nextInt();
		int age = (this_year - birth_year) - 1;
		System.out.println("당신의 나이는 " + age + "입니다.");
		System.out.println();
		
		double n1, n2;
		System.out.print("첫 번째 물건의 무게를 입력하시오: ");
		n1 = input.nextDouble();
		System.out.print("두 번째 물건의 무게를 입력하시오: ");
		n2 = input.nextDouble();
		
		double weight = 600 - (n1 + n2);
		System.out.println("현재 엘리베이터에 허용 무게는 " + weight + "kg입니다.");
	}

}
