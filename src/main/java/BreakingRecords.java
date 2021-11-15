import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BreakingRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        List<Integer> minimum = new ArrayList<>();
        List<Integer> maximum = new ArrayList<>();

        minimum.add(scores.get(0));
        maximum.add(scores.get(0));
        int max = 0;
        int min = 0;
        for (int i = 0; i < scores.size(); i++) {

            if(scores.get(i)> Collections.max(maximum)){
                maximum.add(scores.get(i));
                max +=1;
            }
            if(scores.get(i) < Collections.min(minimum)){
                minimum.add(scores.get(i));
                min +=1;
            }
        }

        list.add(max);
        list.add(min);

       return list;
    }



}
