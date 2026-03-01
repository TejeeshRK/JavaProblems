package com.teja;

public class FirstDay {
    static void main()
    {
        System.out.println(FirstDay.SecondLargest(new int[]{10,8,11,11,9}));
        System.out.println(FirstDay.EvenCount(new int[]{20,10,23,40,55}));
    }

    public static int SecondLargest(int[] nums)
    {
        int largest = 0;
        int secondlargest = 0;
        for(int i=0; i<=nums.length-1; i++)
        {
            if(largest < nums[i])
            {
                secondlargest = largest;
                largest = nums[i];
            }
        }
        return secondlargest;
    }

    public static int EvenCount(int[] nums)
    {
        int count = 0;
        for(int i=0; i<=nums.length-1; i++)
        {
            if(nums[i]%2==0)
            {
                count++;
            }
        }
        return count;
    }
}
