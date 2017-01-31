package com.winterbe;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Fisher on 1/18/2017.
 */
public class MapTest {

    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        int val = 1;
        for(int i=0;i<10;i++){
            map.putIfAbsent(i,i+val);
        }
        map.forEach((a,b)->System.out.println(b));
    }

}
