import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArray {
    private int[] num;
    public void merge(int[] nums1, int m, int[] nums2, int n) { // m과 n은 각각 nums1과 nums2에 들어있는 숫자를 의미한다
        num = new int[m + n];
        int k = 0;

        for(int i = 0; i < m; i++) {
            num[k] = nums1[i];
            k++;
        }

        for(int i = 0; i < n; i++) {
            num[k] = nums2[i];
            k++;
        }
        Arrays.sort(num);
        for(int i : num) {
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        MergeSortedArray array = new MergeSortedArray();
        array.run(args);


    }

    public void run(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        merge(nums1, 3, nums2, 3);
    }
}
