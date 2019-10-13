package Java.programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class duplicateCharInString {

    public static void main(String[] args) {

        String x="Ashutosh";
        duplicateChar(x);

    }

    private static void duplicateChar(String x){

        HashMap<Character,Integer> str=new HashMap();
        for(char c: x.toCharArray()){

            if(str.containsKey(c)){
                int val=(Integer) str.get(c);
                str.put(c,val+1);
            } else{

                str.put(c,0);
            }
        }

        System.out.println(str);
        Set<Character> y=str.keySet();
        for(Character c: y ){

            if(str.get(c)>=1) {
                System.out.println("Key: "+c+" Values: "+str.get(c));
            }
        }


    }
}
