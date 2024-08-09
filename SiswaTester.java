public class SiswaTester {
    public static void main(String[] args) {

        // object

        Siswa lia = new Siswa();
        Siswa andi = new Siswa();

        // object with contructor parameter

        Siswa via = new Siswa(890, "Via Vallen", 100.99);

        // lia variable

        lia.id = 12345;
        lia.nama = "Aprilia";
        lia.ipk = 96.67;

        // andi variable

        andi.id = 2049;
        andi.nama = "Andy";
        andi.ipk = -10.00;
        
        System.out.println(lia.nama);
        System.out.println(lia.id);
        System.out.println(lia.ipk);

        System.out.println(andi.nama);
        System.out.println(andi.id);
        System.out.println(andi.ipk);

        System.out.println(via.nama);
        System.out.println(via.id);
        System.out.println(via.ipk);        

    }
    
}
