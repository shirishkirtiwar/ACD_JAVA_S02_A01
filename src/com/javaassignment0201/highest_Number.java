package com.javaassignment0201;
		
		public class highest_Number {
			public static void main(String[] args) {			//main class
				int firstNum=16;	//initializing variable
				int secNum=64;		//initializing variable
				int thirNum=32;		//initializing variable
				int LargesNum;		//initializing variable
			LargesNum = thirNum >(firstNum>secNum ? firstNum :secNum) ? thirNum:((firstNum>secNum)? firstNum:secNum) ; //logic to find the greatest number
				System.out.println("largest Number among the three numbers(16,32,64) is: "+LargesNum); //printing the output
			}
		}


	


