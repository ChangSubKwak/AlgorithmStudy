package first;

// 이미 정렬된 배열 정렬시 효율적임
// 이미 정렬된 배열의 적절한 위치에 삽입하기
// Time Complexity : n^2

public class InsertionSort {
  public static void main(String[] args) {
    int i, j, temp;
    int[] array = { 10, 1, 5, 8, 7, 6, 4, 3, 2, 9 };

    for (i = 0 ; i < array.length - 1 ; i++ ) {
      j = i;
      while(j >= 0 && array[j] > array[j+1]) {
      //while(array[j] > array[j+1]) {
        temp = array[j+1];
        array[j+1] = array[j];
        array[j] = temp;
        j--;
      }
    }

    for (i = 0 ; i < array.length ; i++)
      System.out.print(array[i] + " ");
    System.out.println();
  }
}

