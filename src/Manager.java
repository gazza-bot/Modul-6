public class Manager extends Pekerja {
    private String departemen;

    public Manager(String nama, String nik,boolean menikah,boolean jenisKelamin,double gaji,String tahunMasuk,int jumlahAnak,String depart){
        super(nama, nik, menikah, jenisKelamin,gaji,tahunMasuk,jumlahAnak);
        this.departemen = depart;
    }

    public void setDepartemen(String depart){
        this.departemen = depart;
    }

    public String getDepartemen(){
        return this.departemen;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Departemen : " + this.departemen);
    }
}
