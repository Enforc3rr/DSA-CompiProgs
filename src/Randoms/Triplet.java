package Randoms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Triplet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int [] array  = new int[T];
        for (int i = 0; i < T; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        int sum = Integer.parseInt(br.readLine());
        Arrays.sort(array);
        for(int i = 0 ; i < array.length-2 ; i++){
            int left = i + 1 ;
            int right = array.length-1;
           while (left<right){
               if(array[i]+array[left]+array[right]==sum){
                   System.out.printf("%d %d %d",array[i],array[left],array[right]);
                   return;
               }else if(array[i]+array[left]+array[right]<sum){
                   left++;
               }else{
                   right--;
               }
           }
        }

    }
}
