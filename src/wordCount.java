import acm.program.*;
import java.io.*;
public class wordCount extends ConsoleProgram{
	public void run() {
		int lines, words, chars = 0;
		
		
	}
	private BufferedReader openFile(String s) {
		BufferedReader rd = null;		
		while(rd == null) {
			String file = readLine(s);
			try {
				rd = new BufferedReader(new FileReader(file));
			} catch (IOException exception) {
				println("Cant find file");
			}
		}
		return rd;
	
	}
		
	
}
