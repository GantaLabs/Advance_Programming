# Java OOP Practice - Two Dimensional Shapes

**Nama :** Roganda Tua Tampubolon

**NIM :** 255150201111017

**Kelas :** Pemrograman Lanjut - C

---

## Deskripsi (Bahasa Indonesia)

Program ini merupakan latihan implementasi **Object Oriented Programming (OOP)** menggunakan bahasa **Java**.
Program ini memodelkan beberapa **bangun dua dimensi** yaitu **Bujur Sangkar** dan **Lingkaran** yang diturunkan dari satu kelas induk.

Beberapa konsep OOP yang digunakan dalam program ini:

* **Inheritance** → kelas turunan mewarisi atribut dan method dari kelas induk.
* **Method Overriding** → method `luas()` pada kelas turunan menggantikan implementasi pada kelas induk.
* **Encapsulation** → atribut dibuat `private` dan diakses melalui method.

Program akan menampilkan **nama bangun datar** dan **hasil perhitungan luasnya**.

---

## Struktur File

``` text
Latihan_Pertama
│
├── BidangDuaDimensi.java
├── BujurSangkar.java
├── Lingkaran.java
└── Main.java
```

---

## Penjelasan File (Bahasa Indonesia)

### BidangDuaDimensi.java

Kelas ini merupakan **kelas induk (superclass)** yang merepresentasikan bangun dua dimensi secara umum.

Isi dari kelas ini:

* Atribut `nama`
* Method `info()` untuk menampilkan nama bangun
* Method `luas()` sebagai method dasar yang nantinya akan dioverride oleh kelas turunan

---

### BujurSangkar.java

Kelas ini merupakan **kelas turunan dari BidangDuaDimensi** yang merepresentasikan bangun **Bujur Sangkar**.

Isi dari kelas ini:

* Atribut `sisi`
* Override method `luas()` untuk menghitung luas bujur sangkar dengan rumus:

``` text
luas = sisi × sisi
```

---

### Lingkaran.java

Kelas ini merupakan **kelas turunan dari BidangDuaDimensi** yang merepresentasikan bangun **Lingkaran**.

Isi dari kelas ini:

* Atribut `radius`
* Override method `luas()` untuk menghitung luas lingkaran dengan rumus:

``` text
luas = π × r²
```

---

### Main.java

Kelas ini merupakan **program utama** yang digunakan untuk menjalankan aplikasi.

Di dalam kelas ini:

* Membuat objek `BujurSangkar`
* Membuat objek `Lingkaran`
* Memanggil method `info()`
* Menampilkan hasil perhitungan luas dari masing masing bangun

---

## English Version

## Description

This program is a simple implementation of **Object Oriented Programming (OOP)** using the **Java programming language**.

The program models several **two dimensional shapes**, specifically **Square** and **Circle**, which are derived from a parent class.

The OOP concepts applied in this program include:

* **Inheritance** where child classes inherit attributes and methods from a parent class.
* **Method Overriding** where the `luas()` method in the child classes replaces the implementation in the parent class.
* **Encapsulation** where attributes are declared `private` and accessed through methods.

The program displays the **name of the shape** and its **calculated area**.

---

## File Structure

``` text
Latihan_Pertama
│
├── BidangDuaDimensi.java
├── BujurSangkar.java
├── Lingkaran.java
└── Main.java
```

---

## File Explanation

### BidangDuaDimensi.java (Eng)

This class acts as the **parent class (superclass)** representing a general two dimensional shape.

Contents of this class:

* Attribute `nama`
* Method `info()` to display the shape name
* Method `luas()` as a base method that will be overridden by subclasses

---

### BujurSangkar.java (Eng)

This class is a **child class derived from BidangDuaDimensi** representing a **Square**.

Contents of this class:

* Attribute `sisi`
* Overrides the `luas()` method to calculate the area of a square using the formula

``` text
area = side × side
```

---

### Lingkaran.java (Eng)

This class is another **child class derived from BidangDuaDimensi** representing a **Circle**.

Contents of this class:

* Attribute `radius`
* Overrides the `luas()` method to calculate the area of a circle using the formula

``` text
area = π × r²
```

---

### Main.java (Eng)

This class serves as the **main entry point** of the program.

Inside this class:

* Creates a `BujurSangkar` object
* Creates a `Lingkaran` object
* Calls the `info()` method
* Displays the calculated area of each shape

``` text
```
