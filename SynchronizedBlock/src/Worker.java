import java.util.ArrayList;
import java.util.Random;

public class Worker {
	private ArrayList<Integer> list1 = new ArrayList<Integer>();
	private ArrayList<Integer> list2 = new ArrayList<Integer>();
	private Random random = new Random();
	
	private synchronized void partOne() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list1.add(random.nextInt(100));
	}
	
	private synchronized void partTwo() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list2.add(random.nextInt(100));		
	}
	
	private void proceed() {
		for(int i=0;i<1000;i++) {
			partOne();
			partTwo();
		}
	}
	
	public void start() {
		System.out.println("Начинаем...");
		long startTime = System.currentTimeMillis();
		proceed();
		long endTime = System.currentTimeMillis();
		System.out.println("Потраченное время: " + (endTime-startTime)+"\n"
		        + "Лист 1: "+list1.size()+"\n"
		        + "Лист 2: "+list2.size());
	}
}
