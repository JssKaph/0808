import java.util.Scanner;

//Mammal, Lion, Cat, Dog, Korean, American.java 참고
public class PolymorphismDemo2 {
	public static void main(String[] args) {
		String y_n = null;
		Scanner sc = new Scanner(System.in);
		do {
			showMenu();
			int choice = input(sc); // 1~5번까지 넣는다.
			output(choice); // input에서 output으로 넘긴다.
			System.out.printf("Again? (y/n) : ");
			y_n = sc.next();
		} while (y_n.equals("y") || y_n.equals("Y"));
		if (y_n.equals("n") || y_n.equals("N"))
			System.out.println("프로그램이 종료 되었습니다.");
	}

	static void showMenu() {
		System.out.println("**********Menu***********");
		System.out.println("1. Lion");
		System.out.println("2. Cat");
		System.out.println("3. Dog");
		System.out.println("4. Korean");
		System.out.println("5. American");
	}

	static int input(Scanner myScanner) {
		System.out.print("당신은 어느 종족이십니까? (1~5) : ");
		return myScanner.nextInt();
	}

	static void output(int choice) {
		Mammal m = null;
		switch (choice) {
		case 1:
			m = new Lion(); // 선언형 = 실제형, Mammal의 saySomething에 덮어 씌움
			break;
		case 2:
			m = new Cat(); // 컴파일형 = 런타임형
			break;
		case 3:
			m = new Dog(); 
			break;
		case 4:
			m = new Korean();
			break;
		case 5:
			m = new American();
			break;
		default:
			System.out.println("잘못된 번호 입니다.");
			return; // output 넘어왔던 위치로 넘어간다.
		}
		m.saySomething(); // sysout
	}
}
