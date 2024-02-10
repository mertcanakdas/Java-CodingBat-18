
package codingbat_18;

import java.util.Arrays;
import java.util.Random;


public class CodingBat_18 {
    
public static int[] nums() {
        Random rn = new Random();
        int[] nums = new int[rn.nextInt(20) + 1];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rn.nextInt(10) + 1;

        }
        System.out.println(Arrays.toString(nums));
        return nums;
    } 

public static int []fix34(int []nums){
    int []fix34 = new int[nums.length];
   
    for(int i=0;i<nums.length;i++){
        fix34[i] = nums[i];
    }
    
    for(int i=0;i<nums.length;i++){
        if(fix34[i]==3){
        for(int j=0;j<nums.length;j++){
            if(fix34[j]==4 && fix34[j-1]!=3){
                fix34[j] = fix34[i+1];
                fix34[i+1] = 4;
            }
        }
    
      }
    }
    System.out.println(Arrays.toString(fix34));
    
    return fix34;
}

    
    public static void main(String[] args) {
        fix34(nums());
    }
    
}
