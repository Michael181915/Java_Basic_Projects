import java.util.ArrayList;

public class Main {
	private static ArrayList<Object> list = new ArrayList<Object>();
	
	public static void main(String[] args) {
		addObjects();
		proceed();
	}

	private static void proceed() {
		System.out.println(list.size());
		Object obj = null;
		
		for(Object element: list) {
		    obj = element; 
		    break;
	    }
	    list.remove(obj);
	    
		System.out.println(list.size());
	}

	private static void addObjects() {
		for(int x=0; x<5; x++) {
			list.add(new Object());
		}
	}
}
