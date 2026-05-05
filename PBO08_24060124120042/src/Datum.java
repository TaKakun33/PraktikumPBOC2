public class Datum<T> {
    // Atribut isi bertipe generik T
    private T isi;

    // Konstruktor
    public Datum(T isi) {
        this.isi = isi;
    }

    // Untuk mengembalikan nilai isi
    public T getIsi() {
        return isi;
    }

    // Untuk mengubah isi menjadi isibaru
    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }
    
    public static void tampilkanAnabul(Anabul A){
        A.Gerak();
        A.Bersuara();

        if (A instanceof Kucing){
            ((Kucing) A ).printBobot();
        }
    }
}