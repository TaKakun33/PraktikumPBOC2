/* File       : PNS.java
 * Deskripsi  : Berisi atribut dan method dalam class PNS (turunan Manusia)
 * NIM & Nama : Akmal Kafi Anan - 24060124120042
 * Tanggal    : 27 Maret 2026
 */

/******** Library ********/
import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia {
    /******** Variable ********/
    private String nip;
    private static int counterPNS = 0;

    // Konstanta A = digit ke-14 NIM (24060124120042) = 2
    private static final int A = 2;

    /******** Method *********/
    /* Konstruktor */
    // Membuat objek PNS tanpa parameter
    public PNS() {
        super();
        counterPNS++;
    }

    // Membuat objek PNS dengan parameter
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Membuat objek PNS tanpa alamat (nama, tgl, pendapatan, nip)
    public PNS(String nama, LocalDate tgl_mulai_kerja, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, "", pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    /* Getter */
    // Mengambil nilai nip
    public String getNip() {
        return nip;
    }

    // Mengambil nilai counterPNS
    public static int getCounterPNS() {
        return counterPNS;
    }

    /* Setter */
    // Mengeset nip dengan string nip
    public void setNip(String nip) {
        this.nip = nip;
    }

    /* Method Override */
    // Menghitung masa kerja PNS: (now - tgl_mulai_kerja) + A
    @Override
    public int hitungMasaKerja() {
        int tahun = Period.between(tgl_mulai_kerja, LocalDate.now()).getYears();
        return tahun + A;
    }

    // Menghitung pajak PNS: 10% * pendapatan
    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    // Mencetak seluruh atribut PNS termasuk atribut dari Manusia
    @Override
    public void cetakInfo() {
        System.out.println("=== Data PNS ===");
        System.out.println("NIP              : " + nip);
        super.cetakInfo();
        System.out.println("Counter PNS      : " + counterPNS);
    }
}
