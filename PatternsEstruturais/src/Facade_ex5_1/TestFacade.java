package Facade_ex5_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestFacade {

	public static void main(String[] args) throws IOException {
		
		String local = "C:\\Users\\Administrador\\eclipse-workspace\\PatternsEstruturais\\src\\Facade_ex5_1\\test.txt";
		
		InputStream input = new FileInputStream(local);
		
		IOFacade ioFacade = new IOFacade(input);
		
		ioFacade.ReadFile();
		

	}

}