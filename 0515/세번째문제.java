 	import java.util.*;
public class 세번째문제 {

	public static void main(String[] args) {
		// 5*5 이차원 배열을 선언하고 
		// 1을 입력하면 한칸 오른쪼긍로
		// -1을 입력하면 한칸 왼쪽으로
		// 2를 입력하면 한 칸 위로
		// -2를 입력하면 한 칸 아래로
		// 0을 입력하면 종료하도록 하시오

		int map [][] = { {0,0,0,0,0} , {0,0,0,0,0} ,{ 0,0,0,0,0} ,{0,0,0,0,0} ,{0,0,0,0,0} } ;			//5곱하기 5배열
		
		
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
			
		
		
		
		
	}

}
