package com.teja;
import java.awt.*;
import java.util.Arrays;

public class SecondDay {
    static void main() {
        System.out.println(SecondDay.FirstNonRepeatingNumber(new int[]{1,2,2,3,1,5,8}));
        int[] s = SecondDay.MoveZeroToEnd(new int[]{0,1,0,3,8});
        System.out.println(Arrays.toString(s));
        System.out.println(SecondDay.IntegerSum(123));
    }

    public static int FirstNonRepeatingNumber(int[] nums)
    {
        for(int i=0; i<nums.length; i++)
        {
            int count=0;
            for(int j=0; j<nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                    count++;
                }
            }
            if(count == 1)
            {
                return nums[i];
            }
        }
        return -1;
    }

    public static int[] MoveZeroToEnd(int[] nums)
    {
        int var = 0;
        for(int i=0; i<nums.length-1; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i] == 0)
                {
                    var = nums[i];
                    nums[i] = nums[j];
                    nums[j] = var;
                }
            }
        }
        return nums;
    }

    public int[] TwoSum(int[] nums, int target)
    {
        int[] result = new int[]{};
        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    
                }
            }
        }
        return result;
    }

    public static int IntegerSum(int nums)
    {
        int result = 0;
        while(nums > 0)
        {
            result += nums%10;
            nums = nums/10;
        }
        return result;
    }
}