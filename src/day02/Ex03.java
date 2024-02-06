package day02;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A';// '문자 하나'를 저장할 때 사용, 작은따옴표('') 사용 
		//char ch = "A"; // 큰따옴표("")는 문자열을 저장할 때 사용하므로 문자하나에 사용하면 에러발생
		int num = 5;
		int ret; // 변수는 생성이 되지만 값은 존재하지 않는다 dummy 값, 존재하지 않는 값이라 출력은 불가능
		//System.out.println(ret); // ret에는 값이 없기 떄문에 에러가 발생
		ret = ch + num;
		System.out.println("A + 5 = " + ret); // 유니코드(Unicode)
		System.out.println("ch : " + ch);
		System.out.println("num : " + num);
		
		String str = "hello"; // 문자열은 string 사용, 큰따옴표("") 사용해서 표현
		System.out.println("변경 전 str : " + str);
		str = "test";
		System.out.println("변경 후 str : " + str);
	}

}
