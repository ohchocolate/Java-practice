public class Practice {
    public static int[] windowPosSum(int[] a, int n) {
        for(int i = 0; i < a.length; i++) {
            //Replace the a[i] iff a[i] is positive
            if(a[i] > 0) {
                if(i + n < a.length) {
                    for (int j = i + 1; j <= i + n; j++) {
                        a[i] += a[j];
                    }
                } else {
                    //i + n >= a.length 避免超出数组范围的情况
                    for (int j = i + 1; j < a.length; j++){
                        a[i] += a[j];
                    }
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a ={1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

    System.out.println(java.util.Arrays.toString(a));
    }
}
