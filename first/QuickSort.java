package first;

// 이미 정렬된 배열 정렬시 비효율적임
// 특정한 값을 기준으로 큰 숫자와 작은 숫자를 나누어 보자
// Time Complexity : O(N * logN)

public class QuickSort {
  public void printData(int[] data) {
    for (int i = 0 ; i < data.length ; i++) 
      System.out.print(data[i] + " ");
    System.out.println();
  }

  public void qsort(int[] data, int start, int end) {
    int pivot = start;
    int left = start + 1, right = end;

    //printData(data);

    if (start >= end)
      return;

    while (left <= right) {
      while(left <= end && data[left] <= data[pivot])
        left++;

      while(right > start && data[right] >= data[pivot])
        right--;

      int temp;

      printData(data);
      //System.out.print("pivot = " + pivot); System.out.print("\tleft = " + left); System.out.print("\tright = " + right + "\n");
      //System.out.print("pivot["  + pivot + "]=" + data[pivot]); 
      //System.out.print("\tleft[" + left  + "]=" + data[left == data.length ? data.length - 1 : left]); 
      //System.out.print("\tright[" + right + "]=" + data[right == -1 ? 0 : right] + "\n"); 
      if (left > right) {
        temp = data[pivot];
        data[pivot] = data[right];
        data[right] = temp;
      } else {
        temp = data[left];
        data[left] = data[right];
        data[right] = temp;
      }
    }
    qsort(data, start , right - 1);
    qsort(data, right + 1, end);
  }

  public static void main(String[] args) {
    //int[] array = { 10, 1, 5, 8, 7, 6, 4, 3, 2, 9 };
    //int[] array = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 };
    int[] array = { 1, 5, 4, 2, 3 };

    QuickSort qs = new QuickSort();
    qs.qsort(array, 0, array.length - 1);

    for (int i = 0 ; i < array.length ; i++)
      System.out.print(array[i] + " ");
    System.out.println();
  }
}

