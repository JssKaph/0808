
public class OverrideDemo1 {
	public static void main(String[] args) {
		Point original = new Point(30, 50);
		Point another = new Point(30, 50);
		if (original.equals​(another))
			System.out.println("같다");
		else
			System.out.println("다르다");
	}
}

class Point /*extends Object*/ {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 오버라이드가 상속이 안된다는 것을 역이용 하여서 변경
	public boolean equals​(Object obj) {
		Point child = (Point)obj;
		if(this.x == child.x && this.y == child.y)
			return true;
		else 
			return false;
	}
}
