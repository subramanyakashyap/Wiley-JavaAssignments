package com.google.matrices;

public class SumOfMatrices {
	
	public int[][] sumOfMatrices(int[][] mat1, int[][] mat2){
		int[][] res = new int[mat1.length][mat1[0].length];
		for(int i=0;i<mat1.length;i++){
			for(int j=0;j<mat1[0].length;j++){
				res[i][j] = mat1[i][j]+mat2[i][j];
			}
		}
		return res;
	}

}
