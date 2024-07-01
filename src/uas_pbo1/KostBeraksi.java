package uas_pbo1;

import java.util.Scanner;

public class KostBeraksi {
    public static void main(String[] args) {
        //object
        //Kost penghuni = new Kost("Nurvia Agustin","102F","Ve Kost")
        
        //system.out.println(penghuni.infoKost());
        //system.out.println(penghuni.infoKost("850000"));
        
        //error handling
        try {
            //io sederhana
            Scanner scanner = new Scanner(System.in);

            //array
            KostDetail[] penghuni = new KostDetail[2];

            //perulangan
            for (int i = 0; i < penghuni.length; i++) {
                System.out.print("1. Masukkan Nama Penghuni: ");
                String namaPenghuni = scanner.nextLine();
                System.out.print("2. Masukkan Kode Kamar: ");
                String kodeKamar = scanner.nextLine();
                System.out.print("3. Masukkan Nama Kost: ");
                String namaKost = scanner.nextLine();

                //objek
                penghuni[i] = new KostDetail(namaPenghuni, kodeKamar, namaKost);
            }

            //perulangan
            for (KostDetail data : penghuni) {
                System.out.println("=================");
                System.out.println("Data Penghuni Kost: ");
                System.out.println(data.infoKost());
            }
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan format Nomor: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan Format Kode Kamar: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan umum: " + e.getMessage());
        }
    }
}

