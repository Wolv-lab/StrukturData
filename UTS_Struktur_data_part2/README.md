# UTS STRUKTUR DATA PART 2

## Nama = AHMAD FIKRI FAIS WILDAN | NPM = 25161562038
<img src="IMG_20260425_125947.jpg.jpeg" width="400"/>

### Kondisi dasar (base case)
```java
if (n == 0) {
    return 0;
} else if (n == 1) {
    return 1;
}
```
Digunakan untuk menghentikan proses rekursif agar tidak berjalan tanpa batas.

### Proses rekursif

```java
else {
    return fibonacci(n - 1) + fibonacci(n - 2);
}
```
Sesuai dengan rumus:
```
F(n) = F(n-1) + F(n-2)
```

### Hasil
<img src="Hasil%20.png" width="400"/>
