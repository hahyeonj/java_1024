package day06;

import java.util.Scanner;

public class ArrayScoreEx01 {

	public static void main(String[] args) {
		/*5명의 학생의 국어, 영어, 수학성적을 저장하기 위한 배열을 만들고.
		 * Scanner를 이용하여 입력받아, 국어평균, 영어평균, 수학 평균을 구하는 코드를
		 * 작성하세요.
		 * */
		int kor[] = new int[5];
		int eng[] = new int[5];
		int math[] = new int[5];
	
		Scanner scan = new Scanner(System.in);
		//arr.length : 배열의 크기를 알려줌
		
		
		System.out.println("학생" + (i+1) +"의 국어, 영어, 수학 성적을 입력 : ");
		kor[i] = scan.nextInt();	
		eng[i] = scan.nextInt();
		math[i] = scan.nextInt();
		
		/*
		 * for(int i = 0; i<kor.length; i++) { System.out.print(i+1 + "번째 학생 국어성적 : ");
		 * kor[i] = scan.nextInt(); System.out.println(i+1 + "번째 학생 국어성적 : " + kor[i]);
		 * }
		 * 
		 * for(int i = 0; i<eng.length; i++) { System.out.print(i+1 + "번째 학생 영어성적 : ");
		 * eng[i] = scan.nextInt(); System.out.println(i+1 + "번째 학생 영어성적 : " + eng[i]);
		 * } for(int i = 0; i<math.length; i++) { System.out.print(i+1 +
		 * "번째 학생 수학성적 : "); math[i] = scan.nextInt(); System.out.println(i+1 +
		 * "번째 학생 수학성적 : " + math[i]); }
		 */		/* 학생 성적의 평균을 구하는 코드를 작성하세요
		 * 
		 * 
		 * */
		
		//과목별 합(총점)
		double korSum = 0, engSum = 0, mathSum = 0;
		int stdCount;
		for(int i = 0; i<stdCount; i++) {
			korSum += kor[i];
			engSum += kor[i];
			mathSum += kor[i];
		}
		
		
		
		/*int sumKor = 0;
		for(int i = 0; i<kor.length; i++) {
		
			sumKor = sumKor + kor[i];
		}	
		
		int sumEng = 0;
		for(int i = 0; i<eng.length; i++) {
		
			sumEng = sumEng + eng[i];
		}

		int sumMath = 0;
		for(int i = 0; i<math.length; i++) {
		
			sumMath = sumMath + math[i];
		}	*/
			
		//과목별 평균
		System.out.println("국어 평균 성적은 " + (korSum / stdCount));
		System.out.println("영어 평균 성적은 " + (engSum / stdCount));	
		System.out.println("수학 평균 성적은 " + (mathSum / stdCount));
		/*System.out.println("국어 평균 성적은 " + ((double)sumKor / kor.length));
		System.out.println("영어 평균 성적은 " + ((double)sumEng / eng.length));	
		System.out.println("수학 평균 성적은 " + ((double)sumMath / math.length));
		*/
		
		//학생별 평균
		
		for(int i = 0; i<stdCount ; i++) {
			double sum = kor[i]+ eng[i] + math[i];
			System.out.println("학생" + (i+1) + "의 평균 : " + sum/3);
		}
		System.out.println();
		
		scan.close();
	}

}
