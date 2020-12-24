public class Demo {
    public static int[] windowPosSum(int[] a, int n) {
        int[] b = new int[a.length];
        for (int i = 0; i <= a.length - 1; i++) {
            b[i] = a[i];
        }

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > 0) {
                for (int j = i + 1; j <= i + n; j++) {//i 和 j是独立的两个参数
                    if (j <= a.length - 1) {
                        b[i] += a[j];
                    } else {
                        break;//条件是j > a.length - 1
                    }
                }
            }
        }
        return b;
    }
    public static void main(String[] args){
        int a[] = new int[]{1, 2, -3, 4, 5, 4};
        a = windowPosSum(a,3);
        for(int i = 0; i <= a.length-1; i++) {
            System.out.println(a[i]);
        }
    }
}