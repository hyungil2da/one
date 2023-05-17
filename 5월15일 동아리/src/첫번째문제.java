import java.util.*;
public class 첫번째문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int map []  = {1,0,0,0,0,0,0,0,0,0};
		
		for (int a =0; a<map.length; a++) {
		System.out.print(map[a] + " ");
		}
		System.out.println("입력하셈");
		int input = s.nextInt();
		
		map[0] = 0;
		
		input = input -1;
		map[input] = 1;
		
		
		
		for (int a =0; a<map.length; a++) {
			
			System.out.print(map[a] + " ");
			}
		
		
		
			
		//map [input] = 1;
		
		
		
		
		
	}

}
