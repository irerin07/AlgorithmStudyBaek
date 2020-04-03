import java.util.Iterator;
import java.util.Stack;

public class programmers64061 {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}};
        int[] moves = new int[]{1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(solution(board, moves));

    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    //해당 위치에 인형이 있는 경우
                    if (st.empty()) {
                        //인형을 담을 스택이 비어있는 경우
                        st.push(board[j][moves[i] - 1]);
                    } else {
                        //스택이 비어있지 않는 경우
                        if (st.peek() == board[j][moves[i] - 1]) {
                            //st.peek()을 사용하여 집어올린 인형과 값을 비교해 두 값이 같은 경우에는
                            st.pop();
                            //스택에서 인형을 제거한 뒤
                            answer += 2;
                            // answer를 2 증가시켜준다. (인형 2개가 사라지기 때문)
                        } else {
                            //st.peek()을 사용하여 집어올린 인형과 값을 비교해 두 값이 다른 경우에는
                            st.push(board[j][moves[i] - 1]);
                            //스택에 인형을 넣어준다.
                        }
                    }
                    //일련의 작업이 끝난 뒤 인형을 집어올린 좌표에는 더 이상 인형이 없으므로 0을 저장한다.
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}

