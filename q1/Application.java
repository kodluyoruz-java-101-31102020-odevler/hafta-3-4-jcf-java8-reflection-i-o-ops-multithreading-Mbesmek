package q1;

import java.util.LinkedList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		//List<String> nameList1 = new LinkedList<String>();
		//nameList1.add("Hale");
		
		LinkedListManuel<String> nameList = new LinkedListManuel<String>();
		nameList.add("Melih");
	for(String name : nameList) {
			
			System.out.println(name);
		}
	}

}
