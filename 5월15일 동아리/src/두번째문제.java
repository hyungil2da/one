 	import java.util.*;
public class �ι�°���� {

	public static void main(String[] args) {
		//10������ �迭�� �����ϰ� 
		//1 0 0 0 0 0 0 0 0 0 ���� �ʱ�ȭ �ѵ� ����ϰ�
		//1�� �Է��ϸ� �� ĭ ����������
		//-1�� �Է��ϸ� �̵��ϵ��� �Ͻÿ�
		
		Scanner s = new Scanner(System.in);
		int map []  = new int[10];								//10ĭ¥�� �迭 ���� �⺻�� : 0,0,0,0,0,0,0,0,0,,0
		
		int b = 0;												//b��� ���� ����
		map [b] = 1;											//b�� 1�� �����ְ� ��
		for (int a =0; a<map.length; a++) {
		System.out.print(map[a] + " ");
		}														//map�� ������ ó����
		int c= 0;												//c��� ���� ����
		
		while (true) {
		System.out.println("�Է��ϼ�");							
		
	
		int input = s.nextInt();								//�Է¹ް�
			map[c] = 0;											//c�� 0���� �����ְ� ��
			
		if (input == 1) {
			
			b=b+1;
			c++;
			if(b>9) {
				b=0;
			}
		}
		else if (input == -1) {
			b=b-1;
			c--;
		}
		
		map [b] = 1;
		for (int a =0; a<map.length; a++) {
			System.out.print(map[a] + " ");
			}
		
	
		
		
		
		}	//while�� ��ȣ
		
		
		
		
		

	}

}
