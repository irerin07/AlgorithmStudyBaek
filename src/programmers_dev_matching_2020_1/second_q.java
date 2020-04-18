package programmers_dev_matching_2020_1;

public class second_q {
    public static void main(String[] args) {
        int[][] office = {{5,-1,4}, {6,3,-1},{2, -1,1}};
        int r = 1;
        int c = 0;
        String[] move = {"go", "go", "right", "go", "right", "go", "left", "go"};
        System.out.println(solution(office, r, c, move));
    }

    private static int solution(int[][] office, int r, int c, String[] move) {
        int answer = 0;
        String facing = "N";
        answer += office[r][c];
        office[r][c] = 0;
        for(int i = 0; i < move.length; i++){
            if(move[i].equals("go")){
                if(facing.equals("N")){
                    if((r-1 >= 0 && r-1 < office.length) && office[r-1][c] != -1) {
                        r = r-1;
                        answer += office[r][c];
                        office[r][c] = 0;
                    }
                }else if(facing.equals("S")){
                    if((r+1 >= 0 && r+1 < office.length) && office[r+1][c] != -1) {
                        r = r+1;
                        answer += office[r][c];
                        office[r][c] = 0;
                    }
                }else if(facing.equals("E")){
                    if((c+1 >= 0 && c+1 < office.length) && office[r][c+1] != -1) {
                        c = c+1;
                        answer += office[r][c];
                        office[r][c] = 0;
                    }
                }else{
                    if((c-1 >= 0 && c-1 < office.length) && office[r][c-1] != -1) {
                        c = c-1;
                        answer += office[r][c];
                        office[r][c] = 0;
                    }
                }
            }else if(move[i].equals("right")){
                if(facing.equals("N")){
                    facing = "E";
                }else if(facing.equals("S")){
                    facing = "W";
                }else if(facing.equals("E")){
                    facing = "S";
                }else{
                    facing = "N";
                }
            }else{
                if(facing.equals("N")){
                    facing = "W";
                }else if(facing.equals("S")){
                    facing = "E";
                }else if(facing.equals("E")){
                    facing = "N";
                }else{
                    facing = "S";
                }

            }
        }

        return answer;
    }
}
