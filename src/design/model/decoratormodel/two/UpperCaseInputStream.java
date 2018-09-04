package design.model.decoratormodel.two;


import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by wei.peng on 2018/7/26.
 */
public class UpperCaseInputStream extends FilterInputStream{

    protected UpperCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toUpperCase((char)c));
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        for(int i = off;i< result + off;i++){
            b[i] = (byte)Character.toUpperCase((char)b[i]);
        }
        return result;
    }
}
