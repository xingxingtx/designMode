package design.model.decoratormodel.two;

import java.io.*;

/**
 * Created by wei.peng on 2018/7/26.
 */
public class TestMain {
    public static void main(String[] args){
        try {
            int c;
            InputStream inputStream = new UpperCaseInputStream(new BufferedInputStream(new FileInputStream("F:\\javaBase\\src\\com\\design\\model\\decoratormodel\\chaptertwo\\test.txt")));
            StringBuilder builder = new StringBuilder();
            while((c = inputStream.read())>=0){
                builder.append(((char)c));
            }
            System.out.print(builder.toString().toLowerCase());
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
