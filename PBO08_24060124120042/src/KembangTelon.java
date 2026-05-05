public class KembangTelon extends Kucing{

    /**** Method ****/
    // Konstruktor untuk memberikan nama pada Kucing
    public KembangTelon(String nama,double bobot) {
        super(nama, bobot); 
    }

    // Method Gerak pada KembangTelon 
    @Override
    public void Gerak() {
        System.out.println(getNama() + " lincah melompat.");
    }

    // Method Bersuara pada KembangTelon 
    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara: meong lembut.");
    }
}
