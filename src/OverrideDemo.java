/*
 * 메소드의 오버라이드 조건
 * 1. 메소드의 시그네쳐가 같은가?
 * - 메소드의 필수 3요소 (이름이 있고, 괄호가 있고, 리턴타입)
 * 2. 접근제한자(Access Modifier)의 관계
 * - private < package(default) < protected <public
 * protected는 부모자식만 사용가능, package 해당 클래스내에서만 사용 가능
 * - 자식은 부모의 접근 제한자보다 같거나 넓어야 한다.
 * 
 */
public class OverrideDemo {
	public static void main(String[] args) {
		Jasik jasik = new Jasik(); // 항상 주소는 자식클래스로
		jasik.makeMoney();
	}
}
