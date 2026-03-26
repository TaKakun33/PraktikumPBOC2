/* File       : Lingkaran.java
 * Deskripsi  : Berisi artibut dan method dalam class Lingkaran
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 26 Maret 2026 
 */

public class Lingkaran extends BangunDatar implements IResize{
    /******** Variable ********/
    private double jari;

    /******** method ********/

    /* Konstruktor */
    // Membuat objek Lingkaran tanpa parameter
    public Lingkaran() {
        setJmlSisi(1);
    }

    // Membuat objek Lingkaran dengan parameter
    public Lingkaran(double jari, String warna, String border) {
        super(1, warna, border);
        this.jari = jari;

        // Karena penggunaan Super sehingga tidak usah nilis ini lagi
        // setWarna(warna);
        // setBorder(border);
        // setJmlSisi(1);
    }

    /* Getter */
    // Mengembalikan nilai jari Lingkaran
    public double getJari() {
        return jari;
    }

    /* Setter */
    // Mengesset jari Lingkaran dengan real jari 
    public void setJari(double jari) {
        this.jari = jari;
    }

    /* Method Lainnya */ 
    // Penggunaan Override yang memungkinkan kelas anak (subclass) menyediakan implementasi khusus untuk metode printInfo dari kelas induk (superclass).
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("jari: " + getJari());
    }
    
    
    /******** Pertemuan 5 (Menggunakan abstrak dan interface) ********/

    /* Implementasi Abstrak */
    // Mengembalikann nilai Luas dari Lingkaran tsb
    @Override
    public double getLuas(){
        return Math.PI *jari * jari;
    }

    // Mengembalikann nilai Keliling dari Lingkaran tsb
    @Override
    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    /* Implementasi interface */
    // menambah ukuran lingkaran menjadi 10% lebih besar
    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    // menambah ukuran lingkaran menjadi 10% lebih kecil
    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    // menskalakan ukuran lingkaran sesuai dengan input percent yang diberikan
    @Override
    public void zoom(int percent) {
        jari = jari * percent / 100;
    }
}
