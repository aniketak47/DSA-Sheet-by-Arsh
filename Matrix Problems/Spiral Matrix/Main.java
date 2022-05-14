// https://leetcode.com/problems/spiral-matrix/

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] matrix = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = scn.nextInt();
            }
        }

        List<Integer> ans = printSpiral(matrix);
        System.out.println("Spiral Matrix : ");
        System.out.println(ans);
    }

    public static List<Integer> printSpiral(int[][] matrix){
        List<Integer> ans = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        int noe = n*m;

        int minRow = 0;
        int minCol = 0;
        int maxRow = n-1;
        int maxCol = m-1;

        int count = 0;

        while(count<noe){
            for(int i=minRow,j=minCol;j<=maxCol && count<noe;j++){
                ans.add(matrix[i][j]);
                count++;
            }
            minRow++;

            for(int i=minRow,j=maxCol;i<=maxRow && count<noe;i++){
                ans.add(matrix[i][j]);
                count++;
            }
            maxCol--;

            for(int i=maxRow,j=maxCol;j>=minCol && count<noe;j--){
                ans.add(matrix[i][j]);
                count++;
            }
            maxRow--;

            for(int i=maxRow,j=minCol;i>=minRow && count<noe;i--){
                ans.add(matrix[i][j]);
                count++;
            }
            minCol++;
        }

        return ans;
    }
}
