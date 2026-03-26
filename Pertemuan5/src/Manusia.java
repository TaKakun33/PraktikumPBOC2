/* File       : Manusia.java
 * Deskripsi  : Berisi atribut dan method dalam abstract class Manusia
 * NIM & Nama : Akmal Kafi Anan - 24060124120042
 * Tanggal    : 27 Maret 2026
 */

/******** Library ********/
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.util.Locale;

public abstract class Manusia implements Pajak {
    /******** Variable ********/
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    /******** Method *********/
    /* Konstruktor */
    // Membuat objek Manusia tanpa parameter
    public Manusia() {
        counterMns++;
    }

    // Membuat objek Manusia dengan parameter
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama           = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat         = alamat;
        this.pendapatan     = pendapatan;
        counterMns++;
    }

    /* Getter */
    // Mengambil nilai nama
    public String getNama() {
        return nama;
    }

    // Mengambil nilai tgl_mulai_kerja
    public LocalDate getTglMulaiKerja() {
        return tgl_mulai_kerja;
    }

    // Mengambil nilai alamat
    public String getAlamat() {
        return alamat;
    }

    // Mengambil nilai pendapatan
    public double getPendapatan() {
        return pendapatan;
    }

    // Mengambil nilai counterMns
    public static int getCounterMns() {
        return counterMns;
    }

    /* Setter */
    // Mengeset nama dengan string nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mengeset tgl_mulai_kerja dengan LocalDate tgl_mulai_kerja
    public void setTglMulaiKerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    // Mengeset alamat dengan string alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Mengeset pendapatan dengan double pendapatan
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    /* Method Lainnya */
    // Fungsi untuk mengubah LocalDate jadi format tanggal "<hari> <Bulan> <tahun>"
    protected String formatTanggal(LocalDate date) {
        String[] NAMA_BULAN = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        return date.getDayOfMonth() + " " + NAMA_BULAN[date.getMonthValue() - 1] + " " + date.getYear();
    }

    // Fungsi untuk mengubah angka ke format rupiah
    protected String formatRupiah(double amount) {
        DecimalFormatSymbols sym = new DecimalFormatSymbols(new Locale("id", "ID"));
        sym.setGroupingSeparator('.');
        sym.setDecimalSeparator(',');
        DecimalFormat df = new DecimalFormat("#,##0.00", sym);
        return "Rp " + df.format(amount);
    }

    // Menghitung masa kerja dalam tahun dari tgl_mulai_kerja sampai hari ini
    public abstract int hitungMasaKerja();

    // Mencetak seluruh atribut yang dimiliki objek (termasuk atribut turunan)
    public void cetakInfo() {
        System.out.println("Nama             : " + nama);
        System.out.println("Tgl Mulai Kerja  : " + formatTanggal(tgl_mulai_kerja));
        System.out.println("Alamat           : " + alamat);
        System.out.println("Pendapatan       : " + formatRupiah(pendapatan));
        System.out.println("Masa Kerja       : " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak            : " + formatRupiah(hitungPajak()));
    }
}