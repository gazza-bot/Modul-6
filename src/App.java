public class App {
    public static void main(String[] args) throws Exception {
        // Class Manusia
        // obj: Laki-Laki Telah Menikah
        Manusia human = new Manusia("Ardi", "35017092108", true, true);
        human.setPendapatan(100);
        human.display();
        // obj: Perempuan telah Menikah
        Manusia human2 = new Manusia("Susan", "208140471", true, false);
        human2.setPendapatan(100);
        human2.display();
        //obj: Belum menikah
        Manusia[] arrBelumNikah = {new Manusia("James", "219849", false, true),
            new Manusia("Leya", "812479821", false, false)
        };
        arrBelumNikah[0].setPendapatan(50);
        arrBelumNikah[1].setPendapatan(100);
        for(Manusia i : arrBelumNikah){
            i.display();
        }
        System.out.println("\n\n");
        // Class MahasiswaFILKOM
        // obj: ipk < 3
        MahasiswaFILKOM adil1 = new MahasiswaFILKOM("Adil", "21271736", false, true, "255150701111014", 2.70);
        adil1.display();
        //obj: ipk 3 - 3.5
        MahasiswaFILKOM adil2 = new MahasiswaFILKOM("Adil", "21271736", false, true, "255150701111014", 3.40);
        adil2.display();
        // obj: ipk 3.5 - 4
        MahasiswaFILKOM adil3 = new MahasiswaFILKOM("Adil", "21271736", false, true, "255150701111014", 3.89);
        adil3.display();
        
        System.out.println("\n\n");
        // CLASS PEKERJA
        // obj: Lama Kerja 2 Tahun, anak 2
        // obj: Lama Kerja 9 Tahun
        // obj: Lama Kerja 20 Tahun, anak 10
        Pekerja[] arrPekerja = {
            new Pekerja("Supri", "181946194621", true, true, 100, "2023-03-15",2),
            new Pekerja("Handoyo", "1221848742", false, true, 100, "2017-04-15",0),
            new Pekerja("Hari", "21583512873", true, true, 100, "2006-04-15", 10)
        };

        for(Pekerja i : arrPekerja){
            i.display();
            System.out.println("");
        }

        //Class Manager
        // obj: 15 Tahun gaji 7500

        System.out.println("\n\n");
        Manager manager = new Manager("Maskulin", "192474219", true, true, 7500, "2011-04-15", 0, "Technician");
        manager.display();
    }
}
