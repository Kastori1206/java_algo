package swea.d3;

import java.util.LinkedList;
import java.util.Scanner;

public class swea1229 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int test_case = 1 ;test_case<=10;test_case++) {
			int N = sc.nextInt(); //원본 암호문의 길이
			
			LinkedList<Integer> list = new LinkedList<>();//원본암호문
			
			for(int i =0;i<N;i++) {
				list.add(sc.nextInt());
			}
			
			int M = sc.nextInt(); //명령어의 개수
			for(int i= 0 ; i<M;i++) {
				String command = sc.next();
				int index = sc.nextInt();
				int size = sc.nextInt();
				if(command.equals("I")) {			
					for(int j = 0; j<size;j++) {
						int temp = sc.nextInt();
						list.add(index, temp);
						index++;
					}
				}else if(command.equals("D")) {				
					for(int j =0;j<size;j++) {
						list.remove(index);
					}
				}				
			}
			System.out.print("#"+ test_case+" ");
			for(int j=0;j<10;j++) {
				System.out.println(list.get(j));
			}
			System.out.println();
		}
	}
}
