public class INput {
	public static void main(String args[]) {
		Reader a = new Reader();
		a.Scan();
		a.i = count(a.i);
		a.k = count(a.k);
		System.out.println("������ �����: " + a.i);
		System.out.println("������ �����: " + a.k);
	}
	
	private static int count(int x) {
		x = x + 1;
		return x;
	}
}
