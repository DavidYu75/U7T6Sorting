import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    /* --- SELECTION SORT --- */
    int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12};
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12};
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}
