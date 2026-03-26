/**
 * File      : AngkaSialException.java
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 26 Maret 2026 
 * */

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}