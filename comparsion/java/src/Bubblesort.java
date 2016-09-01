import java.util.*;

public class Bubblesort {
  public static void main(String []args){
      int origins []= {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
      int numbers []= sorting(origins);
      System.out.println(Arrays.toString(numbers));
  }
  
public  static int[] sorting(int [] origins){
     int temp=0;
    for(int i=0;i<origins.length-1;i++){
        for(int j=0;j<origins.length-1-i;j++){
        if(origins[j]>origins[j+1]){
            temp=origins[j];
            origins[j]=origins[j+1];
            origins[j+1]=temp;
        }
        }
    }
    return origins;
}
}
