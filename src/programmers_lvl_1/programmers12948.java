package programmers_lvl_1;

public class programmers12948 {
    public static void main(String[] args) {
        String phone_number = "01033334444";
        System.out.println(solution(phone_number));
    }

    private static String solution(String phone_number) {
//        char[] ch = phone_number.toCharArray();
//        for(int i = 0; i < ch.length - 4; i ++){
//            ch[i] = '*';
//        }
//        return String.valueOf(ch);
        String answer = "";
        StringBuffer sb = new StringBuffer();

        if(phone_number.length() == 4){
            return phone_number;
        }
        for(int i = 0; i < phone_number.length(); i++){
            if(i < phone_number.length() - 4) {
                sb.append("*");
            }else{
                sb.append(phone_number.charAt(i));
            }
        }
        System.out.println(sb);


        return sb.toString();
    }
}
