/* File       : DosenTetap.java
 * Deskripsi  : Berisi artibut dan method dalam class DosenTetap
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 12 Maret 2026 
 */

/******** Libary ********/
import java.time.LocalDate;


public class DosenTetap extends Dosen {

    /******** Variable ********/
    private String NIDN;
    static private int BUP = 65; 

    /******** Method *********/

    /* Konstruktor */
    // Membuat objek DosenTetap tanpa parameter
    public DosenTetap(){
        
    }

    // Membuat objek DosenTetap dengan parameter
    public DosenTetap(String NIDN,String NIP,String Nama,LocalDate tanggalLahir,LocalDate TMT,double GajiPokok,String Fakultas){
        super(NIP,Nama,tanggalLahir,TMT,GajiPokok,Fakultas);
        this.NIDN = NIDN;
    }

    /* Getter */
    // mengambil nilai NIDN   
    public String getNIDN(){
        return NIDN;
    }

    // mengambil nilai BUP   
    public int getBUP(){
        return BUP;
    }

    /* Setter */
    // Mengesset NIDN DosenTetap dengan string NIDN  
    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }

    // BUP gk perlu set soalnya static

    /* Method Lainnya */
    // Menghitung tunjangan
    public double getTunjangan(){
        int[] masaKerja = getMasaKerja();
        return 0.02 * masaKerja[0] * getGajiPokok();
    }

    // Mendapatkan tanggal pensiun
    public LocalDate getTanggalPensiun() {
        LocalDate ulangTahunBUP = getTanggalLahir().plusYears(BUP);
        return ulangTahunBUP.withDayOfMonth(1).plusMonths(1);
    }

    // print nilai artibut dari class DosenTetap
    @Override
    public void printInfo(){
        int[] masaKerja = getMasaKerja();
        double tunjangan = getTunjangan();

        System.out.println("NIP               : " + getNIP());
        System.out.println("NIDN              : " + NIDN);
        System.out.println("Nama              : " + getNama());
        System.out.println("Tanggal Lahir     : " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT               : " + formatTanggal(getTMT()));
        System.out.println("Jabatan           : Dosen Tetap");
        System.out.println("Fakultas          : " + getFakultas());
        System.out.println("Masa Kerja        : " + masaKerja[0] + " tahun " + masaKerja[1] + " bulan");
        System.out.println("Tanggal Pensiun   : " + formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok        : " + formatRupiah(getGajiPokok()));
        System.out.println("Tunjangan         : 2% x " + masaKerja[0] + " x " + formatRupiah(getGajiPokok()) + " = " + formatRupiah(tunjangan));
    }

}
