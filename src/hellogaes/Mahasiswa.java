package hellogaes;

public class Mahasiswa {

    private final String name;
    private final String npm;
    private final String fakultas;
    private final String jurusan;

    public Mahasiswa(String name, String npm, String fakultas, String jurusan) {
        this.npm = npm;
        this.name = name;
        this.fakultas = fakultas;
        this.jurusan = jurusan;
    }

    public String getName() {
        return this.name;
    }

    public String getNPM() {
        return this.npm;
    }

    public String getFakultas() {
        return this.fakultas;
    }

    public String getJurusan() {
        return this.jurusan;
    }
}
