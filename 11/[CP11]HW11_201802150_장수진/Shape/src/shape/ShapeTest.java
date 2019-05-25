package shape;

/********************************
 * 
 * 컴퓨터 프로그래밍 1 (11) HW11
 * 학번 : 201802150
 * 이름 : 장 수 진
 * 
 ********************************/

public class ShapeTest {
	// ShapeTest 클래스 시작
	private  static Shape arrayOfShape[];
	// Shape형 배열 arrayOfShape[] 선언
	public static void main(String args[]) {
		// 메인 메소드 시작
		init();
		print();
		
	} // 메인 메소드 끝
	
	public static void init() {
		// init 메소드 시작
		arrayOfShape = new Shape[6]; // 배열의 크기 6
		arrayOfShape[0] = new Ellipse(1,6,2,1);
		// 0번째에 Ellipse 객체 생성하고 초기값을 준 후 대입
		arrayOfShape[1] = new Rectangle(6,8,5,10);
		// 1번째에 Rectangle 객체 생성하고 초기값을 준 후 대입
		arrayOfShape[2] = new Triangle(3,4,5,10);
		// 2번째에 Triangle 객체 생성하고 초기값을 준 후 대입
		arrayOfShape[3] = new Sphere(3,4,1,2);
		// 3번째에 Sphere 객체 생성하고 초기값을 준 후 대입
		arrayOfShape[4] = new Cube(1,1,2,5,3,4);
		// 4번째에 Cube 객체 생성하고 초기값을 준 후 대입
		arrayOfShape[5] = new Cylinder(6,2,3,1,1);
		// 5번째에 Cylinder 객체 생성하고 초기값을 준 후 대입
		
	} // init 메소드 끝
	
	public static void print() {
		// print 메소드 시작
		for(int i = 0;i < arrayOfShape.length;i++) {
			// 배열의 길이만큼 반복
			System.out.println(arrayOfShape[i]);
			// 배열의 i번째에 저장되어 있는 객체의 toString() 메소드 출력
			// (toString 메소드는 객체.toString()하지 않고, 객체만 써도 출력할 수 있다.)
		}
	} // print 메소드 끝

} // ShapeTest 클래스 끝
