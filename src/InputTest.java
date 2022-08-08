import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class InputTest {
	private Student [] array;
	private Input input;
	
	@Before // 테스트 전에 비포
	public void init() {
		array = new Student[12];
		String path = "C:/Temp/sungjuk_utf8.dat";
		input = new Input(array, path);
	}
	
	@Test
	public void testInput() { // Input class의 생성자 검사
		this.input.fileinput();
		for(Student student : this.array) {
			System.out.println(student);
		}
//		assertEquals("한송이", this.array[0].getName()); //기대값, 실제값
//		assertEquals((78+87+83+78), (this.array[0].getKor()+this.array[0].getEng()+this.array[0].getMat()+this.array[0].getEdp()));
	}
}
