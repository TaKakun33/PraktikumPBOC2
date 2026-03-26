/* File       : DosenTamu.java
 * Deskripsi  : Berisi artibut dan method dalam class DosenTamu
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 12 Maret 2026 
 */

/******** Libary ********/
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DosenTamu extends Dosen{

    /******** Variable ********/
    private String NIDK;
    private LocalDate TanggalBerakhirKontrak;
    static private int BUP = 70; //BUP default dosen tamu (tidak dipakai utama, diganti kontrak)

    /******** Method *********/

    /* Konstruktor */
    // Membuat objek DosenTamu tanpa parameter
    public DosenTamu(){

    }

    // Membuat objek DosenTamu dengan parameter
    public DosenTamu(String NIDK,String NIP,String Nama,LocalDate tanggalLahir,LocalDate TMT,double GajiPokok,String Fakultas,LocalDate TanggalBerakhirKontrak){
        super(NIP,Nama,tanggalLahir,TMT,GajiPokok,Fakultas);
        this.NIDK = NIDK;
        this.TanggalBerakhirKontrak = TanggalBerakhirKontrak;
    }

    /* Getter */
    // mengambil nilai NIDK   
    public String getNIDK(){
        return NIDK;
    }

    // mengambil nilai BUP   
    public int getBUP(){
        return BUP;
    }
    
    /* Setter */
    // Mengesset NIDK DosenTamu dengan string NIDK  
    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }
    
    // BUP gk perlu set soalnya static
    
    /* Method Lainnya */
    //Menghitung sisa masa kontrak dari sekarang hingga tanggal berakhir kontrak (dalam bulan)
    public long getSisaKontrakBulan(){
        return ChronoUnit.MONTHS.between(LocalDate.now(), TanggalBerakhirKontrak);
    }

    //Menghitung tunjangan
    public double getTunjangan(){
        return 0.025 * getGajiPokok();
    }

    // print nilai artibut dari class DosenTamu
    @Override
    public void printInfo(){
        long sisaKontrak = getSisaKontrakBulan();
        double tunjangan = getTunjangan();

        System.out.println("NIP               : " + getNIP());
        System.out.println("NIDK              : " + NIDK);
        System.out.println("Nama              : " + getNama());
        System.out.println("Tanggal Lahir     : " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT               : " + formatTanggal(getTMT()));
        System.out.println("Jabatan           : Dosen Tamu");
        System.out.println("Fakultas          : " + getFakultas());
        System.out.println("Masa Kerja        : " + getMasaKerja()[0] + " tahun " + getMasaKerja()[1] + " bulan");
        System.out.println("Berakhir Kontrak  : " + formatTanggal(TanggalBerakhirKontrak) + " (" + sisaKontrak + " bulan lagi)");
        System.out.println("Gaji Pokok        : " + formatRupiah(getGajiPokok()));
        System.out.println("Tunjangan         : 2,5% x " + formatRupiah(getGajiPokok()) + " = " + formatRupiah(tunjangan));
    }
}
