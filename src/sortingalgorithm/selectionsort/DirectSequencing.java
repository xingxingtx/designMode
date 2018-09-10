package sortingalgorithm.selectionsort;

import java.util.Arrays;

/**
 * Created by wei.peng on 2018/8/20.
 * 选择排序中的直接排序
 */
public class DirectSequencing implements Comparable<DirectSequencing>{
        int data;
        String flag;
    public  DirectSequencing(int data, String flag){
            this.data = data;
            this.flag = flag;
        }
        @Override
        public String toString() {
            return data + flag;
        }
        @Override
        public int compareTo(DirectSequencing o) {
            return this.data > o.data ? 1 : (this.data == o.data ? 0 : -1) ;
        }
    public static void directSortA(DirectSequencing[] direct){
        for(int i = 0;i< direct.length -1; i++){
            for(int j = i + 1;j < direct.length; j++){
                if(direct[i].compareTo(direct[j]) > 0){
                    DirectSequencing temp = direct[i];
                    direct[i] = direct[j];
                    direct[j] = temp;
                }
            }
        }
    }
    public static void directSortB(DirectSequencing[] direct){
        for(int i = 0;i< direct.length -1; i++){
            int minIndex = i;
            for(int j = i + 1;j < direct.length; j++){
                if(direct[minIndex].compareTo(direct[j]) > 0){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                DirectSequencing temp = direct[i];
                direct[i] = direct[minIndex];
                direct[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args){
        DirectSequencing[] direct = {
                new DirectSequencing(21,""),
                new DirectSequencing(30,""),
                new DirectSequencing(49,""),
                new DirectSequencing(30,"*"),
                new DirectSequencing(16,""),
                new DirectSequencing(9,""),
        };
        System.out.println(Arrays.toString(direct));
        // directSortA(direct);
        directSortB(direct);
        System.out.println(Arrays.toString(direct));
    }
}
