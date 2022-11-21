package org.niit;

import java.util.ArrayList;
import java.util.List;

public class Fibinaco {
    List<Integer> fibinacci(int sum){
        int x = 0;
        int y = 1,finico;

        List<Integer> list= new ArrayList<Integer>();
        list.add(x);
        list.add(y);
        for(int i = 2;i<sum;i++){
            finico=x+y;
            x=y;
            y=finico;
            list.add(finico);
        }
        return list;
    }
}
