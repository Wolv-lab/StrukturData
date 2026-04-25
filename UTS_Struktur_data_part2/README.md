# Deskripsi Fungsi Rekursif Fibonacci

Program ini menggunakan fungsi rekursif untuk menghitung nilai deret Fibonacci.

## Fungsi

```java
public static int fibo(int n)
```

Fungsi `fibo` menerima parameter `n` (bilangan ke-n) dan mengembalikan nilai Fibonacci pada posisi tersebut.

* `public` → dapat diakses dari luar class
* `static` → dapat dipanggil tanpa membuat objek
* `int` → tipe data hasil (bilangan bulat)

## Konsep Rekursif

Fungsi ini menggunakan metode **rekursif**, yaitu fungsi yang memanggil dirinya sendiri.

### Base Case (Kondisi Berhenti)

```java
if (n == 0) return 0;
else if (n == 1) return 1;
```

Digunakan untuk menghentikan proses rekursi agar tidak berjalan tanpa batas.

### Recursive Case (Pemanggilan Ulang)

```java
return fibo(n - 1) + fibo(n - 2);
```

Untuk menghitung nilai Fibonacci ke-n, fungsi akan memanggil:

* `fibo(n-1)`
* `fibo(n-2)`

Sesuai dengan rumus:

```
F(n) = F(n-1) + F(n-2)
```

## Kesimpulan

Fungsi ini bekerja dengan memecah masalah menjadi bagian yang lebih kecil hingga mencapai kondisi dasar, kemudian hasilnya digabungkan kembali untuk mendapatkan nilai akhir.
