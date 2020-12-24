public class Test {
    public static int[] windowPosSum(int[] a, int n) {
        int[] b = a.clone();

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                for (int j = i + 1; j < i + n; j++) {
                    if (j <= a.length - 1) {
                        b[i] += a[j];
                    } else{
                        break;
                    }
                }
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int[] a = {-1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);
        System.out.println(java.util.Arrays.toString(a));
    }
}
        //Use two for loops.
        //Use continue to skip negative values.
        //Use break to avoid going over the end of the array.
//    public static void main(String[] args) {
//        int[] a ={1, 2, -3, 4, 5, 4};
//        int n = 3;
//        windowPosSum(a, n);
//        Should print 4, 8, -3, 13, 9, 4
//        System.out.println(java.util.Arrays.toString(a));
//    }
//}