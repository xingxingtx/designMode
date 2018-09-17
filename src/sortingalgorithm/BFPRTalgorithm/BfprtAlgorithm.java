package sortingalgorithm.BFPRTalgorithm;

import java.util.Random;

/**
 * Created by Administrator on 2018/9/17.
 * BFPRT(线性查找算法)
 * 算法步骤：
 1. 将n个元素每5个一组，分成n/5(上界)组。
 2. 取出每一组的中位数，任意排序方法，比如插入排序。
 3. 递归的调用selection算法查找上一步中所有中位数的中位数，设为x，偶数个中位数的情况下设定为选取中间小的一个。
 4. 用x来分割数组，设小于等于x的个数为k，大于x的个数即为n-k。
 5. 若i==k，返回x；若i<k，在小于x的元素中递归查找第i小的元素；若i>k，在大于x的元素中递归查找第i-k小的元素。
 终止条件：n=1时，返回的即是i小元素。
 */
public class BfprtAlgorithm {

    public static void main(String[] args) {
        int[] nums = new int[20];
        Random random = new Random();
        System.out.print("搜索的数组：");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(50);
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
        quickSort(nums,0,nums.length -1);
        System.out.println("排序后的数组");
        for (int i : nums) {
            System.out.println(i + " ");
        }
        int index = BFPRT(nums, 10);
        System.out.println();
        System.out.print("第10小的元素为：");
        System.out.println(index);
        System.out.print("划分后的数组：");
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] arr, int left, int right){
        if (left < right){
            int i = left, j = right, x = arr[right];
            while (i < j){
                while (i < j && arr[i] < x)
                    i++;
                if (i < j)
                    arr[j--] = arr[i];

                while (i < j && arr[j] >= x)
                    j--;
                if (i < j)
                    arr[i++] = arr[j];
            }
            arr[i] = x;
            quickSort(arr, left, i - 1);
            quickSort(arr, i + 1, right);
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /*寻找中位数*/
    public static int median(int[] arr, int left, int right) {

        int inx = left;
        for (int i = left; i <= right - 4; i = i + 5) {
            quickSort(arr, i, i + 4);
            swap(arr, inx, i + 2);
            inx++;
        }
        int end = (inx - left) * 5 + left;
        if (end < right) {
            quickSort(arr, end, right);
            swap(arr, inx, (right + end) / 2);
        }
        return inx;
    }
    /*
    * 找出中位数并将其与该区间的第一个元素交换，
    * 第二个中位数与该区间的第二个元素交换。
    * 所以该区间的前n / 5或(n / 5)+1个元素是中位数，返回最后一个中位数的下标。
    * */
    public static void selectMe(int[] arr, int left, int right){
        int inx = right;
        if ((right - left)> 0){
            inx = median(arr, left, right);
            selectMe(arr, left, inx);
        }
    }

    /*
    * 第四步的划分算法
    * */
    public static int partition(int[] arr, int left, int right){
        int inx = left;
        if (left < right){
            int i = left, j = right, x = arr[left];
            while (i < j){
                while (i < j && arr[j] > x)
                    j--;
                if (i < j)
                    arr[i++] = arr[j];

                while (i < j && arr[i] <= x)
                    i++;
                if (i < j)
                    arr[j--] = arr[i];
            }
            arr[i] = x;
            inx = i;
        }
        return inx;
    }

    /*
    * 返回主元的下标，也就是第k小的元素的下标。
    *最后递归调用算法找出结果
    * */
    public static int select(int[] arr, int left, int right, int key){
        selectMe(arr, left, right);
        int k = partition(arr, left, right);
        if (k > key){
            return select(arr, left, k - 1, key);
        }
        else if (k < key){
            return select(arr, k + 1, right, key);
        }
        return arr[k];
    }

    public static int BFPRT(int[] arr, int key){
        key -= 1;
        return select(arr, 0, arr.length - 1, key);
    }
}
