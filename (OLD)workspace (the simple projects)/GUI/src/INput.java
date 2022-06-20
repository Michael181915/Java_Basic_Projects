public class INput {
	public static void main(String args[]) {
		Reader a = new Reader();
		a.Scan();
		a.i = count(a.i);
		a.k = count(a.k);
		a.Scan(a.i, a.k);
	}
	
	private static float count(float x) {
		x = x + 1;
		return x;
	}
}
