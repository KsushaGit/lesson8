public class Supergirl extends Girl {

    Boolean superPower;

    public Supergirl(String name, int age, Boolean superPower) {// geneate constructor
        super(name, age);
        this.superPower = superPower;


    }


    @Override
    public String toString() { //toString и concate вызываем girl констурктор + конкатенат
        return "Supergirl{" +
                "superPower=" + superPower +
                "} " + super.toString();
    }
}

