package org.example.javacore;

import java.util.Comparator;

/*
we have to sort the class based on  age then name if the age is same
 */
public class UserName  implements Comparator<UserName> {
    private String name;
    private int age;

    public UserName(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public UserName() {

    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }


    @Override
    public int compare(UserName un1, UserName un2){
        if(un1.getAge()> un2.getAge()){
            return 1;
        } else if (un1.getAge()< un2.getAge()) {
            return -1;
        }else{
            // compare based on name
            return un1.getName().compareTo(un2.getName()); // lexicographically compare
        }
    }
}
