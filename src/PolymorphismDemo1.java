// 형변환
public class PolymorphismDemo1 {	
	public static void main(String[] args) {
//		Mammal 부모 = new Mammal();
//		부모.display(); // 부모의 display에 접근
//		Lion 자식 = new Lion();
//		자식.display(); // 자식의 display에 접근
		
		Mammal 부모 = new Lion(); // 형변환, 부모가 자식의 자원을 사용 = 다향성
		부모.display();
	//형변환이 되기위한 두가지의 조건
//		1. Override,
//		2. 형변환
		
	}
}
