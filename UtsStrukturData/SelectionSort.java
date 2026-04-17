package StrukturData;

public class SelectionSort {
    public static void main(String[] args) {
        int[] data = {82, 78, 73, 80, 77, 75, 95, 71, 92, 70};

        int n = data.length;

        for (int i = 0; i < n - 1; i++) {
            int Maxindex = i;

            for (int j = i + 1; j < n; j++) {
                if (data[j] > data[Maxindex]) {
                    Maxindex = j; 
                }
            }

            int temp = data[Maxindex];
            data[Maxindex] = data[i];
            data[i] = temp;
        }

       System.out.println("Nilai:  ");
        for (int i=0; i < n ; i++) {
            System.out.println(data[i] + " ");
        }

    }
}
