public class AhmadFikriFaisWildan_25161562038_Stack {
     // === BAGIAN 1: Deklarasi Stack ===
    static String[] stack = new String[10];
    static int top = -1;


    // === BAGIAN 2: Operasi Stack ===
    static void push(String tiket) {
        if (top == stack.length - 1) {
            System.out.println("Stack penuh!");
            return; 
        }
        top++;
        stack[top] = tiket;
    }

    static String pop() {
        if (isEmpty()) {
            return "Stack kosong!";
        }
        String tiket_dibatalkan = stack[top];
        stack[top] = null;
        top--;
        return tiket_dibatalkan;
    }

    static String peek() {
        if (isEmpty()) {
            return "Stack kosong";
        }
        return stack[top];
    }

    static boolean isEmpty() {
        return top == -1;
    }

    static void tampilkanStack() {
        System.out.println("=== Isi Stack (TOP -> BOTTOM) ===");
        for (int i = top; i >= 0; i--) {
            System.out.println("| " + stack[i] + " |");
        }
        System.out.println("=================================");
    }

    static void hitungTotal() {
        int total = 0;

        for (int i = 0; i <= top; i++) {
            // Split berdasarkan "Rp" → bagian [1] = "50.000"
            String[] bagian = stack[i].split("Rp");
            // Menghapus karakter titik ribuan, lalu parse ke integer
            String hargaStr = bagian[1].replace(".", "");
            total += Integer.parseInt(hargaStr);
        }

        String totaltransaksi = String.format("%,d", total)
        .replace(",", ".");
        System.out.println("Total transaksi: Rp" + totaltransaksi);
    }


    // === BAGIAN 3: Main Program ===
    public static void main(String[] args) {

        // --- PUSH 3 Transaksi ---
        push("Tiket-A01: Avengers Rp50.000");
        push("Tiket-B02: Interstellar Rp45.000");
        push("Tiket-C03: Inception Rp45.000");

        // menghitung total setelah semua push selesai
        hitungTotal();

        // --- Menampilkan seluruh isi stack ---
        tampilkanStack();

        // --- Menampilkan tiket paling atas---
        System.out.println("Tiket terakhir masuk: " + peek());

        // --- Batalkan 1 transaksi teratas ---
        System.out.println("Tiket dibatalkan: " + pop());

        tampilkanStack();
    }
}
