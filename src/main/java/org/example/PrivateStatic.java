package org.example;

public interface PrivateStatic {
    void canFly();
    default void minimumFlyingHeight() {
        myPrivateStaticMethod();
        myStaticPublicMethod();
        myPrivateMethod();
    }
    static void myStaticPublicMethod(){
        myPrivateStaticMethod();
    }
    private void myPrivateMethod(){

    }
    private static void myPrivateStaticMethod() {

    }

}
