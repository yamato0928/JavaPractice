
public class Chapter09_Ex2 {

    public static void main(String[] args) {
        int a = 976;
        int b = 427;
        System.out.println(a + " と " + b + " の最大公約数は、" + gcd(a, b) + "です。");
    }

    // ユークリッドの互除法で最大公約数を計算するメソッド
    static int gcd(int a, int b) {
        if (a < b) {
        	int c = a;
        	a = b;
        	b = c;
        }
        a %= b;
        if (a != 0) {
        	gcd(a,b);
        }
        return b;
    }
}
