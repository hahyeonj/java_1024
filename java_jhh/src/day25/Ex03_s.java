package day25;

import java.util.ArrayList;

import lombok.Data;


public class Ex03_s {

	public static void main(String[] args) {
		
		int min = 1, max =9;
		int size = max - min + 1;
		ArrayList<Integer> list = new ArrayList<Integer>();		
		int count = 0;
		int r = 0;
		
		while(count < size){
			
			r = (int)(Math.random()*(max - min + 1) + min);
			boolean rContains = false; 
			rContains = list.contains(r);
			
			if(rContains = true) {
				continue;
			}
			list.add(r);
			count++;
		}
		for(int tmp : list) {
			System.out.print(tmp + " ");
		}
	}


}

