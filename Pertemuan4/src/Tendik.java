/* File       : Tendik.java
 * Deskripsi  : Berisi artibut dan method dalam class Tendik
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 12 Maret 2026 
 */

/******** Libary ********/
import java.time.LocalDate;


public class Tendik extends Pegawai {

    /******** Variable ********/
    private String Bidang;
    static private int BUP = 55;

    /******** Method* ********/

    /* Konstruktor */
    // Membuat objek Tendik tanpa parameter
    public Tendik(){

    }
    // Membuat objek Tendik dengan parameter
    public Tendik(String NIP,String Nama,LocalDate tanggalLahir,LocalDate TMT,double GajiPokok,String Bidang){
        super(NIP,Nama,tanggalLahir,TMT,GajiPokok);
        this.Bidang = Bidang;
    }

    /* Getter */
    // mengambil nilai Bidang   
    public String getBidang(){
        return Bidang;
    }

    // mengambil nilai BUP   
    public int getBUP(){
        return BUP;
    }

    /* Setter */
    // Mengesset Bidang Tendik dengan string Bidang  
    public void setBidang(String Bidang){
        this.Bidang = Bidang;
    }

    /* Method Lainnya */
    // Menghitung tunjangan
    public double getTunjangan(){
        int[] masaKerja = getMasaKerja();
        return 0.01 * masaKerja[0] * getGajiPokok();
    }

    // Mendapatkan tanggal pensiun
    public LocalDate getTanggalPensiun() {
        LocalDate ulangTahunBUP = getTanggalLahir().plusYears(BUP);
        return ulangTahunBUP.withDayOfMonth(1).plusMonths(1);
    }

    // print nilai artibut dari class Tendik
    @Override
    public void printInfo(){
        int[] masaKerja = getMasaKerja();
        double tunjangan = getTunjangan();

        System.out.println("NIP               : " + getNIP());
        System.out.println("Nama              : " + getNama());
        System.out.println("Tanggal Lahir     : " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT               : " + formatTanggal(getTMT()));
        System.out.println("Jabatan           : Tenaga Kependidikan");
        System.out.println("Bidang            : " + Bidang);
        System.out.println("Masa Kerja        : " + masaKerja[0] + " tahun " + masaKerja[1] + " bulan");
        System.out.println("Tanggal Pensiun   : " + formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok        : " + formatRupiah(getGajiPokok()));
        System.out.println("Tunjangan         : 1% x " + masaKerja[0] + " x " + formatRupiah(getGajiPokok()) + " = " + formatRupiah(tunjangan));
    }

}