public class Siswa {
    int id;
    String nama;
    double ipk;

    // constructor

    public Siswa() {
        id = 0;
        nama = "Empty";
        ipk = 0;
    }

    // contructor parameter

    public Siswa(int id, String nama, double ipk) {
        this.id = id;
        this.nama = nama;
        this.ipk = ipk;
    }
}
