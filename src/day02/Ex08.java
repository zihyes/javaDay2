package day02;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 9, n2 = 2;
		System.out.println( n1 / n2 ); // 나누기 연산 : 정수 나누기 정수의 몫
		System.out.println( n1 / (double) n2 ); // 실수의 값을 원한다면 = > 두 값중 하나라도 실수여야 함 // double n2 = 2.0
		System.out.println( n1 % n2 ); // 나머지 연산 => 짝수 홀수를 구하거나 배수를 이용할 때 주로 사용
		
		System.out.println("==== 복합대입 연산자 ====");
		n1 = n2 = 5; // n1 = 5, n2 =5;
		n1 += 1; // n1(6) = n1(5) + 1
		System.out.println( n1 );
		n1 -= 1; // n1(5) = n1(6) - 1
		System.out.println( n1 );
		n1 *= n2; // n1(25) = n1(5) * n2(5)
		System.out.println( n1 );
		n1 /= n2; // n1(5) = n1(25) / n2(5)
		System.out.println( n1 );
		n1 %= n2; // n1(0) = n1(5) % n2(5)
		System.out.println( n1 );
		
		System.out.println("==== 관계 연산자 ====");
		n1 = 5;
		n2 = 2;
		System.out.println(n1 > n2); // 해당 연산이 참이면 true 거짓이면 false
		System.out.println(n1 <= n2);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		
		boolean bool;
		bool = n1 > n2;
		System.out.println( bool );
		bool = n1 < n2;
		System.out.println( bool );
	
		System.out.println("==== 논리 연산자 ====");
		int n3 = 10;
		n1 = 5; n2 = 7;
		System.out.println(n1 > n2 && n1 > n3); // and 연산은 모두가 참일때만 참
		System.out.println(n2 > n1 && n2 > n3);
		System.out.println(n3 > n2 && n3 > n1);
		
		System.out.println("---- or ----"); // 하나라도 참이면 => 결과는 참
		System.out.println( true || true );
		System.out.println( true || false );
		System.out.println( false || true );
		System.out.println( false || false );
		
		System.out.println("---- and ----"); // 하나라도 거짓이면 => 거짓
		System.out.println( true && true );
		System.out.println( true && false );
		System.out.println( false && true );
		System.out.println( false && false );
		
		System.out.println("---- not ----");
		System.out.println(!false);
		System.out.println(!true);
		System.out.println(!(10>5));
		
		System.out.println("---- 예제 ----");
		n1 = 10; n2 =5;
		bool = n1>n2 && n1%2 ==0; // 두 연산 다 맞아야 => 참
		System.out.println( bool );
		
		System.out.println("==== 증감 연산자 ====");
		n1 = 5;
		++n1;
		System.out.println( n1 );
		
		n2 = 5;
		n2 ++;
		System.out.println( n2 );
		
		System.out.println("----------");
		n1 = 10;
		n2 = ++n1; // 자기자신을 1 증가시키는 건 동일, 연산되는 방식이 다름. 앞쪽에 불호가붙으면 어떠한 연산보다 자기 자신을 먼저 증가시키고 그 후에 다른 연산 진행
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		
		System.out.println("----------");
		n1 = 10;
		n2 = n1++; // 모든 연산이 끝 난 후에 자기자신을 증가시켜라
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		
		int a = 5, b = 6, c = 10, d;
		d = ++a * b--; 
		System.out.println(a + "," + b + "," + d); // a = 6, b =5, d = 6 * 6 = 36
		
		d = a++ + ++c - b--;
		System.out.println(a + "," + b + "," + c + "," + d); // a = 7, b = 4 c = 11. d = 6 + 11 - 5 =12
		
		System.out.println("=== 삼항 연산자(조건 연산자) ===="); 
		n1 = 20;
		n2 = 10;
		String result;
		result = (n1 > n2)?"참인경우(n1이 n2보다 크다)":"거짓인경우(n2이 n1보다 크다)";
		System.out.println( result );
		
	}

}
