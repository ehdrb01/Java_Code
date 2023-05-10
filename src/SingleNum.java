public class SingleNum {
    public int singleNumber(int[] nums) {

        int check = 0;
        int returnValue = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    nums[j] = 0;
                    check = 1;
                }
            }
            if(check == 1) {
                nums[i] = 0;
            }

            check = 0;
        }

        for(int i : nums) {
            if (i != 0) {
                returnValue = i;
                break;
            }
        }

        return returnValue;
    }

    public static void main(String[] args) {
        SingleNum test = new SingleNum();
        test.run(args);
    }

    public void run(String[] args) {
        int num;
        int[] nums = {4,1,2,1,2};

        num = singleNumber(nums);
        System.out.println(num);
    }
}
