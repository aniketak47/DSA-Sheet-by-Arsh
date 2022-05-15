// https://leetcode.com/problems/minimum-moves-to-equal-array-elements/

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int ans = minMovesToEqual(arr);
        System.out.println("Minimum moves to equal array elements :"+ans);
    }

    public static int minMovesToEqual(int[] arr){
        if(arr.length==0) return 0;

        int ans = 0;

        int min = arr[0];

        for(int val:arr){
            if(val<min){
                min = val;
            }
        }

        for(int val:arr){
            ans+=val-min;
        }

        return ans;
    }
}
