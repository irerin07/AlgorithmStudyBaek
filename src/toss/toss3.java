//import java.io.*;
//import java.util.stream.Stream;
//class Main {
//    public static void main(String[] args) throws Exception {
//        // [!!주의!!] Function.compute 함수는 이미 구현되어있지만, 숨김처리되어 있습니다. 호출해서 테스트 해주세요.
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        StringBuffer sb = new StringBuffer();
//
//
//        String [] stringTokens = input.split(" ");
//        int [] intArr = Stream.of(stringTokens).mapToInt(strToken -> Integer.parseInt(strToken)).toArray();
//        int[] check = new int[intArr.length];
//
//
//        for(int i = 0; i < intArr.length; i++){
//            int temp = intArr[i];
//            if(check[temp] == 0){
//                check[temp] = Function.compute(temp);
//                sb.append(check[temp] + " ");
//            }else{
//                sb.append(check[temp] + " ");
//            }
//        }
//        System.out.println(sb);
//    }
//}