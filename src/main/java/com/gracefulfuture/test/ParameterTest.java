package com.gracefulfuture.test;

import java.util.Arrays;
import java.util.OptionalInt;

public class ParameterTest {
    public static void main(String[] args) {
        int[] a = new int[]{6,2,7,8,5,1,5,10,3,0};
        //{0,1,2,3,5,5,6,7,8,10}
        //{0,0,0,0,0,0,0,0,0,0,0}
        //0-4           0-2   3-4   0-1 2-2 3-3  4-4 0-0 1-1 2-2 3-3  4-4
        //{6,2,7,8,5}-{6,2,7}{8,5}-{6,2}{7} {8}  {5}-{6} {2} {7} {8} {5}
        //5-9            5-7    8-9   5-6   7  8  9
        //{1,5,10,3,0}-{1,5,10}{3,0}-{1,5}{10}{3}{0}-{1}{5}{10}{3}{0}
        //0-4-9 0-2-4 5-7-9 0-1-2 5-6-7 0-0-1 3-3-4
//        String s1 = "Tom";
//        String s2 = new String("Tom");
        ParameterTest parameterTest = new ParameterTest();
//        parameterTest.bubbleSort(a);
//        parameterTest.printArray(a);
//        parameterTest.getName(s2);
//        System.out.println("-------------");
//        System.out.println(s2);
//        parameterTest.insertionSort(a);
//        parameterTest.selectionSort(a);
//        parameterTest.bucketSort(a);
//        parameterTest.quickSort(a,0,a.length-1);
//        parameterTest.mergerUp2Down(a,0,a.length-1);
//        parameterTest.radixSort(a);
//        parameterTest.shellSort(a);
        parameterTest.heapSortAsc(a);
        parameterTest.printArray(a);
    }
    //冒泡排序
    public void bubbleSort(int[] data){
        //n=data.length,即元素个数
        //做n-1次冒泡
        for (int i = 0; i < data.length-1; i++) {
            //每次冒泡经过n-1-i次比较，在n个元素中沉底一个最大的
            for (int j = 0; j < data.length-1-i; j++) {
                //交换元素，使大的靠后
                if(data[j] > data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }
    //选择排序
    public void selectionSort(int[] data){
        //n=data.length
        //假设最小元素下标从0开始，一直到n-2
        for (int i = 0; i < data.length-1; i++) {
            //最小元素下标
            int min = i;
            //从下标i后面n-i-1个元素中，选出一个最小的
            for (int j = i+1; j < data.length; j++) {
                if(data[j] < data[min]){
                    //重置最小元素下标
                    min = j;
                }
            }
            //交换data[i]和data[min]
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
    }
    //插入排序
    public void insertionSort(int[] data){
        //n=data.length
        //无序元素序列从data[1]开始，一直缩小到data[n-1]
        for (int i = 1; i <= data.length-1; i++) {
            //有序元素序列从data[0]开始，一直扩大到data[n-2]
            for (int j = 0; j <= i-1; j++) {
                //对于无序序列中的每个元素，如果在有序序列中找到第一个比它小的元素
                if(data[i] < data[j]){
                    //记录找到的有序序列元素
                    int target = data[j];
                    //把无序序列元素插入到找到的位置j
                    data[j] = data[i];
                    //从插入位置j开始，到i-1位置的有序序列元素后移
                    for (int k = j; k <= i-1; k++) {
                        int temp = data[k+1];
                        data[k+1] = target;
                        target = temp;
                    }
                    break;
                }
            }
        }
    }
    //桶排序
    public void bucketSort(int[] data){
        OptionalInt optionalInt = Arrays.stream(data).max();
        int max = optionalInt.getAsInt();
        int bucketsLength = max + 1;
        //创建一个桶数组，元素个数是待排序数组中最大的元素值加1
        int[] buckets = new int[bucketsLength];
        //记录data中每个元素出现的次数
        for (int i = 0; i < data.length; i++) {
            buckets[data[i]]++;
        }
        //排序
        for (int i = 0,j = 0; i < bucketsLength; i++) {
            while ((buckets[i]--) > 0){
                data[j++] = i;
            }
        }
        buckets = null;
    }

    //{53, 3, 542, 748, 14, 214, 154, 63, 616}
    //{0,0,1,3,3,0,1,0,1,0}->{0,0,0,1,4,7,7,8,8,9}
    //{542,53,3,63,14,214,154,616,748}

    //获取最大值
    private int getMaxValue(int[] data){
        int maxValue = data[0];
        for (int i = 1; i < data.length; i++) {
            if(data[i] > maxValue){
                maxValue = data[i];
            }
        }
        return maxValue;
    }
    //在某一特定位排序(1:个位，10:十位，100:百位，...)
    private void sortByExponent(int[] data,int exp){
        int length = data.length;
        int[] output = new int[length];
        int[] buckets = new int[10];
        //将数组data中，每个元素指定位上数值出现的次数，保存到buckets中
        for (int i = 0; i < length; i++) {
            buckets[(data[i]/exp)%10]++;
        }
        //更改buckets数组，使得更改后的值，是元素在output数组中的位置
        for (int j = 1; j < 10; j++) {
            buckets[j] += buckets[j-1];
        }
        //将数据存储到临时数组output[]中
        for (int k = length - 1; k >= 0 ; k--) {
            output[buckets[(data[k]/exp)%10]-1] = data[k];
            buckets[(data[k]/exp)%10]--;
        }
        //将排序好的数据赋值给a[]
        for (int l = 0; l < length; l++) {
            data[l] = output[l];
        }
    }
    //基数排序
    public void radixSort(int[] data){
        int maxValue = getMaxValue(data);
        //从个位开始，对数组data按"指数"进行排序
        for (int exp = 1;maxValue/exp > 0;exp *= 10){
            sortByExponent(data,exp);
        }
    }

    //快速排序
    public void quickSort(int[] data,int left,int right){
        if(left < right){
            int i = left;
            int j = right;
            int baseValue = data[i];
            while(i < j){
                while (i < j && data[j] > baseValue){
                    j--;// 从右向左找第一个小于x的数
                }
                if(i < j){
                    data[i++] = data[j];
                }
                while(i < j && data[i] < baseValue){
                    i++;// 从左向右找第一个大于x的数
                }
                if(i < j){
                    data[j--] = data[i];
                }
            }
            data[i] = baseValue;
            //递归调用
            quickSort(data,left,i-1);
            quickSort(data,i+1,right);
        }
    }
    //归并排序
    public void mergeSort(int[] data,int start,int middle,int end){
        // tmp是汇总2个有序区的临时区域
        int[] temp = new int[end-start+1];
        // 第1个有序区的索引
        int i = start;
        // 第2个有序区的索引
        int j = middle + 1;
        // 临时区域的索引
        int k = 0;
        while(i <= middle && j <= end){
            if(data[i] < data[j]){
                temp[k++] = data[i++];
            }else{
                temp[k++] = data[j++];
            }
        }

        while(i <= middle){
            temp[k++] = data[i++];
        }

        while (j <= end){
            temp[k++] = data[j++];
        }
        // 将排序后的元素，全部都整合到数组a中。
        for (int l = 0; l < k; l++) {
            data[start+l] = temp[l];
        }
        temp = null;
    }
    //从上到下归并排序
    public void mergerUp2Down(int[] data,int start,int end){
        if(data == null || start >= end){
            return;
        }
        int middle = (start + end) / 2;
        // 递归排序data[start...middle]
        mergerUp2Down(data,start,middle);
        // 递归排序data[middle+1...end]
        mergerUp2Down(data,middle+1,end);
        // data[start...middle] 和 a[middle...end]是两个有序空间，
        // 将它们排序成一个有序空间data[start...end]
        mergeSort(data,start,middle,end);
    }

    public void shellSort(int[] data){
        int length = data.length;
        // gap为步长，每次减为原来的一半。
        for(int gap = length / 2;gap > 0;gap /= 2){
            // 共gap个组，对每一组都执行直接插入排序
            for (int i = 0; i < gap; i++) {
                for (int j = gap + i; j < length; j++) {
                    // 如果data[j] < data[j-gap]，则寻找data[j]位置，并将后面数据的位置都后移。
                    if(data[j] < data[j-gap]){
                        int temp = data[j];
                        int k = j - gap;
                        while(k >= 0 && data[k] > temp){
                            data[k+gap] = data[k];
                            k -= gap;
                        }
                        data[k+gap] = temp;
                    }
                }
            }
        }
    }

    private void adjust2MaxHeap(int[] data,int start,int end){
        int currentIndex = start;
        int temp =  data[currentIndex];
        int left = 2 * currentIndex + 1;
        for (; left <= end; left = 2 * left + 1) {
            // "left"是左孩子，"left+1"是右孩子
            if(left < end && data[left] < data[left+1]){
                left++;// 左右两孩子中选择较大者
            }
            if(temp > data[left]){
                break;
            }else{
                data[currentIndex] = data[left];
                data[left] = temp;
            }
            currentIndex = left;
        }
    }

    public void heapSortAsc(int[] data){
        int length = data.length;
        int i;
        int temp;
        // 从(length/2-1) --> 0逐次遍历。遍历之后，得到的数组实际上是一个(最大)二叉堆。
        for (i = length / 2 - 1; i >= 0; i--){
            adjust2MaxHeap(data, i, length - 1);
        }

        // 从最后一个元素开始对序列进行调整，不断的缩小调整的范围直到第一个元素
        for (i = length - 1; i > 0; i--) {
            // 交换data[0]和data[i]。交换后，data[i]是data[0...i]中最大的。
            temp = data[0];
            data[0] = data[i];
            data[i] = temp;
            // 调整data[0...i-1]，使得data[0...i-1]仍然是一个最大堆。
            // 即，保证data[i-1]是data[0...i-1]中的最大值。
            adjust2MaxHeap(data, 0, i-1);
        }
    }

    public void printArray(int[] data){
        for (int item : data) {
            System.out.println(item);
        }
    }

    public void getName(String str){
        str = new String("Jack");
        System.out.println(str);
    }
}
