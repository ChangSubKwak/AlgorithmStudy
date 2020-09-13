package javalang;

// 반으로 나누고 합칠 때 정렬하자
// Time Complexity : n*log(n)

public class MergeSort 
{
    public int[] tempSpace;
    
    public void merge(int[] data, int start, int middle, int end) {
        int i = start;
        int j = middle + 1;
        int k = start;

        while(i <= middle && j <= end) {
            if (data[i] < data[j]) {
                tempSpace[k] = data[i];
                i++;
                k++;
            } else {
                tempSpace[k] = data[j];
                j++;
                k++;
            }
        }

        while(i <= middle) {
            tempSpace[k] = data[i];
            i++;
            k++;
        }

        while(j <= end) {
            tempSpace[k] = data[j];
            j++;
            k++;
        }

        for (int l = start ; l <= end ; l++) {
            data[l] = tempSpace[l];
        }
    }

    public void sort(int[] data, int start, int end) {
        int middle = (start + end) / 2;

        if (start < end) {
            sort(data, start, middle);
            sort(data, middle+1, end);
            merge(data, start, middle, end);
        }
    }

    public static void main(String[] args) {
        int[] array = { 5, 4, 3, 2 ,1 }; 
    
        MergeSort ms = new MergeSort();
        ms.tempSpace = new int[array.length];
        ms.sort(array, 0, array.length - 1);

        for(int i = 0 ; i < array.length ; i++)
            System.out.print(ms.tempSpace[i] + " ");
        System.out.println();
    }
}
