package com.app.util;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtil {
	
	private FileUtil() {
	    // restrict instantiation
	  }

	  public static final String folderPath =  "Uploaded_Docs//";
	  public static final Path filePath = Paths.get(folderPath);

}
