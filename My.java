package Exam02;

public class My {
	
	// ������ �Դ� ���
//	public void ������Open(������ snack) {
//		snack.open();
//	}
//	public void Ȩ����Open(Ȩ���� snack) {
//		snack.open();
//	}
//	public void ��ĨOpen(��Ĩ snack) {
//		snack.open();
//	}
	
	public void snackOpen(Snack snack) {
		snack.open();
		
		// ��ĳ���� �� ���¿��� �Ͻ������� ����Ŭ������ �ִ�
		// ����� �����ϰ� ������ -> �ٿ�ĳ����
		// ���� Ŭ������ �ٿ�ĳ���� �� ��ü�� = (����Ŭ������) ��ĳ���� �� ��ü��
				
		if (snack instanceof ��Ĩ) {
			// snack �̶�� ������ ��Ĩ���κ���
			// ��ĳ���� �� �������
			// �ٿ�ĳ���� ���ּ���
			��Ĩ ssunChip = (��Ĩ) snack;
			ssunChip.sorce();
		}
	}
}
