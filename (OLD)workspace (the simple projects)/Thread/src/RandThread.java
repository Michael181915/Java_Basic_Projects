public class RandThread {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new DataStr("1"));
		Thread t2 = new Thread(new DataStr("2"));
		Thread t3 = new Thread(new DataStr("3"));
		t1.start();
		t2.start();
		t3.start();
	}

}
