package com.teja;

public class FirstDay {
    static void main()
    {
        //System.out.println(FirstDay.SecondLargest(new int[]{}));
        //System.out.println(FirstDay.EvenCount(new int[]{20,10,23,40,55}));
        //System.out.println(FirstDay.SmallestNumber(new int[]{1,2,3,4,5}));
        System.out.println(FirstDay.FirstNonRepeatingNumber(new int[]{1,2,1,2,5,3,3,8,9,9}));
    }

    public static int SecondLargest(int[] nums)
    {
        int largest = nums[0];
        int secondlargest = Integer.MIN_VALUE;
        for(int i=0; i<=nums.length-1; i++)
        {
            if(largest < nums[i])
            {
                secondlargest = largest;
                largest = nums[i];
            }
            if(nums[i] > secondlargest && nums[i] != largest)
            {
                secondlargest = nums[i];
            }
        }
        return secondlargest;
    }

    public static int EvenCount(int[] nums)
    {
        int count = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]%2==0)
            {
                count++;
            }
        }
        return count;
    }

    public static int SmallestNumber(int[] nums)
    {
        int smallest = nums[0];
        for(int i=0; i<nums.length; i++)
        {
            if(smallest > nums[i])
            {
                smallest = nums[i];
            }
        }
        return smallest;
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
}
