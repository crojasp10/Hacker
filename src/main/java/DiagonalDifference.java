import java.util.List;

public class DiagonalDifference {


    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int leftDiagonal= 0;
        int rigthDiagonal = 0;
        int resultado = 0;
        for (int i = 0; i < arr.size(); i++) {
                int valor = arr.get(i).get(i);
                leftDiagonal = leftDiagonal + valor;

                int valor2 = arr.get(arr.size()-1-i).get(i);
                rigthDiagonal = rigthDiagonal + valor2;

                resultado= leftDiagonal-rigthDiagonal;
        }

        return Math.abs(resultado);
    }


}
