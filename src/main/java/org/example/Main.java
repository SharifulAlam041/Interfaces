package org.example;

public class Main {
    public static void main(String[] args) {
        NestedInterfaceInInterface.InnerInterface innerInterface = new Eagle2();
        innerInterface.canRUn();
        NestedInterfaceInInterface nestedInterfaceInInterface = new Eagle3();
        nestedInterfaceInInterface.canFly();
        NestedInterfaceInInterface.InnerInterface innerInterface1 = new Eagle3();
        innerInterface1.canRUn();

        Eagle obj = new Eagle();
        System.out.println(obj.getMinimumFlyHeight());
        Magpie magpie=new Magpie();
        System.out.println(magpie.getMinimumFlyHeight());

        Eagglle eagglle = new Eagglle();
        System.out.println(eagglle.getMinimumFlyHeight());

        Eaagle eaagle = new Eaagle();
        System.out.println(eaagle.getMinimumFlyHeight());

        Eaaggllee eaaggllee = new Eaaggllee();
        System.out.println(eaaggllee.getMinimumFlyHeight());
    }
}