/* File       : Dosen.java
 * Deskripsi  : Berisi artibut dan method dalam class Dosen
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 5 Maret 2026 
 */

public class Dosen {
    /******** Variable ********/
    private String nip;
    private  String nama;
    private String prodi;

    /******** method ********/

    /* Konstruktor */
    // Membuat objek Dosen tanpa parameter
    public Dosen(){
        this("", "", "");
    }

    // Membuat objek Dosen dengan parameter
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    /* Getter */
    // Mengembalikan nilai nip dosen
    public String getNip(){
        return this.nip;
    }

    // Mengembalikan nilai nama dosen
    public String getNama(){
        return this.nama;
    }

    // Mengembalikan nilai prodi dosen
    public String getProdi(){
        return this.prodi;
    }

    /* Setter */
    // Mengesset nip dosen dengan string nip 
    public void setNip(String nip){
        this.nip = nip;
    }

    // Mengesset nama dosen dengan string nama 
    public void setNama(String nama){
        this.nama = nama;
    }

    // Mengesset prodi dosen dengan string prodi 
    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    /* Method tambahan */
    // print data Dosen
    public void printDosen(){
        System.err.println("NIP   : " + this.getNip());
        System.err.println("Nama  : " + this.getNama());
        System.err.println("Prodi : " + this.getProdi());
    }  
}
