# NurviaAgustin_2210010254_4C_PBO1
PROYEK UAS PEMROGRAMAN BERBASIS OBJEK 1
Proyek ini adalah contoh sederhana aplikasi pengolahan data KOST menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi
Aplikasi ini menerima input berupa nama penghuni, kode dan nama kost, dan memberikan output berupa informasi detail dari kode tersebut seperti lantai kamar, nomor kamar, dan tipe kamar.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode
Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:
1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Kost`, `KostDetail`, dan `KostBeraksi` adalah contoh dari class.
   ```bash
public class Kost {
    ...
}

public class KostDetail extends Kost {
    ...
}

public class KostBeraksi {
    ...
}
```
2. **Object** adalah instance dari class. Pada kode ini, `penghuni[i] = new KostDetail(namaPenghuni, kodeKamar, namaKost);` adalah contoh pembuatan object.

```bash
penghuni[i] = new KostDetail(namaPenghuni, kodeKamar, namaKost);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaPenghuni`,`kodeKamar` dan `namaKost` adalah contoh atribut.

```bash
String namaPenghuni;
String kodeKamar;
String namaKost;
```
4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Kost` dan `KostDetail`.

```bash
public Kost(String namaPenghuni, String kodeKamar, String namaKost) {
    this.namaPenghuni = namaPenghuni;
    this.kodeKamar = kodeKamar;
    this.namaKost = namaKost;
}

public KostDetail(String namaPenghuni, String kodeKamar, String namaKost) {
    super(namaPenghuni, kodeKamar, namaKost);
}
```
5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamaPenghuni`, `setKodeKamar` dan `setNamaKost` adalah contoh method mutator.

```bash
public void setNamaPenghuni(String namaPenghuni) {
    this.namaPenghuni = namaPenghuni;
}

public void setKodeKamar(String kodeKamar) {
    this.kodeKamar = kodeKamar;
}
    
public void setNamaKost(String namaKost) {
    this.namaKost = namaKost;
}
```
6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaPenghuni`, `getKodeKamar`, `getNamaKost`, `getLantaikamar`, `getNomorKamar`, dan `getTipeKamar` adalah contoh method accessor.

```bash
public String getNamaPenghuni() {
    return namaPenghuni;
}

public String getKodeKamar() {
    return kodeKamar;
}
    
public String getNamaKost() {
    return namaKost;
}
```
7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private, protected atau public dan hanya bisa diakses melalui method. Pada kode ini, atribut `namapenghuni`, `kodekamar` dan `namakost` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
protected String namaPenghuni;
protected String kodeKamar;
protected String namaKost;
```
8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `KostDetail` mewarisi `Kost` dengan sintaks `extends`.

```bash
public class KostDetail extends kost {
    ...
}
```
9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `InfoKost(String)` di `Kost` merupakan overloading method `InfoKost` dan `InfoKost` di `KostDetail` merupakan override dari method `InfoKost` di `Kost`.

```bash
public String infoKost(String harga) {
    return infoKost() + "\nHarga: " + harga;
}

@Override
public String InfoKost() {
    ...
}
```
10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getLantaiKamar` dan seleksi `switch` dalam method `getNomorKamar` dan `getTipeKamar`.

```bash
public String getLantaiKamar() {
        if (kodeKamar.length() < 1) {
            return "Kode Kamar tidak valid";
        }
        String kodeLantai = kodeKamar.substring(0, 1);
        //seleksi if
        if (kodeLantai.equals("1")) {
            return "Lantai 1";
        } else if (kodeLantai.equals("2")) {
            return "Lantai 2";
        } else {
            return "Lantai tidak ada";
        }
    }

public String getNomorKamar() {
        if (kodeKamar.length() < 3) {
            return "Kode Kamar tidak valid";
        }
        String kodeKamarSub = kodeKamar.substring(1, 3);
        //seleksi switch
        switch (kodeKamarSub) {
            case "01":
                return "01";
            case "02":
                return "02";
            case "03":
                return "03";
            case "04":
                return "04";
            default:
                return "Kamar Tidak Tersedia";
        }
    }

public String getTipeKamar() {
        if (kodeKamar.length() < 4) {
            return "Kode Kamar tidak valid";
        }
        String kodeTipe = kodeKamar.substring(3);
        switch (kodeTipe) {
            case "F":
                return "Fasilitas";
            case "N":
                return "Non Fasilitas";
            default:
                return "Tipe Kamar Tidak Tersedia";
        }
    }
```
11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < penghuni.length; i++) {
    ...
}
```
12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("1. Masukkan Nama Penghuni: ");
String namaPenghuni = scanner.nextLine();

System.out.println("Data Penghuni Kost: ");
System.out.println(data.infoKost());
```
13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `KostDetail[] penghuni = new KostDetail[2];` adalah contoh penggunaan array.

```bash
KostDetail[] penghuni = new KostDetail[2];
```
14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Kesalahan umum: "+e.getMessage());
}
```
## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Nurvia Agustin
NPM: 2210010254
