package javalang;

// 힙 : 완전이진트리 기반의 부모자식간의 크고 작음을 조건으로 형성되는 자료구조
// 힙을 이용하여 정렬하는 방법
// O(N * logN)

public class HeapSort {
    public void heapify(int data[], int size) {

        for (int i = 1; i < size ; i++) {
            int ci = i;
            while(ci > 0) {
                int pi = (ci - 1) / 2;
                if (data[ci] > data[pi]) {
                    int temp = data[ci];
                    data[ci] = data[pi];
                    data[pi] = temp;
                }
                ci = pi;
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7};

        /*
        int[] data = new int[7];
        for (int i = 0; i < data.length ; i++) {
          data[i] = (int)(Math.random() * 100);
        }
        */

        System.out.println("Before sorting");
        for (int i = 0; i < data.length ; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        HeapSort hs = new HeapSort();
        hs.heapify(data, data.length);
    
        System.out.println("After heapifying");
        for (int i = 0; i < data.length ; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    
        for (int i = data.length - 1 ; i > 0; i--) {
            int temp = data[0];
            data[0] = data[i];
            data[i] = temp; 
            hs.heapify(data, i);
        }
    
        System.out.println("After sorting");
        for (int i = 0; i < data.length ; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
