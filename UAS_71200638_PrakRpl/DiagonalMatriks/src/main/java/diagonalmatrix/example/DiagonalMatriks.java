package diagonalmatrix.example;

import java.util.Scanner;

public class DiagonalMatriks {
public static void main(String[] args) {
        int jumlahBaris, jumlahKolom;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Jumlah  baris martriks : ");
        jumlahBaris = scanner.nextInt();
        System.out.print("Masukan Jumlah kolom martriks : ");
        jumlahKolom = scanner.nextInt();
        Integer[][] array = new Integer[jumlahBaris][jumlahKolom];

        for (int i = 0; i < jumlahBaris; i++) {
        for (int j = 0; j < jumlahKolom; j++) {
        System.out.print("Masukan isi  beris ke " + i + " kolom ke "+j+":");
        array[i][j] = scanner.nextInt();
        }
        }

        System.out.println();
        System.out.println("berikut adalah isi array yang tadi dimasukan:");
        for (int i = 0; i < jumlahBaris; i++) {
        for (int j = 0; j < jumlahKolom; j++) {
        System.out.println("Isi indeks baris ke " + i + " kolom ke "+j+" adalah :" + array[i][j]);
        }
        }

        System.out.println();
        System.out.println("Bentuk matriks:");
        for (int i = 0; i < jumlahBaris; i++) {
        for (int j = 0; j < jumlahKolom; j++) {
        System.out.print(array[i][j]+" ");
        }
        System.out.println();
        }
}
}


