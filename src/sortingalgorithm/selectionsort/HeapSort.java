package sortingalgorithm.selectionsort;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/8/20.
 * 选择排序中的堆排序
 */
public class HeapSort implements Comparable<HeapSort>{
    int data;
    String flag;
    public  HeapSort(int data, String flag){
        this.data = data;
        this.flag = flag;
    }
    @Override
    public String toString() {
        return data + flag;
    }
    @Override
    public int compareTo(HeapSort o) {
        return this.data > o.data ? 1 : (this.data == o.data ? 0 : -1);
    }
    public static  void heapSort(HeapSort[] data){
        for(int i = 0;i< data.length;i++){
            buildMaxHead(data,data.length -1 - i);
            swape(data,0,data.length - 1 - i);
            System.out.println(Arrays.toString(data));
        }
    }
    private static void buildMaxHead(HeapSort[] data, int lastIndex){
        for (int i = (lastIndex -1)/2;i>=0;i--){
            int k = i;
            while (k * 2 + 1 <= lastIndex){
                int biggerIndex = k * 2 + 1;
                if(biggerIndex < lastIndex){
                    if(data[biggerIndex].compareTo(data[biggerIndex + 1]) < 0){
                        biggerIndex ++;
                    }
                }
                if(data[k].compareTo(data[biggerIndex]) < 0){
                    swape(data,k,biggerIndex);
                    k = biggerIndex;
                }else {
                    break;
                }
            }
        }
    }
    private static void swape(HeapSort[] data, int i, int j){
        HeapSort temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static void main(String[] args){
        HeapSort[] heapSorts = {
                new HeapSort(21,""),
                new HeapSort(30,""),
                new HeapSort(49,""),
                new HeapSort(1,"*"),
                new HeapSort(16,""),
                new HeapSort(9,""),
        };
        System.out.println(Arrays.toString(heapSorts));
        heapSort(heapSorts);
        System.out.println(Arrays.toString(heapSorts));
    }
}