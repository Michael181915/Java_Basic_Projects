import java.util.*;

public class DataStr implements Runnable{

	int time;
	String name;
	Random r = new Random();
	
	public DataStr(String name) {
		this.name = name;
		time = r.nextInt(749);
	}
	
	public void run() {
		System.out.printf("����� %s ���� %d\n", name, time);
		try {
			Thread.sleep(time);
		}catch(Exception e) {}
		System.out.printf("����� %s ��������� � ����������\n", name);
	}
}
