package jdbc.model;

/**
 *
 * @author qwty
 */
public class Mahasiswa {
    /******** Variable ********/
    private int id;
    private  String nama;

    /******** method ********/

    /* Konstruktor */
    // Membuat objek Mahasiswa tanpa parameter
    public Mahasiswa(){
    
    }

    // Membuat objek Mahasiswa dengan parameter
    public Mahasiswa(int id, String nama){
        this.id = id;
        this.nama = nama;
    }

    /* Getter */
    // Mengembalikan nilai id
    public int getId() {
        return id;
    }

    // Mengembalikan nilai nama
    public String getNama() {
        return nama;
    }
    
    /* Setter */
    // Mengesset nama dengan string nama 
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
    public String toString(){
        return "Mahasiswa(" + "id = "+ id + "nama = " + nama + ")";
    }
 
}
