# Deskripsi Fungsi Rekursif Fibonacci

# Hasil
![Hasil Run]([Hasil.png](https://github.com/Wolv-lab/StrukturData/blob/8a5e12b46a661876ff4009481f66698969d7106c/UTS_Struktur_data_part2/Hasil%20.png))
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
