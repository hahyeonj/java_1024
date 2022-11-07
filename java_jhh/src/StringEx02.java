
public class StringEx02 {

	public static void main(String[] args) {
		/* 문자열 str에 search가 몇번 등장하는지 확인하는 코드를 작성하세요. */
		String str = "Hello world! My name is Hong ooo";
		String search = "oo";
		
		//str에서 search가 있는 위치를 찾음
		//-1이 아니면 부분문자열을 추출하고, count를 1증가
		//-이면 반복문 종료
		
		String tmp = str;
		int count = 0;
		while(true) {
			int index = tmp.indexOf(search);
			if(index == -1) {
				break;
			}
			tmp = tmp.substring(index + search.length());
			count++;
		}
		
		
		
		/*	
		int count = 0;
		do {
			System.out.println("e의 마지막번째 위치 : " + str.lastIndexOf(search));
			System.out.println("2번지부터 부분문자열" + str.substring(str.lastIndexOf(search),));
			count++;
		}while(str.lastIndexOf(str) != -1);
		System.out.println();
		*/
	}

}
