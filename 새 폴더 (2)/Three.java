	import java.util.*;
public class Three {

	public static void main(String[] args) {
		//수를 입력받으면 입력받은 수 이하의 수 중에서 소수의 개수 얻기
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("입력하셈");
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


