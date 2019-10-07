/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg10118007.latihan23.terbesardanterkecil;
import java.util.Scanner;

/**
 * Nama      : Rama Al Halik
 * Kelas     : IF-1
 * NIM       : 10118007
 * Deskripsi : Menampilkan Nilai Terbesar dan Terkecil
 * @author Rama
 */
public class IF110118007Latihan23TerbesardanTerkecil {

        String nama;
    int jmlMhs, min = 100, max = 0;

    Scanner masuk = new Scanner(System.in);

    public void MinMax() {
        System.out.println("===Program Nilai Terbesar dan Terkecil===");
        System.out.print("Masukkan Nama Petugas: ");
        nama = masuk.nextLine();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa: ");
        jmlMhs = masuk.nextInt();

        int[] nilaiMahasiswa = new int[jmlMhs];

        for (int i = 0; i <= (jmlMhs - 1); i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + "= ");
            nilaiMahasiswa[i] = masuk.nextInt();

        }

        //Tampil        
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        for (int i = 0; i <= (jmlMhs - 1); i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " = " + nilaiMahasiswa[i]);

            if (nilaiMahasiswa[i] > max) {
                max = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < min) {
                min = nilaiMahasiswa[i];
            }
        }
        System.out.printf("%nNilai terbesar adalah %d", max);
        System.out.printf("%nNilai terkecil adalah %d%n%n", min);
        System.out.println("Petugas\t: " + nama);

    }

    public static void main(String[] args) {
        IF110118007Latihan23TerbesardanTerkecil TerkecilTerbesar = new IF110118007Latihan23TerbesardanTerkecil();
        TerkecilTerbesar.MinMax();
    }
    
}
