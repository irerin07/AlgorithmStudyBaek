package programmers_lvl_1;

public class programmers17681 {
    public static void main(String[] args) {
        int n = 6;
        int[] arr1 = {46, 33, 33, 22, 31, 50};
        int[] arr2 = {27, 56, 19, 14, 14, 10};
        String[] answer = solution(n, arr1, arr2);
        for(String s: answer){
            System.out.print(s);
        }
    }

    private static String[] solution(int n, int[] arr1, int[] arr2) {
//        String[] result = new String[n];
//        for (int i = 0; i < n; i++) {
//            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
//        }
//
//        for (int i = 0; i < n; i++) {
//            result[i] = String.format("%" + n + "s", result[i]);
//            result[i] = result[i].replaceAll("1", "#");
//            result[i] = result[i].replaceAll("0", " ");
//        }
//
//        return result;
        String[] answer = new String[arr1.length];
        int[] answerInt = new int[arr1.length];
        String[] newArr1 = new String[arr1.length];
        String[] newArr2 = new String[arr2.length];
        String length = "%"+n+"s";

        for(int i = 0; i < arr1.length; i++){
            String a = (String.format(length, Integer.toBinaryString(arr1[i])));
            String b = (String.format(length, Integer.toBinaryString(arr2[i])));
            a = a.replace(' ', '0');
            b = b.replace(' ', '0');
            newArr1[i] = (a);
            newArr2[i] = (b);

        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < n; j++){

                if(newArr1[i].charAt(j) != newArr2[i].charAt(j)){
                    sb.append("#");
                }else{
                    if(newArr1[i].charAt(j)=='1'){
                        sb.append("#");
                    }else{
                        sb.append(" ");
                    }
                }
            }
            answer[i] = sb.toString();
            sb.delete(0, sb.length());

        }

        return answer;
    }
}
