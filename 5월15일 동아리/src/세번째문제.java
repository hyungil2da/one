 	import java.util.*;
public class ����°���� {

	public static void main(String[] args) {
		// 5*5 ������ �迭�� �����ϰ� 
		// 1�� �Է��ϸ� ��ĭ �����ɱ��
		// -1�� �Է��ϸ� ��ĭ ��������
		// 2�� �Է��ϸ� �� ĭ ����
		// -2�� �Է��ϸ� �� ĭ �Ʒ���
		// 0�� �Է��ϸ� �����ϵ��� �Ͻÿ�

		/*int map [][] = { {0,0,0,0,0} , {0,0,0,0,0} ,{ 0,0,0,0,0} ,{0,0,0,0,0} ,{0,0,0,0,0} } ;			//5���ϱ� 5�迭
		
		
		for (int a=0; a<map.length; a++) {
			
			for(int b=0; b<map[a].length; b++) {
				System.out.print(map[a][b]);
				
			}
			System.out.println();
			
		}
			Scanner s = new Scanner(System.in);
			int input = s.nextInt();
			int c = 0;
			//map[c] = 1;
			
			//if(input==1) 
			
		*/
		
		int a[][]=new int[5][5];
		a[0][0]=1;
		Scanner s=new Scanner(System.in);
		int c=0;
		int d=0;
		
		while(true) {
			int input=s.nextInt();
			if(input==1) {
				a[c][d]=0;
				d++;
				a[c][d]=1;
			}
			else if(input==-1) {
				a[c][d]=0;
				d--;
				a[c][d]=1;
			}
			else if(input==2) {
				a[c][d]=0;
				c++;
				a[c][d]=1;
			}
			else if(input==-2) {
				a[c][d]=0;
				c--;
				a[c][d]=1;
			}
			else {break;}
			
			
				for(int i = 0; i<a.length; i++) {
					for(int b = 0; b <a[i].length; b++) {
						System.out.print( a[i][b] );
					}System.out.println();
				}
		}
		
		
		
	}

}
