package fr.ensibs.fs;

import java.io.FileNotFoundException;
import java.io.InputStream;

public interface FileSystem {
  
	public InputStream inputStreamProvider(String path);
		
}
