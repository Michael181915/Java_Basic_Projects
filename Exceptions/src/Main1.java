
public class Main1 {

	public static void main(String[] args) {
		int[] array = new int[5];
		for(int i=0;i<5;i++) {
			array[i] = i;
		}

		for(int i=0;i<5;i++) {
			System.out.println(array[i]);
		}
	}

}

//Нужно избегать OfBounds