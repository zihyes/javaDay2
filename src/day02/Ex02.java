package day02;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123; // 변수를 최초로 만들때만 자료형을 사용하고 
		System.out.println("변경 전 num : " + number);
		number = 100; // 그 이후에는 자료형 입력하지 않아도 됨
		System.out.println("변경 후 num : " + number);
		number = number + 200;
		System.out.println("변경 후 num : " + number);

	}

}
