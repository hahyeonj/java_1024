package day25;
import java.util.ArrayList;
import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> res = new ArrayList<Integer>();
		int min =1, max = 9;
		for(int i = min; i<=max; i++)
			list.add(i);
		while(list.size() != 0) {
			int r = random(0, list.size() -1);
			Integer num = list.remove(r);
			res.add(num);
		}
		System.out.println(res);
	}
	public static int random(int min, int max) {
		if(max < min) {
			int tmp = max;
			max = min;
			min = tmp;
		}
		Random r = new Random();
		//nextInt
		return r.nextInt(max - min + 1 ) + min;
	}
}
