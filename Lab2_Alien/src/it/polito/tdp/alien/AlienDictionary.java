package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class AlienDictionary {
	
	List<Word> dizionario = new LinkedList<Word>();
	Word w;
	
	public AlienDictionary() {
		super();
		
	}

	public void addWord(String alienWord, String translation) 
	 {
		
		w = new Word(alienWord, translation);
		 dizionario.add(w);
		 for(int i=0; i<dizionario.size(); i++) {
			 if(w.getAlienWord().compareTo(alienWord)==0)
			 {
				 dizionario.set(i,w);
			 }
				dizionario.add(w); 
		 }
		 
	}
	
	 public String translateWord(String alienWord) {
		 
		 for(int i =0; i<dizionario.size(); i++) {
			 if(alienWord.compareTo(w.getAlienWord())==0) {
				 return w.getTranslation();
			 }
		 }
		 
		return alienWord;
		 
	 }
}
