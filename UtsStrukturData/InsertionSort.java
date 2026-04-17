package StrukturData;

public class InsertionSort {
    public static void main(String[] args) {
        int[] data = {82, 78, 73, 80, 77, 75, 95, 71, 92, 70};

        int n = data.length;

        for (int i = 1; i < data.length; i++) {
            int key = data[i]; 
            int j = i - 1;

            while (j >= 0 && data[j] < key) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }

        System.out.println("Nilai:  ");
        for (int i=0; i < n ; i++) {
            System.out.println(data[i] + " ");
        }
    }
}

