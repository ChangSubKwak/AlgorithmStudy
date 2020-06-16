package first;

// 옆과 비교하여 작은 것을 앞으로 보내자
// 비교를 많이함, 제일 느림
// Time Complexity : n^2

public class BubbleSort {
  public static void main(String[] args) {
    int temp;
    int[] array = { 2, 5, 9, 4, 1 };

    for (int i = 0 ; i < array.length ; i++ ) {
      for (int j = 0 ; j < array.length - (i + 1) ; j++ ) {
        if (array[j] > array[j+1]) {
          temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
        }
      }
    }
    for (int i = 0 ; i < array.length ; i++)
      System.out.print(array[i] + " ");
    System.out.println();
  }
}

