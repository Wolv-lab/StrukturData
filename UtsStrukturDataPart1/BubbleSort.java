package StrukturData;
public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {82, 78, 73, 80, 77, 75, 95, 71, 92, 70};
        int n = data.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] < data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }

        System.out.println("Nilai:  ");
        for (int i=0; i < n ; i++) {
            System.out.println(data[i] + " ");
        
        }
    }
}
    

