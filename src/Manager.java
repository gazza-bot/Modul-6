public class Manager extends Manusia {
    private String departemen;

    public Manager(String nama, String nik,boolean menikah,boolean jenisKelamin,String depart){
        super(nama, nik, menikah, jenisKelamin);
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
        System.out.println("Nama : " + this.getNama());
        String gender = (this.gender()) ? "Laki-Laki" : "Perempuan";
        System.out.println("Jenis Kelamin : " + gender);
        System.out.println("NIK : " + this.getNIK());
        System.out.println("Departemen : " + this.departemen);
    }
}
