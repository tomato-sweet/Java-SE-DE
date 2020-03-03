import java.util.Arrays;
import java.util.Random;

public class MySort {
    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    //升序排序
    /*
       插入排序：
       时间复杂度： 最坏情况： O(n^2) ---> 逆序序列    最好情况：O(n)  ---> 顺序序列
       稳定性：稳定
       空间复杂度：  常数空间  ---> O(1)
     */
    public static void insertSort(int[] arr){
        //开始可以认为第0个位置是排好序
        for(int i = 0; i < arr.length - 1; ++i){
            int key = arr[i + 1];
            //i: 表示已排序数据的最后一个位置
            int end = i;
            while(end >= 0 && arr[end] > key){
                //把大的元素向后移动
                arr[end + 1] = arr[end];
                //继续向前搜索
                --end;
            }
            // end : -1  或者  <= key的一个位置
            arr[end + 1] = key;
        }
    }

    public static void insertSort2(int[] arr){
        //开始可以认为第0个位置是排好序
        for(int i = 1; i < arr.length; ++i){
            //i: 下一个待排序元素的位置
            int key = arr[i];
            // end: 表示已排序数据的最后一个位置
            int end = i - 1;
            while(end >= 0 && arr[end] > key){
                arr[end + 1] = arr[end];
                --end;
            }
            arr[end + 1] = key;
        }
    }
    /*
          希尔排序：改进的插入排序，数据越有序，优化的空间就越小
          时间复杂度： O(n) ~ O(n^2)  -----> O(n^1.3)
          稳定性：不稳定
          空间复杂度：  常数空间  ---> O(1)
    */
    public static void shellSort(int[] arr){
        //对数据进行分组
        //每组数据进行插入排序: 逻辑分组
        // 同一组数据， 他们之间的间隔不一定为1
        int gap = arr.length;
        while(gap > 1){
            gap = gap / 3 + 1;
            //i: 表示已排序数据的最后一个位置
            for(int i = 0; i < arr.length - gap; ++i){
                int end = i;
                int key = arr[end + gap];

                while(end >= 0 &&arr[end] > key){
                    arr[end + gap] = arr[end];
                    end -= gap;
                }
                arr[end + gap] = key;
            }
        }
    }
    /*
              选择排序：
              时间复杂度： O(n^2)
              稳定性：可以让它稳定/不稳定
              空间复杂度：  常数空间  ---> O(1)
    */
    public static void selectSort(int[] arr){
        int begin = 0;
        int end = arr.length - 1;
        while(begin < end){

            int minIdx = begin;
            int maxIdx = begin;
            for(int i = begin; i <= end; ++i){
                //最小值选前面
                if(arr[i] < arr[minIdx])
                    minIdx = i;
                //最大值选后面
                if(arr[i] >= arr[maxIdx])
                    maxIdx = i;
            }
            swap(arr, begin, minIdx);
            //如果最大值在起始位置，则经过上面的交换之后，最大值被移动到minIdx指向的位置
            if(maxIdx == begin)
                maxIdx = minIdx;

            swap(arr, end, maxIdx);
            ++begin;
            --end;
        }
    }

    public static void selectSort2(int[] arr){
        //i: 未排序的最大位置
        for(int i = arr.length - 1; i > 0; --i)
        {
            int end = i;
            int maxIdx = i;
            //从所有未排序的数据中找最大值的索引
            for(int j = end - 1; j >=0; --j){
                if(arr[j] >arr[maxIdx])
                    maxIdx = j;
            }
            swap(arr, maxIdx, end);
        }
    }

    public static void shiftDownBig(int[] arr, int parent, int sz){
        int child = 2 * parent + 1;
        while(child < sz){
            //两个孩子节点中选择一个最小的
            if(child + 1 < sz && arr[child + 1] > arr[child])
                ++child;
            //比较父节点和孩子节点
            if(arr[child] > arr[parent]){
                swap(arr, child, parent);
                parent = child;
                child = 2 * parent + 1;
            }
            else
                break;
        }
    }

    /*
             堆排序：
             时间复杂度： 建堆： O(n)   log(n) +log(n - 1) + log(n - 2) + ... + 1   ---> n * log(n)
             稳定性： 不稳定  ---> 向下调整可能会破坏相对位置
             空间复杂度：  常数空间  ---> O(1)
   */
    public static void heapSort(int[] arr){
        int len = arr.length;
        //建堆， 最后一个非叶子节点开始向下调整
        for(int i = (len - 2) / 2; i >= 0; --i){
            shiftDownBig(arr, i, len);
        }
        //交换 《---》向下调整
        // 未排序的元素个数
        int end = len - 1;
        while(end > 0){
            swap(arr, 0, end);
            shiftDownBig(arr, 0, end);
            --end;
        }
    }

