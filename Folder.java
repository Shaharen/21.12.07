package ���01;

public class Folder extends Tell{
	// ��ӹ��� ���� Ŭ����
	// ����Ŭ������ extends ����Ŭ������
	// ���� Ŭ������ �ִ� �����Ϳ� ����� ���� �����޴´�!
	// Ȯ�� -> �ʿ��� ��ɸ� �߰��� ����
	public void Camera() {
		System.out.println("������ ���");
	}
	// �������̵� -> ������
	@Override // ������̼� ����
	public void ButtonClick() {
		String name = "��ȯ";
		System.out.println("�� �� �� ��ư�� Ŭ���մϴ�");
	}
}
