public class NumberLineJumps {


    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        String decision = "";
        int salto1 = x1;
        int salto2 = x2;
        if(x1<0 || v1<1 || x2<0 || v2<1){
            decision = "Los valores deben ser mayores a cero";
        }
        else if(v2>v1&&x2>x1) {
            decision = "NO";
        }
        else if(v2<v1&&x2<x1) {
            decision =  "NO";
        }else {

            while (salto1 != salto2) {
                salto1 += v1;
                salto2 += v2;
            }
            decision = salto1==salto2? "YES":"NO";
        }

        return decision;
    }


}
