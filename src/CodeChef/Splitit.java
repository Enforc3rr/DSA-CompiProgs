package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Splitit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int test = Integer.parseInt(br.readLine());
        for (int i = 0; i < test; i++) {
            boolean check = false;
            int N = Integer.parseInt(br.readLine());
            String s = br.readLine();
            for(int j = 0 ; j < N-2 ; j++){
                for(int k = j+2 ; k < N ; k++){
                    StringBuilder stringBuilder = new StringBuilder(s);
                    String toAppend =  stringBuilder.substring(j,k);
                    stringBuilder.replace(N-toAppend.length() , N , toAppend);
                    if(stringBuilder.toString().equals(s)){
                        check = true;
                        break;
                  }
                }
                if(check){
                    break;
                }
            }

            if(check){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
