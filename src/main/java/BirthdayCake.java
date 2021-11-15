import java.util.Collections;
import java.util.List;

public class BirthdayCake {

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int maximun = 0;
        int variableMayor = Collections.max(candles,null);//Método para hallar el valor máximo de un array

        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i)==variableMayor){
                maximun++;
            }
        }
        return maximun;
    }


}
