package com.epam.jwd.main;

import java.util.List;

import com.epam.jwd.entity.Text;
import com.epam.jwd.parsers.TextParser;
import com.epam.jwd.utils.FileUtils;

public class MainClass {

	public final static String INITIAL_FILE_PATH = "./res/text.txt";
	public final static String RESTORED_FILE_PATH = "./res/restored.txt";
	
	public static void main(String[] args){
		
		List<String> list = FileUtils.getFileRows(INITIAL_FILE_PATH);
		
		TextParser tp = new TextParser(list);
		Text text = tp.parseRows();
		
		FileUtils.restoreTextInFile(RESTORED_FILE_PATH, text);

	}
	
}
