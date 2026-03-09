import java.util.ArrayList;

/* File       : Mahasiswa.java
 * Deskripsi  : Berisi artibut dan method dalam class Mahasiswa
 * NIM & Nama : Akmal KAfi Anan - 24060124120042
 * Tanggal    : 5 Maret 2026  
 */

public class Mahasiswa {
    /******** Variable ********/
    private String nim;
    private  String nama;
    private String prodi;
    ArrayList<MataKuliah> lisMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /******** method ********/

    /* Konstruktor */
    // Membuat objek Mahasiswa tanpa parameter
    public Mahasiswa(){
        this.lisMatKul = new ArrayList<>();
    }

    // Membuat objek Mahasiswa dengan parameter
    public Mahasiswa(String nim, String nama, String prodi){
        this.lisMatKul = new ArrayList<>();
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    /* Getter */
    // Mengembalikan nilai nim
    public String getNim() {
        return nim;
    }

    // Mengembalikan nilai nama
    public String getNama() {
        return nama;
    }

    // Mengembalikan nilai prodi
    public String getProdi() {
        return prodi;
    }

    // Mengembalikan nilai dosenWali
    public Dosen getDosenWali() {
        return dosenWali;
    }

    // Mengembalikan nilai kendaraan
    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    /* Setter */
    // Mengesset nim dengan string nim 
    public void setNim(String nim) {
        this.nim = nim;
    }
    // Mengesset nama dengan string nama 
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mengesset prodi dengan string prodi 
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    // Mengesset dosenWali dengan dosenWali 
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    // Mengesset kendaraan dengan kendaraan 
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    /* Method lainnya */
    // Menambahkan sebuah mata kuliah ke atribut listMatKul.
    public void addMatKul(MataKuliah newMatKul){
        if (this.lisMatKul.size() <= 50){
            lisMatKul.add(newMatKul);
        }
    }

    // Mendapatkan jumlah SKS mata kuliah yang diambil mahasiswa.
    public int getJumlahSKS(){
        int i;
        int sumSks;

        sumSks = 0;
        for(i = 0; i < this.lisMatKul.size(); i++ ){
            sumSks = sumSks + this.lisMatKul.get(i).getSks();
        }
        return sumSks;
    }    

    // Mendapatkan jumlah mata kuliah yang diambil mahasiswa.
    public int getJumlahMatKul(){
        return this.lisMatKul.size();
    }

    // Menampilkan nim, nama, dan prodi mahasiswa.
    public void printMhs() {
        System.err.println("NIM   : " + this.getNim());
        System.err.println("Nama  : " + this.getNama());
        System.err.println("Prodi : " + this.getProdi());
    }

    // Menampilkan nim, nama, prodi, daftar mata kuliah yang diambil, data dosen wali, serta data kendaraan yang dimiliki mahasiswa.
    public void printDetailMhs() {
        System.err.println("NIM        : " + this.getNim());
        System.err.println("Nama       : " + this.getNama());
        System.err.println("Prodi      : " + this.getProdi());

        int i;
        System.out.println("\nMata kuliah yang diambil :");
        for( i = 0; i < this.lisMatKul.size(); i++){
            System.err.print(lisMatKul.get(i).getNama() + " ");
        }

        System.out.println("\n\nData dosen wali : ");
        this.dosenWali.printDosen();
    
        System.out.println("\nData Kendaraaan Mahasiswa : ");
        this.kendaraan.printKendaraan();
    }

}
