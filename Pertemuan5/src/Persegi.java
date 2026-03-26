/* File       : Persegi.java
 * Deskripsi  : Berisi artibut dan method dalam class Persegi
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 26 Maret 2026 
 */

public class Persegi extends BangunDatar implements IResize{
    
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


    /******** Pertemuan 5 (Menggunakan abstrak dan interface) ********/

    /* Implementasi Abstrak */
    // Mengembalikann nilai Luas dari Persegi tsb
    @Override
    public double getLuas(){
        return sisi * sisi;
    }

    // Mengembalikann nilai Keliling dari Persegi tsb
    @Override
    public double getKeliling(){
        return 4 * sisi;
    }

    /* Implementasi interface */
    // menambah ukuran persegi menjadi 10% lebih besar
    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    // menambah ukuran persegi menjadi 10% lebih kecil
    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    // menskalakan ukuran persegi sesuai dengan input percent yang diberikan
    @Override
    public void zoom(int percent) {
        sisi = sisi * percent / 100;
    }

}
