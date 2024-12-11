package org.example;

public interface Bird {
    void canFly();
    default int getMinimumFlyHeight() {//It can be overridden or ignored, if ignored this implementation will be used
        return 100;
    }
}
