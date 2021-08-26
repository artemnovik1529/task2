package com.epam.jwd.entity;

public class Punctuation extends SimplePart {

	public Punctuation(String item) {
		super(item);
	}

	@Override
	public boolean isWord() {
		return false;
	}

	@Override
	public boolean isSpace() {
		return false;
	}

	@Override
	public boolean isPunctuation() {
		return true;
	}

}
