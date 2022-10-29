public class Main {
    public static void main(String[] args) {
        double[] num = {0.1, -0.1, 1.2, 3.2, 0.3, -2.2, 0.4, -1.2, 0.5, 2.3, 0.6, -2.1, 0.7, -1.9, 1.6, -0.5};
        int count = 0;
        double i = 0.0;
        boolean b = false;
        for (double v : num) {
            if (v < 0) {
                b = true;
            }else if (b) {
                if (v>0){
                    i++;
                    count +=v;

            }
        }
        }
        System.out.println(count/i);
    }
}
