package kakaoblind;

public class kakao1 {
    public static void main(String[] args) {
        String s = "-_.............-_.";
        int size = s.length();
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9\\-\\_\\.]", "");
        s = s.replaceAll("\\.{2,}", ".");
        s=s.replaceAll("^\\.*", "");
        s = s.replaceAll("[\\.]*$","");
        if(s.length() == 0){
                s = s + "a";
        }
        if(s.length() >= 16){
            s = s.substring(0,15);
            s = s.replaceAll("[\\.]*$","");
        }
        while(s.length() < 3){
            s = s + s.charAt(s.length()-1);
        }
        System.out.println(s);
    }
}
