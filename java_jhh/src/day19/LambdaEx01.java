package day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LambdaEx01 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(10);
		list.add(-1);
		list.add(100);
		list.add(22);

		System.out.println(list);
		Collections.sort(list, (a,b)-> a-b);
		Collections.sort(list, new Comparator<Integer>() {
		
		
		
	}

}
