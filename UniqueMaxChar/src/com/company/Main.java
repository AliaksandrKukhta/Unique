package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        getMaxCharValue("assssssaaaaaaaabv");
    }

    public static char getMaxCharValue(String input){
        String uniquieInput = input;
        ArrayList<Character> unique = new ArrayList<Character>();
        char[] array = uniquieInput.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (unique.contains(array[i])){
                continue;
            }
            else {
                unique.add(array[i]);
            }
        }

        int [] repeat = new int[unique.size()];

        for (int i=0; i<unique.size(); i++){
            for (int j = 0; j<array.length; j++){
                if (unique.get(i)==array[j]){
                    repeat[i]+=1;
                }
            }
        }
        for (int i=0; i<repeat.length; i++){
            System.out.println(repeat[i]);
        }
        int max=repeat[0];
        int position=0;
        for(int i = 0; i<repeat.length; i++){
            if(repeat[i]> max){
                max = repeat[i];
                position=i;
            }
        }
        System.out.println(max);
        System.out.println(unique.get(position));
        return unique.get(position);
    }
}
