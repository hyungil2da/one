	import java.util.*;
public class Three {

	public static void main(String[] args) {
		//���� �Է¹����� �Է¹��� �� ������ �� �߿��� �Ҽ��� ���� ���
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("�Է��ϼ�");
		 int number = s.nextInt();

	        int count = 0;
	        for (int i = 2; i < number; i++) {
	            boolean isPrime = true;
	            for (int j = 2; j <= Math.sqrt(i); j++) {
	                if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime) {
	                count++;
	            }
	        }

	        System.out.println(count);

		
	
				
				
		
		
		
		
	}
	}


