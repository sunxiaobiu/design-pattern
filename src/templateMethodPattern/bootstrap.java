package templateMethodPattern;

/**
 * Created by sun on 16/2/21.
 */
public class bootstrap {
    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
//    private static int max = 1000000000;
//
//public static void main(String[] args) {
//    double num = 0.0;
//    for(int i=0; i<=max; i++){
//        num += calculate();
//    }
//    System.out.println(num/max);
//}
//
//    private static int calculate(){
//        double result = 0;
//        int num = 0;
//        while(result <= 1.0){
//            double random = Math.random();
//            while(random == 0.0){
//                random = Math.random();
//            }
//            result += random;
//            num ++;
//        }
//        return num;
//    }
}
