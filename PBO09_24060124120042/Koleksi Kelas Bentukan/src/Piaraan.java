import java.util.LinkedList;

public class Piaraan {

    private int nbelm;
    private final LinkedList<Anabul> Lanabul;

    public Piaraan(){
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public void setNbelm(int nbelm) {
        this.nbelm = nbelm;
    }

    public void enqueueAnabul(Anabul anabul){
        Lanabul.add(anabul);
        nbelm++;
    }

    public boolean isMember(Anabul anabul){
        return Lanabul.contains(anabul);
    }

    public Anabul getAnabul(){
        return Lanabul.peekFirst();
    }

    public Anabul dequeueAnabul(){
        Anabul A = Lanabul.pollFirst();
        return A;
    }

    public void shawAnabul(){
        for (Anabul i : Lanabul) {
            System.out.println(i.getNama());
        }
    }
}
