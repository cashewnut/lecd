public class FindMid {

    public double findMid(int[] arr) {
        int l = 0, r = arr.length - 1;
        int i = l, j = r;
        int midIndex = (arr.length - 1) >> 1;
        while (i != midIndex) {
            int cmp = arr[i];
            while (i < j) {
                while (i < j && cmp <= arr[j])
                    j--;
                while (i < j && cmp >= arr[i])
                    i++;
                if (i < j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } else {
                    int temp = arr[i];
                    arr[i] = cmp;
                    arr[l] = temp;
                }
            }
            if (i == midIndex)
                break;
            else if (i > midIndex) {
                j = j - 1;
                i = l;
                r = j;
            } else {
                i = i + 1;
                j = r;
                l = i;
            }
        }
        if ((arr.length & 1) == 1) {
            return arr[i];
        } else {
            return (arr[i] * 1.0 + arr[i + 1] * 1.0) / 2;
        }
    }

    public static void main(String[] args) {
        FindMid f = new FindMid();
        System.out.println(f.findMid(new int[]{3, 1, 2, 5, 4, 6}));
    }

}
