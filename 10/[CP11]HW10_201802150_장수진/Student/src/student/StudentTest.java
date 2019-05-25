package student;

/********************************
 * 
 * 컴퓨터 프로그래밍 1 (11) HW10
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 ********************************/

public class StudentTest {
	// StudentTest 클래스 시작
	public static void main(String args[]) {
		// 메인 메소드 시작
		Student s1 = new Student("s1", 201800000, "cse",4.0,130);
		// Student 클래스의 생성자로부터 객체 s1을 만들고 초기화
		UnderGraduate u1 = new UnderGraduate("u1",201801234,"cse",3.8,150);
		// UnderGraduate 클래스의 생성자로부터 객체 u1을 만들고 초기화
		u1.setClub("argos");
		// u1의 설정자로 club의 값을 할당
		Graduate g1 = new Graduate("g1",201850000,"cse",4.3,90);
		// Graduate 클래스의 생성자로부터 객체 g1을 만들고 초기화
		g1.setType("ETA");
		// g1의 설정자로 type의 값을 할당
		g1.setScholar(0.8);
		// g1의 설정자로 scholarship의 값을 할당
		Graduate g2 = new Graduate("g2",201860000,"cse",4.2,60);
		// Graduate 클래스의 생성자로부터 객체 g2를 만들고 초기화
		g2.setType("LTA");
		// g2의 설정자로 type의 값을 할당
		g2.setScholar(0.6);
		// g2의 설정자로 scholarship의 값을 할당
		
		System.out.println("name : "+s1.getName());
		// s1의 name 출력
		System.out.println("number : "+s1.getNumber());
		// s1의 number 출력
		System.out.println("major : "+s1.getMajor());
		// s1의 major 출력
		System.out.println("grade : "+s1.getGrade());
		// s1의 grade 출력
		System.out.println("credit : "+s1.getCredit());
		// s1의 credit 출력
		System.out.println("");
		System.out.println("name : "+u1.getName());
		// u1의 name 출력
		System.out.println("number : "+u1.getNumber());
		// u1의 number 출력
		System.out.println("major : "+u1.getMajor());
		// u1의 major 출력
		System.out.println("grade : "+u1.getGrade());
		// u1의 grade 출력
		System.out.println("credit : "+u1.getCredit());
		// u1의 credit 출력
		System.out.println("club : " + u1.getClub());
		// u1의 club 출력
		System.out.println("");
		System.out.println("name : "+g1.getName());
		// g1의 name 출력
		System.out.println("number : "+g1.getNumber());
		// g1의 number 출력
		System.out.println("major : "+g1.getMajor());
		// g1의 major 출력
		System.out.println("grade : "+g1.getGrade());
		// g1의 grade 출력
		System.out.println("credit : "+g1.getCredit());
		// g1의 credit 출력
		System.out.println("type of ta : "+g1.getType());
		// g1의 type 출력
		System.out.println("scholarship rate : "+g1.getScholar());
		// g1의 scholarship 출력
		System.out.println("");
		System.out.println("name : "+g2.getName());
		// g2의 name 출력
		System.out.println("number : "+g2.getNumber());
		// g2의 number 출력
		System.out.println("major : "+g2.getMajor());
		// g2의 major 출력
		System.out.println("grade : "+g2.getGrade());
		// g2의 grade 출력
		System.out.println("credit : "+g2.getCredit());
		// g2의 credit 출력
		System.out.println("type of ta : "+g2.getType());
		// g2의 type 출력
		System.out.println("scholarship rate : "+g2.getScholar());
		// g2의 scholarship 출력
		
	} // 메인 메소드 끝

} // StudentTest 클래스 끝
