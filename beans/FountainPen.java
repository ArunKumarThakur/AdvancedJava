package org.beans;
import org.interfaceBean.Ink;
import org.interfaceBean.Pen;

public class FountainPen implements Pen{
    private Ink ink;

    public FountainPen(final Ink ink) {
        this.ink = ink;
    }

    @Override
    public void write(){
        ink.color();
        ink.brand();
    }
}
