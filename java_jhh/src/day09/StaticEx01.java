package day09;

public class StaticEx01 {

	public static void main(String[] args) {
		KiaCar k1 = new KiaCar("모닝");
		KiaCar k2 = new KiaCar("레이");
		KiaCar k3 = new KiaCar("k3");
		k1.print();
		k2.print();
		k3.print();
		k1.name = "K5";
		//k1.logo = "Kia";//가능은 하지만 일반적이진 않다.
		KiaCar.logo = "Kia";
		System.out.println("------------------");
		k1.print();
		k2.print();
		k3.print();
	}

}
/* static 필드/메소드 => static메소드/객체 메소드에서 사용가능
 * 객체필드 메소드 = >객체 메소드에서 상ㅇ가능
 * final 필드 : 상수 =>값을 변경할수 없다.
 * 
 * 
 * */


/*static => 클래스 필드/메소드
- 같은 클래스로 만들어진 모든 객체들이 공유하는 필드.메소드에 붙이는 ㅇㅇㄱ어
크랠스명으로 호출
클래스가 ㅔ모리에 로딩이 되면 필드 메소드 생성
*/


//static이 안붙은 필드 메소드 => 인스턴트 필드. 메소드 객체필드/메소드
/*각 개체마다 필드/메소드를 가짐
 * -객체명으로 호출
 * -객체를 생성하는 시점에필드와 메소드가 생성
*/
/* static 필드/메소드 => static 메소드 /객체 메소드에서 사용가능
 * 필드/메소드 => static 메소드 /객체 메소드에서 사용가능
 * 
 * */

class KiaCar{
	public static String logo = "KIA";
	String name;
	public KiaCar(String name) {
		this.name = name;
	}
	public void print() {
		System.out.print(logo);
		System.out.println(" : " + name);
	}
	public static void ptintLogo() {
		System.out.print(Logo);
		System.out.println(" : " + name);
		System.out.print( );
	}
}