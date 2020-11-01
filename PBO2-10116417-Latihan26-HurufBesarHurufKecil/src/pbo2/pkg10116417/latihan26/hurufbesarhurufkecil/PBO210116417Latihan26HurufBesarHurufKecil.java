/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116417.latihan26.hurufbesarhurufkecil;
import java.util.Scanner;

/**
 *
 * @author Akmal
 *  NAMA        : GILANG PANJI WANENG PATI
 *  KELAS       : PBO2
 *  NIM         : 10116417
 *  DESKRIPSI   : BERISI TENTANG PROGRAM HURUF BESAR DAN HURUF KECIL
 */
public class PBO210116417Latihan26HurufBesarHurufKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Kalimat;
        System.out.print("Masukan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        Kalimat = scanner.nextLine();
        
        String Besar = Kalimat.toUpperCase();
        String Kecil = Kalimat.toLowerCase();
        System.out.println();
        System.out.println("========HasilFormating=======");
        System.out.println("Huruf besar = " + Besar);
        System.out.println("Huruf Kecil = " + Kecil);
        System.out.println("Devoloped by  Gilang Panji Waneng Pati");
    }
    
}
