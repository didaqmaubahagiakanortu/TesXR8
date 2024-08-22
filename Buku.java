import java.util.Scanner;

public class Buku {
    int id;
    String judul;
    String pengarang;
    int tahunTerbit;

    public Buku(int id, String judul, String pengarang, int tahunTerbit) {

        this.id = id;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan judul buku.");
        String judul = input.nextLine();

        System.out.println("Masukkan pengarang buku.");
        String pengarang = input.nextLine();

        System.out.println("Masukkan ID buku.");
        int id = input.nextInt();

        System.out.println("Masukkan tahun terbit.");
        int tahunTerbit = input.nextInt();

        Buku sakaDays = new Buku(2110, "Sakamoto Days", "Yuto Suzuki", 2020);
        Buku fazbearFrights = new Buku(1987, "Fazbear's Frights", "Scott Cawthon", 2019);
        Buku looksmaxing = new Buku(6969, "Tutorial Looksmaxxing: 2024 Edition", "Kai Cenat", 2024);
        Buku harryPotter = new Buku(2606, "Harry Potter and the Philosopher's Stone", "J. K. Rowling", 1997);
        Buku detectiveConan = new Buku(1996, "Detective Conan: Case Closed", "Gosho Aoyama", 1994);

        System.out.println(sakaDays.judul);
        System.out.println(sakaDays.pengarang);
        System.out.println(sakaDays.tahunTerbit);
        System.out.println(sakaDays.id);
        System.out.println("");

        System.out.println(sakaDays.judul);
        System.out.println(sakaDays.pengarang);
        System.out.println(sakaDays.tahunTerbit);
        System.out.println(sakaDays.id);
        System.out.println("");

        System.out.println(fazbearFrights.judul);
        System.out.println(fazbearFrights.pengarang);
        System.out.println(fazbearFrights.tahunTerbit);
        System.out.println(fazbearFrights.id);
        System.out.println("");

        System.out.println(looksmaxing.judul);
        System.out.println(looksmaxing.pengarang);
        System.out.println(looksmaxing.tahunTerbit);
        System.out.println(looksmaxing.id);
        System.out.println("");

        System.out.println(harryPotter.judul);
        System.out.println(harryPotter.pengarang);
        System.out.println(harryPotter.tahunTerbit);
        System.out.println(harryPotter.id);
        System.out.println("");

        System.out.println(detectiveConan.judul);
        System.out.println(detectiveConan.pengarang);
        System.out.println(detectiveConan.tahunTerbit);
        System.out.println(detectiveConan.id);
        System.out.println("");

        System.out.println(judul);
        System.out.println(pengarang);
        System.out.println(tahunTerbit);
        System.out.println(id);
        System.out.println("");

    }
}
