package javaTest;

import java.io.*;

public class Test1 {

		public static void main (String[] args)throws Exception{
			
		int jumsu; //int ������ jumsu ����
	        BufferedReader inbr = new BufferedReader(new                    InputStreamReader(System.in));

	String table[][] = {{"95","90","85","80","75","70","65","60","0"},
			{"A+","A0","B+","B0","C+","C0","D+","D0","F"}};
			//���� ���̺��� 2���� �迭�� ����
			
			System.out.println("���� �򰡸� �����մϴ�.");
			System.out.println("[999]�� �Է��ϸ� ����˴ϴ�!");
			System.out.println();
			System.out.println("[ ���� ���̺� ]");
			
			for(int x=0;x<2;x++){ //x�� 2�� �����Ͽ� 2�� �ݺ� 
			
				System.out.println();
				if(x==0) //���� 1�� �� ����
					System.out.print("������ :  ");
				else //���� 2 �� �� ����
					System.out.print("������ :  ");
	for(int y=0;y<9;y++){ //y�� 9�������Ͽ� 9���� ���ʷ� �ݺ�

	System.out.print(table[x][y] + "    "); //���� for���� ����Ǿ� ���̺� ���
					}
				}
				
		do{ //jumsu�� �Է¹��� ���� '999'�� �ƴ� �� �ݺ� ����
			System.out.println();
			System.out.println("������ �Է��ϼ���!");
			jumsu = Integer.parseInt(inbr.readLine()); //������ �� �Է�
			

		if(jumsu < 0) //�Է¹��� jumsu�� 0���� ���� �� ���Է� �޽��� ���
		System.out.println("*"+jumsu+" ->  ������ �ùٸ��� �Է��ϼ���!");
	      else if(jumsu>100 && jumsu<999)
               //�Է¹��� jumsu�� 100���� ũ�� 999���� ���� �� ���Է� �޽��� ���
		System.out.println("*"+jumsu+" ->  ������ �ùٸ��� �Է��ϼ���!");
	       else if(jumsu>999)
               //�Է¹��� jumsu�� 999���� Ŭ �� ���Է� �޽��� ���
		System.out.println("*"+jumsu+" ->  ������ �ùٸ��� �Է��ϼ���!");
	       else if(jumsu<=100 && jumsu>=Integer.parseInt(table[0][0]))
               //������ ���� ���� ���
		System.out.println("����� ������ " + table[1][0] + "�Դϴ�!");
else if(jumsu<Integer.parseInt(table[0][0]) && jumsu>=Integer.parseInt(table[0][1]))
		System.out.println("����� ������ " + table[1][1] + "�Դϴ�!");
else if(jumsu<Integer.parseInt(table[0][1]) && jumsu>=Integer.parseInt(table[0][2]))
		System.out.println("����� ������ " + table[1][2] + "�Դϴ�!");
else if(jumsu<Integer.parseInt(table[0][2]) && jumsu>=Integer.parseInt(table[0][3]))
		System.out.println("����� ������ " + table[1][3] + "�Դϴ�!");
else if(jumsu<Integer.parseInt(table[0][3]) && jumsu>=Integer.parseInt(table[0][4]))
		System.out.println("����� ������ " + table[1][4] + "�Դϴ�!");
else if(jumsu<Integer.parseInt(table[0][4]) && jumsu>=Integer.parseInt(table[0][5]))
		System.out.println("����� ������ " + table[1][5] + "�Դϴ�!");
else if(jumsu<Integer.parseInt(table[0][5]) && jumsu>=Integer.parseInt(table[0][6]))
		System.out.println("����� ������ " + table[1][6] + "�Դϴ�!");
else if(jumsu<Integer.parseInt(table[0][6]) && jumsu>=Integer.parseInt(table[0][7]))
		System.out.println("����� ������ " + table[1][7] + "�Դϴ�!");
else if(jumsu<Integer.parseInt(table[0][7]) && jumsu>=Integer.parseInt(table[0][8]))
		System.out.println("����� ������ " + table[1][8] + "�Դϴ�!");	
				}
		while(jumsu!=999); //'999'�� �ԷµǾ��� �� do while�� ����
			System.out.println();
			System.out.println("���� �򰡸� �����մϴ�!");	
			}
		}
