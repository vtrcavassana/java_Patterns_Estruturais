package Facade_ex5_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOFacade {
	
	private final InputStream input;
	
	public IOFacade(InputStream inputStream) {
		this.input = inputStream;
	}
	
	public void ReadFile() throws IOException {
		
		InputStreamReader inputreader = new InputStreamReader(input);
		BufferedReader buffread = new BufferedReader(inputreader);
		
		String s = buffread.readLine();
		
		while (s != null) {
			System.out.println(s);
            s = buffread.readLine();
		}
		buffread.close();
	}

}