package 마우스;

public class MouseMain {

	public static void main(String[] args) {
		Mouse mouse1 = new Mouse();
		
		mouse1.leftClick();
		mouse1.rightClick();
		
		System.out.println();
		WheelMouse mouse2 = new WheelMouse();
		
		mouse2.leftClick();
		mouse2.rightClick();
		mouse2.scroll();
		
		System.out.println();
		// 업캐스팅 -> 하위 클래스의 객체가 상위 클래스의 객체 타입으로 형변환
		Mouse mouse3 = mouse2;
		mouse3.rightClick();
		// 오버라이딩한 기능일 경우
		// 업캐스팅 하더라도 자식에 있는 기능을 사용한다
		mouse3.leftClick();
		// mouse3.scroll();	// 업캐스팅하였기 때문에 기존의 scroll 사용 불가
		
		
	}

}
