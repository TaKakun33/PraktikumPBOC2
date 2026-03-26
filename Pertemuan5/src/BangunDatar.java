/* File       : BangunDatar.java
 * Deskripsi  : Berisi artibut dan method dalam class BangunDatar
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 26 Maret 2026 
 */

// Jika Menggunakan Final pada class BangunDatar maka kelas tersebut tidak dapat lagi diwariskan
// public final class BangunDatar {
// }

public abstract class BangunDatar {
    /******** Variable ********/
    private int jmlSisi;
    private  String warna;
    private String border;
    private static int counterBangunDatar;

    /******** method ********/

    /* Konstruktor */
    // Membuat objek BangunDatar dengan parameter
    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // Membuat objek BangunDatar tanpa parameter
    public BangunDatar(){
        counterBangunDatar++;
    }

    /* Getter */
    // Mengembalikan nilai jmlSisi BangunDatar
    public int getJmlSisi() {
        return jmlSisi;
    }

    // Mengembalikan nilai warna BangunDatar
    public String getWarna() {
        return warna;
    }

    // Mengembalikan nilai border BangunDatar
    public String getBorder() {
        return border;
    }

    /* Setter */
    // Mengesset noPlat dengan integer jmlSisi 
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    // Mengesset noPlat dengan string warna 
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Mengesset noPlat dengan string border 
    public void setBorder(String border) {
        this.border = border;
    }

    /* Method Lainnya */
    // print nilai artibut dari class BangunDatar
    public void printInfo(){
        System.out.println("Jumlah Sisi: " + getJmlSisi());
        System.out.println("warna: " + getWarna());
        System.out.println("border: " + getBorder());
    }
    
    // Jika Menggunakan Final pada method printInfo maka method tidak dapat di-override oleh kelas anak (subclass).
    // public final void printInfo(){
    //     System.out.println("Jumlah Sisi: " + getJmlSisi());
    //     System.out.println("warna: " + getWarna());
    //     System.out.println("border: " + getBorder());
    // }
    
    // print nilai counterBangunDatar dimana memberitau berapa banyak bangundatar yg dibuat
    public static void printCounterBangunDatar(){
        System.err.println("Jumlah bangun datar " + counterBangunDatar);
    }


    /******** Pertemuan 5 (Menggunakan abstrak dan interface) ********/

    /* Method abstrak */
    // Mendapatkan Luas (masih kosong)
    public abstract double getLuas();

    // Mendapatkan Keliling (masih kosong)
    public abstract double getKeliling();

    /* Method tambahan dari Method abstrak */
    // Memberikan boolean apakah Luas kedua bangun datar sama ?
    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    // Memberikan boolean apakah Keliling kedua bangun datar sama ?
    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }
}
