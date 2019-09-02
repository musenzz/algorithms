package algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) throws Exception {
        int[] arr = new int[3];
        arr[0]=3;
        arr[1]=2;
        arr[2]=1;
        System.out.print(sort(arr));;
    }

    public static  int[] sort(int[] sourceArray) throws Exception {
        // 321
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        for (int i = 1; i < arr.length; i++) {
            // 设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
            boolean flag = true;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return arr;
    }
}


