package com.epam.jwd.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.epam.jwd.entity.Text;
import com.epam.jwd.entity.Word;
import com.epam.jwd.utils.TaskEightComparator;
import com.epam.jwd.utils.TaskSevenComparator;

public class Tasks {

	public void taskSix(Text text) {

		
		List<Word> list = text.getAllWords();

		Collections.sort(list);

		char firstChar = 32;

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).toString().charAt(0) == firstChar) {
				System.out.print(list.get(i) + ", ");
			} else {

				firstChar = list.get(i).toString().charAt(0);
				System.out.println();
				System.out.print(list.get(i) + " ");
			}

		}

	}
	
	public void taskSeven(Text text){

		List<Word> list = text.getAllWords();
		
		Collections.sort(list, new TaskSevenComparator());
		
		for (Word word : list) {
			System.out.println(word);
		}
		
	}
	
	public void taskEight(Text text){

		List<Word> allWords = text.getAllWords();
		List<Word> allVowelStartsWords = new ArrayList<>();
		
		String vowels = "aAeEiIoOuUyY";
		
		for (Word word : allWords) {
			if(vowels.contains(Character.valueOf(word.toString().charAt(0)).toString())){
				allVowelStartsWords.add(word);
			}
		}
		
		Collections.sort(allVowelStartsWords, new TaskEightComparator());
		
		for (Word word : allVowelStartsWords) {
			System.out.println(word);
		}
	}

}
