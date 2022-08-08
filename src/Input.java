import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
	private Student [] array;
	private Scanner sc;
	private File file;
	
	public Input(Student[] array, String path) {  // 생성자 = 멤버 변수 초기화
		this.array = array;
		this.file = new File(path);
		try {
			this.sc = new Scanner(this.file, "utf-8"); // 빨간 줄이 뜨는 이유는 후처리를 해달라는 의미
//			System.out.println("파일을 찾았습니다."); 확인완료
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} 
	}
	
	public void fileinput() {
		for (int i=0; i<this.array.length; i++) {
			String line = this.sc.nextLine(); // 1101     한송이     78     87     83     78
			//1. split 사용
//			String [] values = line.split("\\s+"); // \s 스페이스 따위의 공백 , + 적어도 한 칸 이상
//			System.out.println(values[1]);
			//2. 스캐너를 이용하여서 뽑아냄
			Scanner myScanner = new Scanner(line); // 방금 읽어들인 1줄을 스캐너에 넣음
			myScanner = myScanner.useDelimiter("\\s+");
			this.array[i] = new Student(myScanner.next(), myScanner.next(),
					myScanner.nextInt(), myScanner.nextInt(), myScanner.nextInt(), myScanner.nextInt()); 
			// 학번, 이름 (문자열), 국어, 수학, 영어, 전산(정수) 순서대로 문자열에 저장
			
		}
	}
}
