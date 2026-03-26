/* File       : Pegawai.java
 * Deskripsi  : Berisi artibut dan method dalam class Pegawai
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 12 Maret 2026 
 */

/******** Libary ********/
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;

public class Pegawai {
    /******** Variable ********/
    private String NIP;
    private String Nama;
    private LocalDate TanggalLahir;
    private LocalDate TMT;
    private double GajiPokok;

    /******** Method *********/

    /* Konstruktor */
    // Membuat objek Pegawai tanpa parameter
    public Pegawai(){

    }

    // Membuat objek Pegawai dengan parameter
    public Pegawai(String NIP,String Nama,LocalDate TanggalLahir,LocalDate TMT,double Gaji){
        this.NIP = NIP;
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.TMT = TMT;
        this.GajiPokok = Gaji;
    }
    
    /* Getter */
    // mengambil nilai NIP
    public String getNIP(){
        return NIP;
    }
    
    // mengambil nilai Nama
    public String getNama(){
        return Nama;
    }
    
    // mengambil nilai tgllahir
    public LocalDate getTanggalLahir(){
        return TanggalLahir;
    }
    
    // mengambil nilai TMT
    public LocalDate getTMT(){
        return TMT;
    }
    
    // mengambil nilai GajiPokok
    public double getGajiPokok(){
        return GajiPokok;
    }

    /* Setter */
    // Mengesset NIP Pegawai dengan string NIP 
    public void setNIP(String NIP){
        this.NIP = NIP;
    }
    
    // Mengesset Nama Pegawai dengan string Nama 
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    // Mengesset tgllahir Pegawai dengan LocalDate tgllahir 
    public void setTanggalLahir(LocalDate tglLahir){
        this.TanggalLahir = tglLahir;
    }

    // Mengesset TMT Pegawai dengan LocalDate TMT 
    public void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }

    // Mengesset GajiPokok Pegawai dengan real GajiPokok 
    public void setGajiPokok(double GajiPokok){
        this.GajiPokok = GajiPokok;
    }

    /* Method Lainnya */
    // Fungsi untuk menghubah LocalDate jadi Format tanggal ke "<hari> <Bulan> <tahun>"
    protected String formatTanggal(LocalDate date) {
        String[] NAMA_BULAN = {
        "Januari", "Februari", "Maret", "April", "Mei", "Juni",
        "Juli", "Agustus", "September", "Oktober", "November", "Desember"
    };
        return date.getDayOfMonth() + " " + NAMA_BULAN[date.getMonthValue() - 1] + " " + date.getYear();
    }
 
    // Fungsi untuk mengambil masa kerja dari TMT sampai hari ini 
    protected int[] getMasaKerja() {
        Period p = Period.between(TMT, LocalDate.now());
        return new int[]{p.getYears(), p.getMonths()};
    }

    // Fungsi untuk menghubah angka ke rupiah
    protected String formatRupiah(double amount) {
        DecimalFormatSymbols sym = new DecimalFormatSymbols(new Locale("id", "ID"));
        sym.setGroupingSeparator('.');
        sym.setDecimalSeparator(',');
        DecimalFormat df = new DecimalFormat("#,##0.00", sym);
        return "Rp " + df.format(amount);
    }

    // print nilai artibut dari class BangunDatar
    public void printInfo() {
        int[] masaKerja = getMasaKerja();
        System.out.println("NIP           : " + NIP);
        System.out.println("Nama          : " + Nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(TanggalLahir));
        System.out.println("TMT           : " + formatTanggal(TMT));
        System.out.println("Masa Kerja    : " + masaKerja[0] + " tahun " + masaKerja[1] + " bulan");
        System.out.println("Gaji Pokok    : " + formatRupiah(GajiPokok));
    }
}