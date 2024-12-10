package org.example;

public interface NestedInterfaceInInterface {
    public void canFly();
    public interface InnerInterface {//always public
        public void canRUn();
    }

}
