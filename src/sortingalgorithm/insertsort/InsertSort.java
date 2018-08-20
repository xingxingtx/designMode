package sortingalgorithm.insertsort;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/8/20.
 */
public class InsertSort implements Comparable<InsertSort>{
    int data;
    String flag;
    public  InsertSort(int data, String flag){
        this.data = data;
        this.flag = flag;
    }
    @Override
    public String toString() {
        return data + flag;
    }
    @Override
    public int compareTo(InsertSort o) {
        return this.data > o.data ? 1 : (this.data == o.data ? 0 : -1) ;
    }
    public static void insertSort(InsertSort[] data){
        for(int i = 1; i< data.length; i++){
            InsertSort sorts = data[i];
            if(data[i].compareTo(data[i -1]) > 0){
                int j = i -1;
                for(;j >= 0 && data[j].compareTo(sorts) < 0; j--){
                    data[j+1] = data[j];
                }
                data[j + 1] = sorts;
            }
            System.out.println(Arrays.toString(data));
        }
    }
    public static void main(String[] args){
        InsertSort[] insertSorts = {
                new InsertSort(7,""),
                new InsertSort(5,""),
                new InsertSort(49,""),
                new InsertSort(1,"*"),
                new InsertSort(16,""),
                new InsertSort(9,""),
        };
        System.out.println(Arrays.toString(insertSorts));
        insertSort(insertSorts);
        System.out.println(Arrays.toString(insertSorts));
    }
}
