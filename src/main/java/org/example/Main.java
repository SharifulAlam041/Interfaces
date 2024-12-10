package org.example;

public class Main {
    public static void main(String[] args) {
        NestedInterfaceInInterface.InnerInterface innerInterface = new Eagle2();
        innerInterface.canRUn();
        NestedInterfaceInInterface nestedInterfaceInInterface = new Eagle3();
        nestedInterfaceInInterface.canFly();
        NestedInterfaceInInterface.InnerInterface innerInterface1 = new Eagle3();
        innerInterface1.canRUn();
    }
}