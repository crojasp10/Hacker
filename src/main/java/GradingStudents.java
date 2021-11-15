import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List <Integer> miLista = new ArrayList<>();
        List <Integer> multiplos = new ArrayList<>();


        for (int i = 1; i <= 100; i++) {
            if (i%5==0){
                multiplos.add(i);
            }
        }

        for (int i : grades) {
            if(i>40){
                for (int j = 0; j < multiplos.size(); j++) {
                    if (i==multiplos.get(j)||i+1==multiplos.get(j)||i+2==multiplos.get(j)){
                        System.out.println("Se agrega valor a la lista");
                        miLista.add(multiplos.get(j));
                    }else if(i==multiplos.get(j)-4||i==multiplos.get(j)-3) {
                        System.out.println("Se agregassss valor a la lista");
                        miLista.add(i);
                    }
                }
            }
            else if(i==39||i==38){
                miLista.add(40);
            }
            else{
                miLista.add(i);
            }
        }
      return miLista;
    }







}
