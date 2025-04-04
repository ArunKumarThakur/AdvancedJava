package org.beans;
import org.interfaceBean.Ink;
public class BlackInk implements Ink{


    @Override
    public void brand(){
        System.out.println("Parker");
    }
    @Override
    public void color(){
        System.out.println("Black Ink");
    }
}
