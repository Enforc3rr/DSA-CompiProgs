package CodeForces;

import java.util.Scanner;

public class A71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0 ; i < N ; i++){
            String s = sc.next();
            if(s.length()>10){
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(s.charAt(0));
                stringBuilder.append(s.length()-2);
                stringBuilder.append(s.charAt(s.length()-1));
                System.out.println(stringBuilder.toString());
            }else{
                System.out.println(s);
            }
        }
    }
}
