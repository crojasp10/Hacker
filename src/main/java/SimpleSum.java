import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SimpleSum {

        /*
         * Complete the 'simpleArraySum' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER_ARRAY ar as parameter.
         */
        List <Integer> ar = new ArrayList<Integer>();

        public static int simpleArraySum(List<Integer> ar) {
            // Write your code here
            int resultado = 0;
            for (int i = 0; i < ar.size(); i++) {
                int valor = ar.get(i);
                resultado = resultado + valor;
            }

            return Math.abs(resultado);

        }

    }



