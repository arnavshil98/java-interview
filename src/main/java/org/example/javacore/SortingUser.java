package org.example.javacore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingUser{


    public static void main(String[] args) {
        List<UserName> userNameList = new ArrayList<>();

        userNameList.add(new UserName("Arnav",27));
        userNameList.add(new UserName("Ashwin",27));
        userNameList.add(new UserName("Pranjal",21));
        userNameList.add(new UserName("Anisha",21));

        Collections.sort(userNameList,new UserName());

        userNameList.forEach(e->{
            System.out.println("e.getName():"+ e.getName() + " e.getAge():"+ e.getAge());
        });

    }

}
