package kakaoblind;

public class kakao3 {
    public static void main(String[] args) {

        String[] info = {
                "java backend junior pizza 150",
                "python frontend senior chicken 210",
                "python frontend senior chicken 150",
                "cpp backend senior pizza 260",
                "java backend junior chicken 80",
                "python backend senior chicken 50"
        };

        String[] query = {
                "java and backend and junior and pizza 100",
                "python and frontend and senior and chicken 200",
                "cpp and - and senior and pizza 250",
                "- and backend and senior and - 150",
                "- and - and - and chicken 100",
                "- and - and - and - 150"
        };
        int[] answer = Solution(info, query);
        for (int i : answer) {
            System.out.println("i = " + i);
        }
    }
    private static int[] Solution (String[] info, String[] query) {
        int[] answer = new int[info.length];
        String qlang;
        String lang;
        String qjob;
        String job;
        String qgrade;
        String grade;
        String qfood;
        String food;
        int qpoint;
        int point;

        for (int i = 0; i <  query.length; i++) {
            String s = query[i];
            s = s.replace(" and ", " ");
            String[] words = s.split(" ");
            for (int j = 0; j <  info.length; j++) {
                qlang = words[0];
                qjob = words[1];
                qgrade = words[2];
                qfood = words[3];
                qpoint = Integer.parseInt(words[4]);
                String s1 = info[j];
                String[] words1 = s1.split(" ");
                lang = words1[0];
                if(qlang.equals("-")){
                    qlang = lang;
                }
                job = words1[1];
                if(qjob.equals("-")){
                    qjob = job;
                }
                grade = words1[2];
                if(qgrade.equals("-")){
                    qgrade = grade;
                }
                food = words1[3];
                if(qfood.equals("-")){
                    qfood = food;
                }
                point = Integer.parseInt(words1[4]);
                if(qlang.equals(lang) && qjob.equals(job) && qgrade.equals(grade) && qfood.equals(food) && point >= (qpoint)){
                    answer[i] = answer[i] + 1;
                }
            }
        }
        return answer;
    }
}
