package day32;

public class MathEx01 {

	public static void main(String[] args) {
		double pi = 3.141592;
		//소수점 첫째자리에서 반올림
		double pi1 = Math.round(pi);
		System.out.println(pi1);
		//소수점 둘째자리에서 반올림
		double pi2 = Math.round(pi*10)/10.0;
		System.out.println(pi2);
		//소수점 셋째자리에서 반올림
		double pi3 = Math.round(pi*100);
		//소수점 넷째자리에ㅓㅅ 반올림
		double pi4 = Math.round(pi*1000);
		System.out.println(pi4);
		//소수점 넷째자리에ㅓㅅ 반올림
		int num = 4;
		double pi4_2
			=Math.round(pi*Math.pow(10, num-1)) /Math.pow(10, num-1);
		System.out.println(pi4_2);
	}

}
