package day14;

import java.util.ArrayList;
import java.util.Objects;

public class ListEx02 {

	public static void main(String[] args) {
		/* 클래스에 equals를 오버라이딩 하지 않으면 contains와 indexOf처럼
		 * 같은 객체인지를 제대로 판별하지 못해서 원하는 결과를 얻을 수 없다.
		 * 
		 * */
		
		ArrayList<Word> list = new ArrayList<Word>();
		list.add(new Word("time","시간"));
		list.add(new Word("apple","사과"));
		System.out.println(list);
		System.out.println(list.contains(new Word("apple", "사과")));
	}

}

class Word{
		private String word;
		private String mean;
		
		public Word(String word, String mean) {
			this.word = word;
			this.mean = mean;
					
		}
		public String toString() {
		return word + " : "+ mean;
		}
		@Override
		public int hashCode() {
			return Objects.hash(mean, word);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Word other = (Word) obj;
			return Objects.equals(mean, other.mean) && Objects.equals(word, other.word);
		}	
		
}