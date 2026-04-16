public class Manusia {
    private String nama;
    private String NIK;
    private boolean menikah;
    private boolean jenisKelamin;
    private double pendapatan;

    public Manusia(String nama, String nik, boolean menikah, boolean jenisKelamin){
        this.nama = nama;
        this.NIK = nik;
        this.menikah = menikah;
        this.jenisKelamin = jenisKelamin;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return this.nama;
    }

    public void setNIK(String NIK){
        this.NIK = NIK;
    }

    public String getNIK(){
        return this.NIK;
    }

    public void setMenikah(boolean menikah){
        this.menikah = menikah;
    }

    public boolean isMarried(){
        return this.menikah;
    }

    public void setGender(boolean gender){
        this.jenisKelamin = gender;
    }

    public boolean gender(){
        return this.jenisKelamin;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    public double getPendapatan(){
        return this.pendapatan + this.getTunjangan();
    }

    public double getTunjangan(){
        if(menikah && jenisKelamin){
            return 25;
        } else if(menikah && !jenisKelamin){
            return 20;
        } else {
            return 15;
        }
    }

    public void display(){
        System.out.println("Nama : " + this.nama);
        String gender = (jenisKelamin) ? "Laki-Laki" : "Perempuan";
        System.out.println("Jenis Kelamin : " + gender);
        System.out.println("NIK : " + this.NIK);
        System.out.println("Pendapatan: " + this.getPendapatan());
    }

}