/* File       : Petani.java
 * Deskripsi  : Berisi atribut dan method dalam class Petani (turunan Manusia)
 * NIM & Nama : Akmal Kafi Anan - 24060124120042
 * Tanggal    : 27 Maret 2026
 */

/******** Library ********/
import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia {
    /******** Variable ********/
    private String asal_kota;
    private static int counterPetani = 0;

    // Konstanta C = digit ke-12 NIM (24060124120042) = 0
    private static final int C = 0;

    /******** Method *********/
    /* Konstruktor */
    // Membuat objek Petani tanpa parameter
    public Petani() {
        super();
        counterPetani++;
    }

    // Membuat objek Petani dengan parameter
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    /* Getter */
    // Mengambil nilai asal_kota
    public String getAsalKota() {
        return asal_kota;
    }

    // Mengambil nilai counterPetani
    public static int getCounterPetani() {
        return counterPetani;
    }

    /* Setter */
    // Mengeset asal_kota dengan string asal_kota
    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    /* Method Override */
    // Menghitung masa kerja Petani: (now - tgl_mulai_kerja) + C
    @Override
    public int hitungMasaKerja() {
        int tahun = Period.between(tgl_mulai_kerja, LocalDate.now()).getYears();
        return tahun + C;
    }

    // Menghitung pajak Petani: 0 (bebas pajak)
    @Override
    public double hitungPajak() {
        return 0;
    }

    // Mencetak seluruh atribut Petani termasuk atribut dari Manusia
    @Override
    public void cetakInfo() {
        System.out.println("=== Data Petani ===");
        System.out.println("Asal Kota        : " + asal_kota);
        super.cetakInfo();
        System.out.println("Counter Petani   : " + counterPetani);
    }
}