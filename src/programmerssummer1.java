public class programmerssummer1 {
    public static void main(String[] args) {
        int p = 2000;
        System.out.println(solution(p));
    }

    private static int solution(int p) {
        int answer = 0;
        int year = p+1;
        int[] check = new int[10];
        int count = 0;
        while(answer == 0){
            int[]digits = Integer.toString(year).chars().map(c -> c-'0').toArray();
            for(int i: digits){
                System.out.println("i: " + i);
                if(check[i] == 0){
                    check[i] = 1;
                }else if(check[i] != 0){
                    for(int j = 0; j < check.length; j++){
                        check[j] =0;
                    }
                    year++;
                    break;
                }
            }
            for(int i = 0; i < check.length; i++){
                if(check[i] == 1){
                    count = count + 1;
                }
            }
            if(count == 4){
                answer = year;
            }

        }
        return answer;
    }
}

