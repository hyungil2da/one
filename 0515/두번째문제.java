 	import java.util.*;
public class 두번째문제 {

	public static void main(String[] args) {
		//10길이의 배열을 선언하고 
		//1 0 0 0 0 0 0 0 0 0 으로 초기화 한뒤 출력하고
		//1을 입력하면 한 칸 오른쪽으로
		//-1을 입력하면 이동하도록 하시오
		
		Scanner s = new Scanner(System.in);
		int map []  = new int[10];								//10칸짜리 배열 생성 기본값 : 0,0,0,0,0,0,0,0,0,,0
		
		int b = 0;												//b라는 변수 설정
		map [b] = 1;											//b는 1로 보여주게 함
		for (int a =0; a<map.length; a++) {
		System.out.print(map[a] + " ");
		}														//map을 보여줌 처음에
		int c= 0;												//c라는 변수 설정
		
		while (true) {
		System.out.println("입력하셈");							
		
	
		int input = s.nextInt();								//입력받고
			map[c] = 0;											//c는 0으로 보여주게 함
			
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
		
	
		
		
		
		}	//while문 괄호
		
		
		
		
		

	}

}
