package movie;

// Movie 클래스 시작
public class Movie {
	String title; // 제목 변수 생성
	String direc; // 감독 변수 생성
	String pro; // 제작사 변수 생성
	
	// parameter없는 생성자
	public Movie() {
		title = "The Holiday"; // 제목 변수에 값 저장
		direc = "Nancy Meyers"; // 감독 변수에 값 저장
		pro = "Columbia Pictures"; // 제작사 변수에 값 저장
		System.out.println("m1(no parameter) : "+title+" / "+direc+" / "+pro); // 출력
	}
	// parameter없는 생성자 끝
	// parameter가 3개인 생성자
	public Movie (String a, String b, String c) {
		title = a; // 입력받은 a를 제목 변수에 저장
		direc = b; // 입력받은 b를 감독 변수에 저장
		pro = c; // 입력받은 c를 제작사 변수에 저장
		System.out.println("m2(3 parameters) : "+title+" / "+direc+" / "+pro); // 출력
	}
	// parameter가 3개인 생성자 끝

} // Movie 클래스 끝
