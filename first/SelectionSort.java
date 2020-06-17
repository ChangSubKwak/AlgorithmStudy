package first;

// 제일 작은 것을 앞으로 보내보자
// Time Complexity : n^2

public class SelectionSort {
  public static void main(String[] args) {
    int min, minIdx = 0, temp;
    int[] array = { 2, 5, 9, 4, 1 };

    for (int i = 0 ; i < array.length ; i++ ) {
      min = 100;
      for (int j = i ; j < array.length ; j++ ) {
        if (min > array[j]) {
          min = array[j];
          minIdx = j;
        }
      }
      temp = array[minIdx];
      array[minIdx] = array[i];
      array[i] = temp;
    }
    for (int i = 0 ; i < array.length ; i++)
      System.out.print(array[i] + " ");
    System.out.println();
  }
}

