package day02;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String name;
		int kor = 0, eng = 0, mat = 0;
		
		System.out.print("당신의 이름은 무엇입니까? ");
		name = input.next();
		
		System.out.print(name + "님의 국어 점수 : ");
		kor = input.nextInt();
		
		System.out.print(name + "님의 영어 점수 : ");
		eng = input.nextInt();
		
		System.out.print(name + "님의 수학 점수 : ");
		mat = input.nextInt();
		
		System.out.println("==============");
		System.out.println("이 름 : " + name);
		System.out.println("===============");
		System.out.println("국 어 : " + kor);
		System.out.println("영 어 : " + eng);
		System.out.println("수 학 : " + mat);
		System.out.println("===============");
		int sum = kor + eng + mat;
		System.out.println("합 계 : " + sum);
		
	}

}
