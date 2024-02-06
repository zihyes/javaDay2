package day02;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String name;
		int kor = 0, eng = 0, mat = 0;
		System.out.print("학생 이름: ");
		name = input.next();
		System.out.print("국어 점수: ");
		kor = input.nextInt();
		System.out.print("영어 점수: ");
		eng = input.nextInt();
		System.out.print("수학 점수: ");
		mat = input.nextInt();
		
		double avg = (kor + eng + mat) / 3.0;
		System.out.println("====================학생 정보====================");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("-----------------------------------------------");
		System.out.printf("김개똥\t1\t2\t2\t5\t%.2f", avg);
	}

}
