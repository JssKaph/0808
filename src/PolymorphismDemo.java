/*
 * Polymorphism의 조건
 * 1. Method Override
 * 2. Object Cast
 * 		1) Value Type
 * 			a. 자동형변환, Implicit conversion, Promotion : 작은쪽 -> 큰쪽으로 변경
 * 			b. 강제형변환, Explicit conversion, Demotion : 큰쪽 -> 작은쪽으로 변경 () 연산자를 사용
 * 		2) Object Type
 * 			a. 자동형변환, Implicit conversion, Promotion, Cast up : 자식 -> 부모 (항상 성공)
 * 			b. 강제형변환, Explicit conversion, Demotion, Cast down : 부모 -> 자식 (강제적 형변환만 가능하며, 될 때도 있고, 안될 때도 있다)
 * 
 */
public class PolymorphismDemo {
	public static void main(String[] args) {
//		Test t = new Test();
//		Demo d = new Demo();
		Test t = new Demo(); // 자식주소를 부모의 주소에 접근
		
//		if (t instanceof Demo) { // instanceof 비교연산자로 부모 -> 자식 가능한지 판단
//			d = (Demo) t;
//		} else {
//			System.out.println("형변환 불가능");
//		}
	}
}
class Test {} // 부모
class Demo extends Test {} // 자식

