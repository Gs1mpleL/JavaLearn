package com.wanfeng.javalearn.other;

import java.util.Arrays;
import java.util.LinkedList;

public class KFC {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(finalPrices(new int[]{8, 4, 6, 2, 3})));

    }

    public static int[] finalPrices(int[] prices) {
        LinkedList<Integer> stack = new LinkedList<>();
        int len = prices.length;
        int[] ans = Arrays.copyOf(prices,len);
        for(int i = 0;i<len;i++){
            if(stack.isEmpty()){
                stack.push(i);
                continue;
            }
            if(stack.peek() < prices[i]){
                stack.push(i);
            }else{
                while(!stack.isEmpty() && stack.peek() >= prices[i]){
                    int pop = stack.pop();
                    ans[pop] = prices[pop] - prices[i];
                }
                stack.push(i);
            }
        }
        return ans;
    }
}
