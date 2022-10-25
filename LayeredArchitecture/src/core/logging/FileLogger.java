package core.logging;

import java.lang.System.Logger;

public class FileLogger implements ILogger{

	@Override
	public void log(String data) {
		System.out.println("Logged to file: " + data);
		
	}

}
