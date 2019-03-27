public class FindTopK {

    public int findK(int[] a, int k) {
        int l = 0, r = a.length - 1;
        if (k < l || k > r) return -1;
        while (true) {
            int i = l, j = r;
            int cmp = a[i];
            while (i < j) {
                while (i < j && a[j] >= cmp) j--;
                while (i < j && a[i] <= cmp) i++;
                if (i < j) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                } else {
                    int temp = a[l];
                    a[l] = a[i];
                    a[i] = temp;
                }
            }
            if (i == k)
                return a[i];
            else if (i > k)
                r = i - 1;
            else
                l = i + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(new FindTopK().findK(new int[]{4,7,6,3,5,2},3));
    }

}
