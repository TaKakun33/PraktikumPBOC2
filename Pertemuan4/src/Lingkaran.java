/* File       : Lingkaran.java
 * Deskripsi  : Berisi artibut dan method dalam class Lingkaran
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 12 Maret 2026 
 */

public class Lingkaran extends BangunDatar{
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
    // Mengembalikann nilai Luas dari Lingkaran tsb
    public double getLuas(){
        return Math.PI *jari * jari;
    }

    // Mengembalikann nilai Keliling dari Lingkaran tsb
    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    // Penggunaan Override yang memungkinkan kelas anak (subclass) menyediakan implementasi khusus untuk metode printInfo dari kelas induk (superclass).
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("jari: " + getJari());
    }
}
