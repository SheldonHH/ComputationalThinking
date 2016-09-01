import java.util.Arrays;

/**
*
* @param numbers sorted arrats
* @param low  starting position
* @param high ending position
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
                list[low] = list[high];   //move the numbers that smaller than the pivot to the left
                while (low < high && list[low] <= pivot) {
                    low++;
                }
                list[high] = list[low];   ///move the numbers that bigger than the pivot to the right
            }
           list[low] = pivot;             
            return low;                   //return the position of the pivot
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
              if ( numbers.length > 0) {    //check wheteher the numbers array reach empty
                  sorting(numbers, 0, numbers.length - 1);
          }
  }
}
