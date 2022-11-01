package day07;

public class MethodEx06 {

	public static void main(String[] args) {
		int [] arr = {1, 3, 5};
		test(arr);
		for(int tmp : arr) {
			System.out.println(tmp+" " );
			
		}
	}
	public static void test(int []arr) {
		arr = new int [3];//이 코드에 의해 main에 있는 arr가 바뀌지 않음
		//arr[0] = 10;
	}
}
