package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class Word {

	private String alienWord; 
	private String translation;
	
	Word w = new Word(alienWord, translation);
	
	public Word(String alienWord, String traslation) {
		super();
		this.alienWord = alienWord;
		this.translation = translation;
	}
	
	
	public String getAlienWord() {
		return alienWord;
	}
	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}
	public String getTranslation() {
		return translation;
	}
	public void setTranslation(String translation) {
		this.translation = translation;
	} 
	
	/*public void addParola(String a, String p) {
		
	}*/
	
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;	
		
		Word other = (Word) obj;
		
		if(alienWord == null) {
			if(other.alienWord != null)
				return false;
		} else if (!alienWord.equals(other.alienWord))
			return false;
		
		return true;
		}
	
	
	
	
}
