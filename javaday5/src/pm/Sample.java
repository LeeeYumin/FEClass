package pm;

import java.io.FileWriter;
import java.io.IOException;

public class Sample {

	public static void main(String[] args) throws IOException {
		
		//FileOutputStream output = new FileOutputStream("out.txt");
		FileWriter fw = new FileWriter("out.txt");
		for (int i = 1 ; i < 11 ; i++) {
			String data = i + " 번째 줄입니다. \r\n";
			//output.write(data.getBytes());
			fw.write(data);
		}
		fw.close();
	}
}
