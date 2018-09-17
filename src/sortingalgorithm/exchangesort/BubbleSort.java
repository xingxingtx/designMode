package sortingalgorithm.exchangesort;

import java.util.Arrays;

/**
 * Created by wei.peng on 2018/8/20.
 * 冒泡排序
 */
public class BubbleSort implements Comparable<BubbleSort>{
    int data;
    String flag;
    public  BubbleSort(int data, String flag){
        this.data = data;
        this.flag = flag;
    }
    @Override
    public String toString() {
        return data + flag;
    }
    @Override
    public int compareTo(BubbleSort o) {
        return this.data > o.data ? 1 : (this.data == o.data ? 0 : -1) ;
    }

    public static void bubbleSort(BubbleSort[] data){
        for(int i = 0; i< data.length -1; i++){
            boolean bl = false;
            for(int j = 0; j < data.length -1 -i; j++){
                if(data[j].compareTo(data[j + 1]) <= 0){
                    BubbleSort temp =  data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = temp;
                    bl = true;
                }
            }
            System.out.println(Arrays.toString(data));
            if(!bl){
                break;
            }
        }
    }
    public static void main(String[] args){
        BubbleSort[] bubble = {
                new BubbleSort(1,""),
                new BubbleSort(5,""),
                new BubbleSort(49,""),
                new BubbleSort(1,"*"),
                new BubbleSort(16,""),
                new BubbleSort(9,""),
        };
        System.out.println(Arrays.toString(bubble));
        bubbleSort(bubble);
        System.out.println(Arrays.toString(bubble));
    }

    //先确定元素位置，在根据元素位置放置元素
    public static int[] sortA(int[] arr){
        int[] reArr = new int[arr.length];
        int maxCount = 0;
        int eqCount = 0;
        for(int i = 0;i<arr.length;i++) {
            for (int j = 0; j < arr.length;j++) {
                if (arr[i] > arr[j]){
                    maxCount ++;
                }
                if(arr[i] == arr[j]){
                    eqCount ++;
                }
            }
            reArr[maxCount]  = arr[i];
            if(eqCount > 1){
                for(int k = 1;k<eqCount;k++){
                    reArr[maxCount + k] = arr[i];
                }
            }
            maxCount = 0;
            eqCount = 0;
        }
        return reArr;
    }
}
