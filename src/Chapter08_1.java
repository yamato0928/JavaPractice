
public class Chapter08_1 {
	public static void main(String[] args) {
		int length = 3;
		if (length <= 5) {
			System.out.println("とても近いです");
			}
		else if (length > 5 && length <= 10) {
			System.out.println("近いです");
		}
		else if (length > 10 && length <= 15) {
			System.out.println("遠いです");
		}
		else if (length > 15) {
			System.out.println("とても遠いです");
		}
	}

}
