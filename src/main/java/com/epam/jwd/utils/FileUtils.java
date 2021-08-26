package com.epam.jwd.utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.epam.jwd.entity.Paragraph;
import com.epam.jwd.entity.Sentence;
import com.epam.jwd.entity.Text;

public class FileUtils {
	private static final Logger log = Logger.getLogger(String.valueOf(FileUtils.class));

	public static List<String> getFileRows(final String filepath) {

		File file = new File(filepath);

		List<String> allLines = new ArrayList<>();

		try {
			allLines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
		} catch (IOException e) {
			log.info(e.getMessage());

		}

		return allLines;

	}

	public static void restoreTextInFile(final String filepath, Text text) {

		File file = new File(filepath);

		try {

			if (file.delete()) {
				file.createNewFile();
			} else {
				file.createNewFile();
			}

			for (Paragraph paragraph : text) {
				for (Sentence sentence : paragraph) {
					for (int i = 0; i < sentence.getSize(); i++){
						
						Files.write(file.toPath(), sentence.getPart(i).toString().getBytes(), StandardOpenOption.APPEND);
						
					}
				}
				Files.write(file.toPath(), System.lineSeparator().getBytes(), StandardOpenOption.APPEND);
			}

		} catch (IOException e) {
			log.info(e.getMessage());

		}

	}

}
