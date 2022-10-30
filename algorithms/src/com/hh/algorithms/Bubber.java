package com.hh.algorithms;

import java.util.Arrays;
//冒泡排序
public class Bubber {
    public static void main(String[] args) {
        int[] arr = {5,15,21,3,12,1,24,16,7};

        System.out.println(Arrays.toString(arr));
        int temp = 0;//临时变量，用来存取中间值
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){//比较相邻元素，进行交换
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
