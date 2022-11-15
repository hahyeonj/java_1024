package day15;

import java.util.Objects;

public class Word {

	private String word;
	private String mean;
	
	public Word(String word, String mean) {
		this.word = word;
		this.mean = mean;
		
	}
	@Override
	public String toString() {
		return "[" + word + " : " + mean + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) {
			if(! (obj instanceof String)) {
				return false;
			}
			return word.equals(obj);
		}
			
		Word other = (Word) obj;
		return Objects.equals(word, other.word);
	}
	public void setMean(String mean) {
		this.mean = mean;		
	}
	
	
}
