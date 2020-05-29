package Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class test09 {
    public static void main(String[] args){
        List li = new ArrayList();
        li.add("Jakarta");
        li.add("Aceh");
        li.add("Malang");
        li.add("Medan");
        li.add("Bontang");
        li.add("Jogja");
        li.add("Jakarta");
        li.add("Bandung");
        li.add("Malang");
        li.add("Solo");
        li.add("Palembang");
        li.add("Bandung");

        List li2 = new ArrayList(new HashSet(li));

        Iterator it= li2.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
