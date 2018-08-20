package sortingalgorithm.exchangesort;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/8/20.
 * 交换排序中的快速排序
 */
public class QuickSort implements Comparable<QuickSort>{

    int data;
    String flag;
    public  QuickSort(int data, String flag){
        this.data = data;
        this.flag = flag;
    }
    @Override
    public String toString() {
        return data + flag;
    }
    @Override
    public int compareTo(QuickSort o) {
        return this.data > o.data ? 1 : (this.data == o.data ? 0 : -1) ;
    }

    public static void swape(QuickSort[] data, int i, int j){
        QuickSort temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
    public  static  void subSort(QuickSort[] data, int start, int end){
        if(start < end){
            QuickSort base = data[start];
            int i = start;
            int j = end + 1;
            while (true){
                while(j > start && data[--j].compareTo(base) >= 0);
                while (i < end && data[++i].compareTo(base) <= 0);
                if( i < j){
                    swape(data, i, j);
                }else {
                    break;
                }
            }
            swape(data,start,j);
            subSort(data, start,j -1);
            subSort(data, j + 1 ,end);

        }
    }
    public static  void quickSort(QuickSort[] data){
        subSort(data, 0 , data.length -1);
    }
    public static void main(String[] args){
        QuickSort[] quckSorts = {
                new QuickSort(100,""),
                new QuickSort(30,""),
                new QuickSort(4,""),
                new QuickSort(1,"*"),
                new QuickSort(16,""),
                new QuickSort(99,""),
        };
        System.out.println(Arrays.toString(quckSorts));
        quickSort(quckSorts);
        System.out.println(Arrays.toString(quckSorts));
    }
}
