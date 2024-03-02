package org.example.javacore;

public class MemberInnerClassTest {
    // class is like a member, we can accsess private members
    private class A{
        int i;
        public A(int i){
            this.i = i;
        }

        public int getI(){
            return i;
        }
    }

    public static void main(String[] args) {
      MemberInnerClassTest.A a = new MemberInnerClassTest().new A(3);
      System.out.println(a.getI());
    }
}
