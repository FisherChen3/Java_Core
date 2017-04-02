package com.leetcode.seventeen.march;

import java.util.*;

/**
 * Created by Fisher on 3/14/2017.
 */
public class LeetCode_380_Insert_Delete_GetRandom {

    private class RandomizedSet {

        // <key: value, val: loc in list>
        Map<Integer,Integer> map;
        List<Integer> list;
        Random rand;

        /** Initialize your data structure here. */
        public RandomizedSet() {
            map = new HashMap<>();
            list = new ArrayList<>();
            rand = new Random();
        }

        /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
        public boolean insert(int val) {
            if(map.containsKey(val)){
                return false;
            } else {
                int loc = list.size();
                list.add(val);
                map.put(val,loc);
                return true;
            }
        }

        /** Removes a value from the set. Returns true if the set contained the specified element. */
        public boolean remove(int val) {
            if(map.containsKey(val)){
                int loc = map.get(val);
                // swap this value with the last value in the list
                int last = list.get(list.size()-1);
                list.set(loc,last);
                list.remove(list.size()-1);
                // update map entry
                map.put(last,loc);  // update the last value a new loc index
                map.remove(val);   // this needs to be executed latter than map.put, in case, val is the last element in list
                return true;
            }
            return false;
        }

        /** Get a random element from the set. */
        public int getRandom() {
            if(list.size()==0){
                return -1;   // just a random number, in case size is 0
            }
            int loc = rand.nextInt(list.size());
            return list.get(loc);
        }
    }

}
