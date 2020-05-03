package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class baekjoon1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        List list = new ArrayList();

        for(int i = 0; i < s.length(); i++){
            list.add(Character.getNumericValue(s.charAt(i)));
        }

        Collections.sort(list);
        Collections.reverse(list);

        for(int i =0; i < list.size(); i++){
            System.out.print(list.get(i));
        }
        br.close();



    }
}
