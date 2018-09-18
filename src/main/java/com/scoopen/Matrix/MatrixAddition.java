package com.scoopen.Matrix;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int [][]matrix1= {{1,2,3},{2,3,4},{4,5,6}};

		int [][]matrix2= {{1,2,3},{2,3,4},{4,5,6}};
		int [][]result=new int[3][3];

		System.out.println("First Matrix");
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {

				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println(" ");
		}

		System.out.println("Second Matrix");
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println(" ");
		}

		System.out.println("Addition Matrix");
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
		result[i][j]=matrix1[i][j]+matrix2[i][j];

		System.out.print(" "+ result[i][j] +" ");
			}
			System.out.println(" ");
		}


	}

}
