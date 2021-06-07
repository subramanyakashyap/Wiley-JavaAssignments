package com.google.matrices;

public class SumOfMatricesMain {
	
	public static void displayMatrix(int[][] mat){
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[0].length;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfMatrices sum = new SumOfMatrices();
		int[][] mat1 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		int[][] mat2 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		int[][] res = sum.sumOfMatrices(mat1, mat2);
		displayMatrix(res);
	}

}
