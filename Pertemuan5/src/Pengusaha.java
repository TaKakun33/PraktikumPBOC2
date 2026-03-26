/* File       : Pengusaha.java
 * Deskripsi  : Berisi atribut dan method dalam class Pengusaha (turunan Manusia)
 * NIM & Nama : Akmal Kafi Anan - 24060124120042
 * Tanggal    : 27 Maret 2026
 */

/******** Library ********/
import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia {
    /******** Variable ********/
    private String npwp;
    private static int counterPengusaha = 0;

    // Konstanta B = digit ke-13 NIM (24060124120042) = 4
    private static final int B = 4;

    /******** Method *********/
    /* Konstruktor */
    // Membuat objek Pengusaha tanpa parameter
    public Pengusaha() {
        super();
        counterPengusaha++;
    }

    // Membuat objek Pengusaha dengan parameter
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    /* Getter */
    // Mengambil nilai npwp
    public String getNpwp() {
        return npwp;
    }

    // Mengambil nilai counterPengusaha
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    /* Setter */
    // Mengeset npwp dengan string npwp
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    /* Method Override */
    // Menghitung masa kerja Pengusaha: (now - tgl_mulai_kerja) + B
    @Override
    public int hitungMasaKerja() {
        int tahun = Period.between(tgl_mulai_kerja, LocalDate.now()).getYears();
        return tahun + B;
    }

    // Menghitung pajak Pengusaha: 15% * pendapatan
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    // Mencetak seluruh atribut Pengusaha termasuk atribut dari Manusia
    @Override
    public void cetakInfo() {
        System.out.println("=== Data Pengusaha ===");
        System.out.println("NPWP             : " + npwp);
        super.cetakInfo();
        System.out.println("Counter Pengusaha: " + counterPengusaha);
    }
}