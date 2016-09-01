import java.util.Arrays;

/**
*
* @param numbers 带排序数组
* @param low  开始位置
* @param high 结束位置
*/

public class Quicksort{
  public static void main(String []args){
    int [] a={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
    quick(a);
    System.out.println(Arrays.toString(a));
  }
    public static int getMiddle(int[] list, int low, int high) {
            int pivot = list[low];    //set the first number as pivot
            while (low < high) {
                while (low < high && list[high] >= pivot) {
                    high--;
                }
                list[low] = list[high];   //比中轴小的记录移到低端
                while (low < high && list[low] <= pivot) {
                    low++;
                }
                list[high] = list[low];   //比中轴大的记录移到高端
            }
           list[low] = pivot;              //中轴记录到尾
            return low;                   //返回中轴的位置
        }
  public static void sorting(int[] numbers,int low,int high)
  {
     if(low < high)
     {
         int middle = getMiddle(numbers,low,high);// divide the int array list
         sorting(numbers, low, middle-1);// recursively sort for smaller number
         sorting(numbers, middle+1, high); // recursively sort for larger number
     }

  }
  public static void quick(int[] numbers) {
              if ( numbers.length > 0) {    //查看数组是否为空
                  sorting(numbers, 0, numbers.length - 1);
          }
  }
}
