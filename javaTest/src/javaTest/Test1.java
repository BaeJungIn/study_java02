package javaTest;

import java.io.*;

public class Test1 {

		public static void main (String[] args)throws Exception{
			
		int jumsu; //int 변수로 jumsu 저장
	        BufferedReader inbr = new BufferedReader(new                    InputStreamReader(System.in));

	String table[][] = {{"95","90","85","80","75","70","65","60","0"},
			{"A+","A0","B+","B0","C+","C0","D+","D0","F"}};
			//학점 테이블을 2차원 배열로 저장
			
			System.out.println("학점 평가를 시작합니다.");
			System.out.println("[999]를 입력하면 종료됩니다!");
			System.out.println();
			System.out.println("[ 학점 테이블 ]");
			
			for(int x=0;x<2;x++){ //x를 2로 저장하여 2열 반복 
			
				System.out.println();
				if(x==0) //열이 1일 때 실행
					System.out.print("점수는 :  ");
				else //열이 2 일 때 실행
					System.out.print("학점은 :  ");
	for(int y=0;y<9;y++){ //y를 9로저장하여 9행을 차례로 반복

	System.out.print(table[x][y] + "    "); //이중 for문이 실행되어 테이블 출력
					}
				}
				
		do{ //jumsu에 입력받을 수가 '999'가 아닐 때 반복 실행
			System.out.println();
			System.out.println("성적을 입력하세요!");
			jumsu = Integer.parseInt(inbr.readLine()); //임의의 수 입력
			

		if(jumsu < 0) //입력받은 jumsu가 0보다 작을 때 재입력 메시지 출력
		System.out.println("*"+jumsu+" ->  성적을 올바르게 입력하세요!");
	      else if(jumsu>100 && jumsu<999)
               //입력받은 jumsu가 100보다 크고 999보다 작을 때 재입력 메시지 출력
		System.out.println("*"+jumsu+" ->  성적을 올바르게 입력하세요!");
	       else if(jumsu>999)
               //입력받은 jumsu가 999보다 클 때 재입력 메시지 출력
		System.out.println("*"+jumsu+" ->  성적을 올바르게 입력하세요!");
	       else if(jumsu<=100 && jumsu>=Integer.parseInt(table[0][0]))
               //범위에 따른 성적 출력
		System.out.println("당신의 성적은 " + table[1][0] + "입니다!");
else if(jumsu<Integer.parseInt(table[0][0]) && jumsu>=Integer.parseInt(table[0][1]))
		System.out.println("당신의 성적은 " + table[1][1] + "입니다!");
else if(jumsu<Integer.parseInt(table[0][1]) && jumsu>=Integer.parseInt(table[0][2]))
		System.out.println("당신의 성적은 " + table[1][2] + "입니다!");
else if(jumsu<Integer.parseInt(table[0][2]) && jumsu>=Integer.parseInt(table[0][3]))
		System.out.println("당신의 성적은 " + table[1][3] + "입니다!");
else if(jumsu<Integer.parseInt(table[0][3]) && jumsu>=Integer.parseInt(table[0][4]))
		System.out.println("당신의 성적은 " + table[1][4] + "입니다!");
else if(jumsu<Integer.parseInt(table[0][4]) && jumsu>=Integer.parseInt(table[0][5]))
		System.out.println("당신의 성적은 " + table[1][5] + "입니다!");
else if(jumsu<Integer.parseInt(table[0][5]) && jumsu>=Integer.parseInt(table[0][6]))
		System.out.println("당신의 성적은 " + table[1][6] + "입니다!");
else if(jumsu<Integer.parseInt(table[0][6]) && jumsu>=Integer.parseInt(table[0][7]))
		System.out.println("당신의 성적은 " + table[1][7] + "입니다!");
else if(jumsu<Integer.parseInt(table[0][7]) && jumsu>=Integer.parseInt(table[0][8]))
		System.out.println("당신의 성적은 " + table[1][8] + "입니다!");	
				}
		while(jumsu!=999); //'999'가 입력되었을 때 do while문 종료
			System.out.println();
			System.out.println("성적 평가를 종료합니다!");	
			}
		}
