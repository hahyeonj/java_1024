package day05;

public class ArrayEx05 {

	public static void main(String[] args) {
		/*5개짜리 배열을 생성하여 2부터 5개의 소수를 배열에 저장하고 출력하세요.
		 * */
	/*	int index[] = new int[5];
		int i, num, k, count = 0;
		for(i = 0; i<index.length; i++) {
			for(num=2, k=1; k<= num ; num++, k++) {
				if(num % k == 0) {
					count++;
				}
			}
			if(count == 2) {
				index[num] = num;
				System.out.print(num + " ");
				
			}
		}			
	*/
		int num = 121;//소수인지 판별하려는 수
		int i;//약수를 찾기 위해 1부터 num까지 증가시키려는 수
		int count;//num의 약수 개수를 저장하는 수
		int arr[] = new int[5];
		int index = 0;
		
		for(num = 2; ;num++) {
			//num가 소수인지 판별하는 코드
			for(i=1, count =0; i <= num; i++) {
				if(num % i ==0) {
					count++;
				}
			}
			if(count == 2) {
				arr[index] = num;
				index++;
			}
			if(index == arr.length) {
				break;
			}
		}
		for(int tmp : arr) {
			System.out.println(tmp + " ");
		}
	
	
	
	}

}



		