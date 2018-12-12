package hellogaes;

import java.util.ArrayList;

public class Utility {
    public final ArrayList<Mahasiswa> mhs;;

    public Utility() {
        this.mhs = new ArrayList<>();
    }
    
    public void addMahasiswa(String name, String npm){
        mhs.add(new Mahasiswa(name, npm));
    }
    
    public void removeMahasiswa(int index){
        mhs.remove(index);
    }
    
    
}
