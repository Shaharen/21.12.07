package ���콺;

public class WheelMouse extends Mouse {

	public void scroll() {
		System.out.println("��ũ���ϱ�");
	}
	
	// �������̵� -> ��Ӱ��迡�� �ڽ� Ŭ������ �θ�Ŭ������ ����� "������"�Ҷ� ����Ѵ�
	@Override
	public void leftClick() {
		System.out.println("��Ŭ��");
		System.out.println("�巡��");
	}
}
