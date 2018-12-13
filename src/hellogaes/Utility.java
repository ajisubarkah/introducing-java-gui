package hellogaes;

import java.util.ArrayList;

public class Utility {

    public final String fakultas[] = {"- SELECT -", "FTIF", "FTI"};
    public final String jurusan[][] = {{"-"},
        {"Teknik Informatika", "Sistem Informasi", "Sistem Komputer"},
        {"Teknik Industri", "Diawurno", "Mas"}};
    public final ArrayList<Mahasiswa> mhs;

    public Utility() {
        this.mhs = new ArrayList<>();
    }

    public void addMahasiswa(String name, String npm, String fakultas, String jurusan) {
        mhs.add(new Mahasiswa(name, npm, fakultas, jurusan));
    }

    public void removeMahasiswa(int index) {
        mhs.remove(index);
    }

}
