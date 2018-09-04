package design.model.adaptermodel.two;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by wei.peng on 2018/8/2.
 */
public class EnumerationIterator implements Iterator{
   Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
