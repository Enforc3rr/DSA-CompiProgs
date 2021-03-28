package CodeForces;

import java.util.Scanner;

public class A282 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for(int i = 0 ; i < N ; i++){
            String s = sc.next();
            if(s.equals("++X")||s.equals("X++")){
                sum++;
            }else {
                sum--;
            }
        }
        System.out.println(sum);
    }
}
