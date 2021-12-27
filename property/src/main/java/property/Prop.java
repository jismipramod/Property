package property;

import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Prop {

	public static void main(String[] args) throws IOException {
		FileReader g= new FileReader("C:\\Users\\jismi\\eclipse-workspace\\property\\src\\main\\resources\\Login.properties");
		Properties p= new Properties();
		p.load(g);
		System.out.println(p.getProperty("userid"));
		System.out.println(p.getProperty("password"));
		
}

}
