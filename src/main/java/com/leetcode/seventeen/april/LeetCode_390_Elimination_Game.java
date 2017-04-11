package com.leetcode.seventeen.april;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Fisher on 4/8/2017.
 */
public class LeetCode_390_Elimination_Game {

    public static void main(String[] args) {
        System.out.println(lastRemaining(10000000));
    }

    public static int lastRemaining(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        List<Integer> list = new LinkedList<>();
        for(int i=2;i<=n;i=i+2){
            list.add(i);
        }
        // if true flag that from 0 to n
        // otherwise, means from n to 0
        boolean ascending = false;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while(list.size()!=1){
            if(ascending){
                while(iterator.hasNext()){
                    int i = iterator.next();
                    System.out.println("next is "+ i);
                    iterator.remove();
                    if(iterator.hasNext()) {
                        iterator.next();
                    }
                }
                ascending = false;
            } else {
                while(iterator.hasPrevious()){
                    int i = iterator.previous();
                    System.out.println("prev is "+ i);
                    iterator.remove();
                    if(iterator.hasPrevious()) {
                        iterator.previous();
                    }
                }
                ascending = true;
            }
        }
        return list.get(0);
    }

}
