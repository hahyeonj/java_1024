package day33;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class output {

	public static void main(String[] args) {
		FileWriter fw = null;
				try {
					fw = new FileWriter("test.txt");
					fw.write(97);
					fw.write(65);
					fw.close();
					
				}catch(FileNotFoundException e){
					e.printStackTrace();
				}catch(IOException e) {
					e.printStackTrace();
				}

	}

}
