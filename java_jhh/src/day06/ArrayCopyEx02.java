package day06;

public class ArrayCopyEx02 {

	public static void main(String[] args) {
		//깊은 복사 예제
		int arr1[] = new int[3];
		int arr2[];
		
		//깊은 복사 예제1
		int tmpArr[] = new int [arr1.length];
		for(int i = 0; i<arr1.length; i++) {
			tmpArr[i] = arr1[i];
		}
		arr2 = tmpArr;
		*/
		
		//깊은 복사 예제2
		/*arr2 = new int[arr1.length];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);*/
		
	
	
		//깊은 복사 예제 3
		//arr2 = Arrays.copyOf(arr1, arr1.lenth);
		
		//arr1과 arr2 값


	}

}