    /*
             冒泡排序：
             时间复杂度：O(n) ~ O(n^2)  最好：顺序 + 标记  最坏： 逆序
             稳定性： 稳定
             空间复杂度：  常数空间  ---> O(1)
   */
    public static void bubbleSort(int[] arr){
        // len: 未排序的元素个数
        int len = arr.length;
        while(len > 0){
            //flag: true ---->已经有序
            boolean flag = true;
            //一轮冒泡排序， 排好一个元素的位置
            for(int i = 0; i < len - 1; ++i){
                if(arr[i] > arr[i + 1]){
                    swap(arr, i, i + 1);
                    flag = false;
                }
            }
            if(flag)
                break;
            --len;
        }
    }

    public static int partion1(int[] arr, int left, int right){
        //基准值
        int key = arr[left];
        int start = left;
        while(left < right){
            //一定要先从后向前找第一个小于key的数据位置， 否则数据的位置会产生错误
            while(left < right && arr[right] >= key)
                --right;
            //从前向后找第一个大于key的数据位置
            while(left < right &&arr[left] <= key)
                ++left;
            //交换
            swap(arr, left, right);
        }
        //把基准值和相遇的位置的数据进行交换
        //错误： arr[left] = key; 相遇位置的数据被覆盖
        swap(arr, left, start);
        return left;
    }

    public static void quickSort(int[] arr, int left, int right){
        if(left < right){
            int mid = partion1(arr, left, right);
            //进行分组
            quickSort(arr, left, mid - 1);
            quickSort(arr, mid + 1, right);
        }
    }

    public static void test1()
    {
        int[]  arr = {120,12,9,3,120,2,10,35,89,0, 10,7,12,9};
        int[]  copy = arr.clone();
        int[]  copy2 = arr.clone();
        int[]  copy3 = arr.clone();
        int[]  copy4 = arr.clone();
        int[]  copy5 = arr.clone();
        int[]  copy6 = arr.clone();

        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println("insertSort : " + Arrays.toString(arr));
        Arrays.sort(copy);
        System.out.println("Arrays.sort(): " + Arrays.toString(copy));
        shellSort(copy2);
        System.out.println("shellSort : " + Arrays.toString(copy2));
        selectSort(copy3);
        System.out.println("selectSort : " + Arrays.toString(copy3));
        heapSort(copy4);
        System.out.println("heapSort : " + Arrays.toString(copy4));
        bubbleSort(copy5);
        System.out.println("bubbleSort : " + Arrays.toString(copy5));
        quickSort(copy6, 0, copy6.length - 1);
        System.out.println("quickSort : " + Arrays.toString(copy6));

    }

    public static void test2(){
        Random rdm = new Random(2020229111);
        int number = 100000;
        int[] arr = new int[number];
        for(int i = 0; i <number; ++i){
            arr[i] = rdm.nextInt();
        }
        int[] arr2 = arr.clone();
        int[] arr3 = arr.clone();
        int[] arr4 = arr.clone();
        int[] arr5 = arr.clone();

        long begin = System.nanoTime();
        insertSort(arr);
        long end = System.nanoTime();
        System.out.printf("insertSort time :  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);

        begin = System.nanoTime();
        shellSort(arr2);
        end = System.nanoTime();
        System.out.printf("shellSort time :  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);

        begin = System.nanoTime();
        selectSort(arr3);
        end = System.nanoTime();
        System.out.printf("selectSort time :  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);

        begin = System.nanoTime();
        heapSort(arr4);
        end = System.nanoTime();
        System.out.printf("heapSort time :  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);

        begin = System.nanoTime();
        bubbleSort(arr5);
        end = System.nanoTime();
        System.out.printf("bubbleSort time :  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);


        System.out.println("数据已经有序： ");
        begin = System.nanoTime();
        insertSort(arr);
        end = System.nanoTime();
        System.out.printf("insertSort time :  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);

        begin = System.nanoTime();
        shellSort(arr2);
        end = System.nanoTime();
        System.out.printf("shellSort time :  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);

        begin = System.nanoTime();
        selectSort(arr3);
        end = System.nanoTime();
        System.out.printf("selectSort time :  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);

        begin = System.nanoTime();
        heapSort(arr4);
        end = System.nanoTime();
        System.out.printf("heapSort time :  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);

        begin = System.nanoTime();
        bubbleSort(arr5);
        end = System.nanoTime();
        System.out.printf("bubbleSort time :  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);
    }


    public static void main(String[] args) {
        test1();
        //test2();
    }
}
