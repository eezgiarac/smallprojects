package Part3;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tam", "ate", "mat", "bat"};
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {
            char c1[] = str[i].toCharArray();
            Arrays.sort(c1);

            for (int j = 0; j < str.length; j++) {
                char c2[] = str[j].toCharArray();
                Arrays.sort(c2);

                if (Arrays.equals(c1,c2) && !list.contains(str[j]) ){
                    list.add(str[j]);
                }
            }
            String s ="";
            for (String each : list) {
                s += each +" ";
            }
            // System.out.println(s);
            if (!list2.contains(s)){
                list2.add(s);
            }
            list.clear();
        }

        ArrayList<ArrayList<String>> last = new ArrayList<>();

        for (int i = 0; i < list2.size(); i++) {

            String[] a = list2.get(i).split(" ");
            ArrayList<String> al = new ArrayList<>(Arrays.asList(a));
            last.add(al);

        }

        System.out.println(last);
    }
}
/*
input  str={"eat", "tea", "tam", "ate", "mat", "bat"}

output {{"bat"},{"mat","tam"},{"ate","eat","tea"}}

make programm that will organise anagrams into groups like "output" in console above.
 */

