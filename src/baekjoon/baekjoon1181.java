package baekjoon;

import java.io.*;
import java.util.*;

public class baekjoon1181 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<String> set = new HashSet<>();
        int num = Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            set.add(br.readLine());
        }

        ArrayList<String> list = new ArrayList<>(set);

        Collections.sort(list,new Comparator<String>() {
            @Override
            public int compare(String o1,String o2){
                if(o1.length() > o2.length()) return 1;
                else if(o1.length() < o2.length()) return -1;
                return o1.compareTo(o2);
            }
        });

        for(String tmp:list){
            bw.write(tmp);
            bw.newLine();
        }
        bw.flush();
    }
}
