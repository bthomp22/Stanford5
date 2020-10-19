import java.util.ArrayList;
import java.util.Scanner;

public class uniqueNames {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		
		
		while(true) {
			System.out.print("Input Name ");
			String n = keyboard.next();
			
			if (n.equals(" ")) {
				break;
			} else {
				if(!names.contains(n)) {
					names.add(n);
				}
			}
			
		}
		System.out.println("Names in Array List");
		for (String z : names) {
			System.out.println(z);
		}

	}

}
