package org.example;

public interface Bird3 extends LivingThings{
    @Override
    default int getMinimumFlyHeight() {
        return LivingThings.super.getMinimumFlyHeight() + 5000;
    }
}
