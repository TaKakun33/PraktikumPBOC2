public class Anggora extends Kucing{

    /**** Method ****/
    // Konstruktor untuk memberikan nama pada Kucing
    public Anggora(String nama,double bobot) {
        super(nama, bobot); 
    }

    // Method Gerak pada Anggora 
    @Override
    public void Gerak() {
        System.out.println(getNama() + " lincah melompat.");
    }

    // Method Bersuara pada Anggora 
    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara: meong lembut.");
    }
}
