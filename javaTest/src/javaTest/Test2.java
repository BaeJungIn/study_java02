package javaTest;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<5; i++){
			for(int j=0; j<i+1; j++){
//			for(int j=0; j<5; j++){
//				if(i>=j){
//				System.out.print("*");
//			}else System.out.print(" ");
				System.out.print("*");
				}
			System.out.println();
			}
			
		System.out.println("=====================================");
		
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(i+j>=4){
					System.out.print("*");
				}else System.out.print(" ");
				
			}
			
			System.out.println();
		}
		}
	}

