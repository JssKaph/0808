
public class PolymorphismDemo5 {
	public static void main(String[] args) {
		Object obj = new Object();
		String str = new String("Hello, World");
		obj = str; // 자식은 항상 부모로 형변환 가능
		System.out.println(obj.toString());
		
		if(obj instanceof String) {
			String another = (String)obj;
			System.out.println(another);
		}else {
			System.out.println("Disable.");
		}
	}
}
