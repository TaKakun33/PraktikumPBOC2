/* File       : Dosen.java
 * Deskripsi  : Berisi artibut dan method dalam class Dosen
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 12 Maret 2026 
 */

/******** Libary ********/
import java.time.LocalDate;

public abstract class Dosen extends Pegawai{

    /******** Variable ********/
    private String Fakultas;

    /******** Method *********/

    /* Konstruktor */
    // Membuat objek Dosen tanpa parameter
    public Dosen(){
        
    }
    
    // Membuat objek Dosen dengan parameter
    public Dosen(String NIP,String Nama,LocalDate tanggalLahir,LocalDate TMT,double GajiPokok,String Fakultas){
        super(NIP,Nama,tanggalLahir,TMT,GajiPokok);
        this.Fakultas = Fakultas;
    }

    /* Getter */
    // Mengambil nilai Fakultas   
    public String getFakultas(){
        return Fakultas;
    }
    
    /* Setter */
    // Mengesset Fakultas Dosen dengan string Fakultas 
    public void setFakultas(String Fakultas){
        this.Fakultas = Fakultas;
    }
}