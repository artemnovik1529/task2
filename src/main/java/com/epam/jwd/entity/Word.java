package com.epam.jwd.entity;

public class Word extends SimplePart implements Comparable<Word>{

	public Word(String item) {
		super(item);
	}

	@Override
	public boolean isWord() {
		return true;
	}

	@Override
	public boolean isSpace() {
		return false;
	}

	@Override
	public boolean isPunctuation() {
		return false;
	}

	@Override
	public int compareTo(Word o) {
		return getItem().compareToIgnoreCase(o.getItem());
	}
	
}
