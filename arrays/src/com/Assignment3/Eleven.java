//11. [Count Items Matching a Rule](https://leetcode.com/problems/count-items-matching-a-rule/)
package com.Assignment3;

import java.util.ArrayList;

public class Eleven {
    public static void main(String[] args){
        ArrayList<ArrayList<String>> items = new ArrayList<>(5);
        ArrayList<String> item1 = new ArrayList<>(5);
        ArrayList<String> item2 = new ArrayList<>(5);
        ArrayList<String> item3 = new ArrayList<>(5);
        String ruleKey = "type";
        String ruleValue = "phone";
        item1.add("phone");
        item1.add("blue");
        item1.add("pixel");
        items.add(item1);
        item2.add("computer");
        item2.add("silver");
        item2.add("phone");
        items.add(item2);
        item3.add("phone");
        item3.add("gold");
        item3.add("iphone");
        items.add(item3);
        int count = 0;
        for(ArrayList<String> itemg : items){
            if(ruleKey.equals("type") && ruleValue.equals(itemg.get(0)) ||
                    ruleKey.equals("color") && ruleValue.equals(itemg.get(1)) ||
                    ruleKey.equals("name") && ruleValue.equals(itemg.get(2))){
                count++;
            }
        }
        System.out.println(count);

    }
}
