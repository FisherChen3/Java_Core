package com.leetcode.seventeen.march;

import java.util.*;

/**
 * Created by Fisher on 3/15/2017.
 */
public class LeetCode_381_Insert_Delete_GetRandom_Duplicates_allowed {

    public static void main(String[] args) {

    }

    private class RandomizedCollection {

        Map<Integer,Set<Integer>> map;
        List<Integer> list;
        Random rand;

        /** Initialize your data structure here. */
        public RandomizedCollection() {
            map = new HashMap<>();
            list = new ArrayList<>();
            rand = new Random();
        }

        /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
        public boolean insert(int val) {
            if(map.containsKey(val)){
                Set<Integer> set = map.get(val);
                set.add(list.size());  // list.size() is the loc of val in list
                list.add(val);
                return false;
            } else {
                Set<Integer> set = new HashSet<>();
                set.add(list.size());
                list.add(val);
                map.put(val,set);
                return true;
            }
        }

        /** Removes a value from the collection. Returns true if the collection contained the specified element. */
        public boolean remove(int val) {
            if(map.containsKey(val)){
                // get loc info from map
                Set<Integer> set = map.get(val);
                Iterator<Integer> iterator = set.iterator();
                int loc = iterator.next();
                // value of the last element in list
                int lastVal = list.get(list.size()-1);
                // remove element from the last position of list
                list.set(loc,lastVal); // switch the last elment to val loc
                list.remove(list.size()-1);
                // update map for val
                iterator.remove();
                if(set.size()==0){
                    map.remove(val);
                }
                // update map for lastVal
                Set<Integer> lastSet = map.get(lastVal);
                // when last val is equal to val and val.set.size() ==0, lastSet will be null here
                if(lastSet==null){
                    return true;
                }
                lastSet.remove(list.size());
                lastSet.add(loc);

                return true;

            } else {
                return false;
            }
        }

        /** Get a random element from the collection. */
        public int getRandom() {
            if(list.size()==0){
                return -1;
            } else {
                int loc = rand.nextInt(list.size());
                return list.get(loc);
            }
        }
    }

}
