package day02;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A';
		System.out.println( ch );
		int num = ch; // 자동형 변환 (char형을 int형으로 변환)
		System.out.println( num );
		//char ch02 = num; // error : Type(자료형)을 변환시킬 수 없다. int형을 char형으로 자동변환 안됨 int는 4byte이고 cahr 는 2byte라서(크기차이)
		char ch02 = (char)num; // 강제 형변환
		System.out.println( ch02 );
		
		double d = 1.111; // 일반적으로 사용하는 실수값은 8 byte
		float f = (float) 1.111; // float 4 byte > 해당하는 8byte값을 4byte값으로 변환해서 넣어주기
		float f1 = 1.111f; // 
	}

}
