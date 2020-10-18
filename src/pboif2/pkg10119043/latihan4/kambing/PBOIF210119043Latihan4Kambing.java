/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan4.kambing;

/**
 *
 * @author 
 * NAMA : FERMI NAUFAL AKBAR
 * KELAS     : IF2 
 * NIM       : 10119043 
 * DESKRIPSI : Program ini berisi program untuk dengan variabel lokal
 */
public class PBOIF210119043Latihan4Kambing {

    /**
     * @param args the command line arguments
     */
    
    public void tambahKambing() {
        // Deklarasi variabel lokal
        int jumlahKambing = 0;
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah : "+ jumlahKambing);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        PBOIF210119043Latihan4Kambing kambingJantan = new PBOIF210119043Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
    
}
