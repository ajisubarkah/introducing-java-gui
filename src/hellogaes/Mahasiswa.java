package hellogaes;

public class Mahasiswa {
    private final String Name;
    private final String NPM;
    
    public Mahasiswa(String Name, String NPM){
        this.NPM = NPM;
        this.Name = Name;
    }
    
    public String getName(){
        return this.Name;
    }
    
    public String getNPM(){
        return this.NPM;
    }
    
}
