package toss;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

/*
로또 번호는 중복되지 않는 숫자 6개로 구성된다.

각 번호는 1 부터 45 까지의 숫자로 구성된다.

로또 번호는 오름차순으로 정렬되어야 한다.
 */
public class toss2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        boolean result = true;


        String [] stringTokens = input.split(" ");
        int [] intArr = Stream.of(stringTokens)
                .mapToInt(strToken -> Integer.parseInt(strToken))
                .toArray();

        if(intArr.length != 6){
            result = false;
        }

        StringBuffer sb = new StringBuffer();
        sb.append(23343);
        System.out.println("Sb: " + sb);

        int[] check = new int[46];
        if (result) {
            for(int i = 0; i < intArr.length-1; i++){
                if(intArr[i] > 45){
                    System.out.println(">45");
                    result = false;
                    break;
                }
                if(check[intArr[i]] == 1){
                    System.out.println("==1");
                    result = false;
                    break;
                }
                check[intArr[i]] = 1;
                if(intArr[i] > intArr[i+1]){
                    System.out.println(">");
                    result = false;
                    break;
                }
            }

        }
        System.out.println(result);

    }
}
