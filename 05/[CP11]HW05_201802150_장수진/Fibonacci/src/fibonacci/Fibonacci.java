package fibonacci;

/*
 * 
 * 컴퓨터 프로그래밍1 (11) HW05
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 */

import java.util.Scanner; // Scanner 클래스를 포함한다.

public class Fibonacci {
	// 메인메소드를 시작한다.
	public static void main(String args[]) {
		int front=0; // 앞의 항이 될 변수를 선언하고, 0으로 초기화한다.
		int back=1; // 뒤의 항이 될 변수를 선언하고, 1로 초기화한다.
		int s=0; // 항의 이름이 될 변수를 선언하고, 0으로 초기화한다.
		int x; // 앞의 항과 뒤의 항을 더한 값을 저장하기 위해 변수를 선언한다.
		int in; // 출력할 항의 개수를 입력받기 위한 변수를 선언한다.
		
		Scanner input = new Scanner(System.in); // 사용자로부터 입력을 받을 수 있도록 스캐너를 생성한다.
		System.out.print("출력할 항의 개수 : "); // 항의 개수를 입력받기 위한 안내문자를 출력한다.
		in = input.nextInt(); // 출력할 항의 개수를 입력받는다.
		
		for(s=0;s<in;s++) {
			/* s를 0으로 초기화하고, 입력받은 숫자만큼 항의 개수가 나와야하기 때문에 조건식은 'in보다 s가 작다.'이다.
			 * {}안의 수행이 끝나면 s를 1 증가시키고, 조건에 만족할 경우 반복한다. */
			
			System.out.printf("f%d = %d",s,front); // fs = front 를 출력한다.
			System.out.println(""); // 줄바꿈을 하기 위해 아무것도 출력하지 않고 println만 한다. 
			x=front+back; /* front back x 순으로 있다고 생각한다.
			피보나치수열은 앞의 원소 두 개를 더하여 뒤의 원소를 만드는 수열이기 때문에, front항과 back항을 더하는 연산을 한다.*/
			front=back; // x에 값이 생겼으므로 앞의 원소의 위치를 바꾸기 위해서 front에 back에 저장된 값을 저장시킨다.
			back=x; // 같은 이유로 back에 x에 저장된 값을 저장시킨다.
			
		} // s가 조건을 만족시키지 못했을 때 for문 밖으로 나온다.
		
	} // 메인메소드가 끝이난다.

} // Fibonacci class가 끝이난다.
