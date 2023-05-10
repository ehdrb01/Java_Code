import java.util.Scanner;

public class GuessNumber {

    public int guess(int num) {
        return num;
    }
    /**
     * Forward declaration of guess API.
     * @param  num   your guess
     * @return          -1 if num is higher than the picked number
     *			      1 if num is lower than the picked number
     *               otherwise return 0
     * int guess(int num);
     */
    /**
     * Forward declaration of guess API.
     * @param  num   your guess
     * @return 	     -1 if num is higher than the picked number
     *			      1 if num is lower than the picked number
     *               otherwise return 0
     * int guess(int num);
     */
        public int guessNumber(int n) {
            long s = 0;
            long e = n;
            long mid=(s+e)/2;
            while(s<=e){
                mid=(s+e)/2;
                int temp=guess((int)mid);
                if(temp==0)
                    return (int)mid;
                else if(temp==1)
                    s=mid+1;
                else
                    e =mid-1;
            }
            return (int)mid;
        }
    }

}
