/* File       : Persegi.java
 * Deskripsi  : Berisi artibut dan method dalam class Persegi
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 12 Maret 2026 
 */

public class Persegi extends BangunDatar{
    
    /******** Variable ********/
    private double sisi;

    /******** method ********/

    /* Konstruktor */
    // Membuat objek Persegi tanpa parameter
    public Persegi() {
        setJmlSisi(4);
    }

    // Membuat objek Persegi dengan parameter
    public Persegi(double sisi, String warna, String border) {
        // Penngunaan super untuk mempercepat proses coding
        // super(4,warna,border);

        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);

        // Mengakses artibut dari class BangunDatar tidak bisa dilakukan
        // this.jmlSisi = 4;
        // this.warna = warna;
        // this.border = border;
    }

    /* Getter */
    // Mengembalikan nilai sisi Persegi
    public double getSisi() {
        return sisi;
    }

    /* Setter */
    // Mengesset sisi Persegi dengan real sisi 
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }   

    /* Method Lainnya */
    // Penggunaan Override yang memungkinkan kelas anak (subclass) menyediakan implementasi khusus untuk metode printInfo dari kelas induk (superclass).
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("sisi: " + getSisi());
    }

    // you cant do this because statik milik class bkn object sehingga overriding tdk mungkin
    // @Override
    // public static void printCounterBangunDatar(){
    // }

}
