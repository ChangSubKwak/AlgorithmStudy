package first;

// 인덱스를 기준으로 갯수를 세기
// Time Complexity : O(N * logN)

public class CountingSort {
  public static void main(String[] args) {
    int count[] = new int[5];
    int data[] = { 1, 3, 2, 4, 3, 2, 5, 3, 1, 2,
                     3, 4, 4, 3, 5, 1, 2, 3, 5, 2,
                     3, 1, 4, 3, 5, 1, 2, 1, 1, 1 };
    
    for (int i = 0 ; i < data.length ; i++)
      count[data[i] - 1]++;

    for (int i = 0 ; i < count.length ; i++)
      for (int j = 0 ; j < count[i] ; j++)
        System.out.print( (i+1) + " ");
    System.out.println();

  }
}
