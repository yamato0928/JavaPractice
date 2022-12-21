
public class Chapter06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long longNumber = 10000000000L;
		double doubleNumber = 3.14;
		boolean tOrF = true;
		Integer integerNumber = 100;
		Float floatNumber = 1.4142F;
		Character CharacterWord = 'う';
		int array[] = new int[5];
		int j = 0;
		for(int i=0;i<5;i++) {
			array[i] = j;
			j += 10;
		}
		
		System.out.println(longNumber);
		System.out.println(doubleNumber);
		System.out.println(tOrF);
		System.out.println(integerNumber);
		System.out.println(floatNumber);
		System.out.println(CharacterWord);
		System.out.println(array[3]);
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println(array);

	}

}
