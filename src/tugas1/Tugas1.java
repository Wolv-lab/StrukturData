package tugas1;
public class Tugas1 {
    public static void main(String[] args) {
        int[] x = { 20, 15, 90, 13, 26 };
        int n = x.length;
        int temp = 0;
        
        System.out.print("Data Awal: [");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + (i == x.length - 1 ? "" : ", "));
        }
        System.out.println("]");
        
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (x[j] < x[min]) {
                    min = j;
                }
            }
            if (min != i) {
                temp = x[i];
                x[i] = x[min];
                x[min] = temp;
            }
            for (int o = 0; o < n; o++) {
                System.out.print(x[o] + (o == n - 1 ? "\n" : ", "));
            }
        }
    }
}

