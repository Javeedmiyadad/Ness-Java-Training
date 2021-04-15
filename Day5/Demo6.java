package Day5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo6 {
	public static void main(String [] args ) {
		
		BufferedReader bufferedreader = null;
		try {
			bufferedreader = new BufferedReader(new FileReader("data.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally {
	            if(bufferedreader!=null){
	                try {
	                	bufferedreader.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	}
	}
}


