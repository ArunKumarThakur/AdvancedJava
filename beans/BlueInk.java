package org.beans;
import org.interfaceBean.Ink;
public class BlueInk implements Ink{

    @Override
    public void color() {
        System.out.println("Blue");
    }

    @Override
    public void brand() {
        System.out.println("Reynolds");
    }
}
