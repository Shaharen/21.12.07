package ���콺;

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
		// ��ĳ���� -> ���� Ŭ������ ��ü�� ���� Ŭ������ ��ü Ÿ������ ����ȯ
		Mouse mouse3 = mouse2;
		mouse3.rightClick();
		// �������̵��� ����� ���
		// ��ĳ���� �ϴ��� �ڽĿ� �ִ� ����� ����Ѵ�
		mouse3.leftClick();
		// mouse3.scroll();	// ��ĳ�����Ͽ��� ������ ������ scroll ��� �Ұ�
		
		
	}

}
