import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji,String tahunMasuk, int jumlahAnak){
        super();
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.parse(tahunMasuk);
        this.jumlahAnak = jumlahAnak;
    }

    public void setGaji(double gaji){
        this.gaji = gaji;
    }

    public double getGaji(){
        double tunjangan = this.jumlahAnak * 20;

        return this.gaji + tunjangan + this.getBonus();
    }

    public void setTahunMasuk(String tahunMasuk){
        this.tahunMasuk = LocalDate.parse(tahunMasuk);
    }

    public int getTahunMasuk(){
        return tahunMasuk.getYear();
    }

    public void setJumlahAnak(int jumlahAnak){
        this.jumlahAnak = jumlahAnak;
    }

    public int getJumlahAnak(){
        return this.jumlahAnak;
    }

    public double getBonus(){
        LocalDate now = LocalDate.now();
        int tahunSekarang = now.getYear();
        int tahunMasuk = this.getTahunMasuk();
        int lamaKerja = tahunSekarang - tahunMasuk;
        
        if(lamaKerja < 5 && lamaKerja > 0){
            return this.gaji * 0.05;
        }else if(lamaKerja >= 5 && lamaKerja < 10){
            return this.gaji * 0.1;
        }else if(lamaKerja >= 10){
            return this.gaji * 0.15;
        }else {
            return 0;
        }
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Tahun Masuk : " + this.getTahunMasuk());
        System.out.println("Jumlah Anak" + this.jumlahAnak);
        System.out.println("Gaji : " + this.getGaji());
    }
}
