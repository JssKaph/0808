
public class Student {  // 클래스
	private String name, hakbun; // 필드
	private int kor, eng, mat, edp, tot;
	private double avg;
	private char grade;
	
	public Student() { // 기본 생성자 Default Constructor
	}

	public Student(String name, String hakbun, int kor, int eng, int mat, int edp) { // 생성자 이름이 같고, 파라미터가 다르고, 리턴타입이 없다. 오버로딩
		this.name = name;
		this.hakbun = hakbun;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.edp = edp;
	}
//	개터, 세터. 기본생성자가 있으므로 필요하지는 않지만 수정을 위해 생성 함
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getEdp() {
		return edp;
	}

	public void setEdp(int edp) {
		this.edp = edp;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	// toString
	@Override
	public String toString() {
		return String.format("%-10s%10s%5d%5d%5d%5d\t\t%5d%8.2f%5c",
				name, hakbun, kor, eng, mat, edp, tot, avg, grade);
	}
	
	
	

}
