package IdGenerator;

public class IdGenerator{
    private int id;
    private static IdGenerator single_instance = null;

    private IdGenerator(){
        this.id = 0;
    }

    public static IdGenerator getInstance(){
        if(single_instance == null){
            single_instance = new IdGenerator();
        }
        return single_instance;
    }

    public int getId() {
        return id;
    }

    public String afficherEtiquette(){
        return "ID_" + id++;
    }
}