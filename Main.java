import java.io.*;
import java.util.*;

    public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][]arr = new int[n][m];
        int[][]arr1 = new int[n][m];
        int[][]arr2 = new int[n][m];

        for(int i = 0;i<n;i++) {
            for(int j = 0;j<m;j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        for(int i = 0;i<n;i++) {
            for(int j = 0;j<m;j++) {
                arr1[i][j] = scn.nextInt();
            }
        }
        for(int i = 0;i<n;i++) {
            for(int j = 0;j<m;j++) {
                arr2[i][j] = 0;
                for(int k = 0;k<n;a++){
                    arr2[i][j]+=arr[i][k]*arr1[k][j];
                }
                System.out.println(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
    }