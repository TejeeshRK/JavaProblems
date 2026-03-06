package com.teja;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ThirdDay {
    static void main() {
        ThirdDay.DuplicateArrayElement(new int[]{4,2,3,5,1,2,3,4});
        ThirdDay.NumbersSwap(10,20);
        System.out.println(ThirdDay.SecondlargestNumber(new int[] {5,3,2,7,9,45,99}));
        ThirdDay.Missingelement(new int[] {1,2,3,5});
        System.out.println(ThirdDay.RemoveDuplicates("programming"));

    }

    //Sunil Interview Programs
    public static void DuplicateArrayElement(int[] nums)
    {

        for(int i=0; i<nums.length; i++)
        {
            int count = 0;
            for(int j=i; j<nums.length; j++)
            {
                if(nums[i]==nums[j])
                {
                    count ++;
                }
            }
            if(count == 2)
            {
                System.out.println(nums[i]);
            }
        }
//        for(int i=0; i<nums.length; i++)
//        {
//            for(int j=i+1; j<=nums.length-1; j++)
//            {
//                if(nums[i] == nums[j])
//                {
//                    System.out.println(nums[i]);
//                }
//            }
//        }
    }

    public static void NumbersSwap(int a, int b)
    {
        /*
        * Approach using third variable
        System.out.println("Before Swapping a = : " + a);
        System.out.println("Before Swapping b = : " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("After Swapping a = : " + a);
        System.out.println("After Swapping b = : " + b);
         */
        System.out.println("Before Swapping a = : " + a);
        System.out.println("Before Swapping b = : " + b);
        a = a+b;
        b= a-b;
        a= a-b;
        System.out.println("After Swapping a = : " + a);
        System.out.println("After Swapping b = : " + b);
    }

    public static int SecondlargestNumber(int[] nums)
    {
        int largest = nums[0];
        int secondlargest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] > largest)
            {
                secondlargest = largest;
                largest = nums[i];
            }
            if(nums[i]!= largest && nums[i] > secondlargest)
            {
                secondlargest = nums[i];
            }
        }
        return secondlargest;
    }

    public static void Missingelement(int[] nums)
    {
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i]+1 != nums[i+1]) {
                System.out.println(nums[i] + 1);
            }
        }
    }

    public static String RemoveDuplicates(String name)
    {
        String result = "";
        for(int i = 0; i<name.length(); i++)
        {
           char ch = name.charAt(i);
           if(result.indexOf(ch) == -1 )
           {
               result +=ch;
           }
        }
        return result;
    }
}