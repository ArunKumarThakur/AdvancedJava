package org.beans;

import org.interfaceBean.Pen;

public class Writer {
    private Pen pen;

    public Writer(final Pen pen) {
        this.pen = pen;
    }

    public void write(){
        pen.write();
    }
}
