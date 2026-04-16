public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama,String nik,boolean menikah, boolean jenisKelamin,String nim, double ipk) {
        super(nama, nik, menikah, jenisKelamin);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNIM() {
        return this.nim;
    }

    public double getIPK() {
        return this.ipk;
    }

    public String getStatus() {
        String angkatan = this.nim.substring(0, 2);
        int prodi = Integer.parseInt(this.nim.substring(5, 6));
        String prodiString = "";
        switch (prodi) {
            case 2 -> {
                prodiString = "Teknik Informatika";
            }
            case 3 -> {
                prodiString = "Teknik Komputer";
            }

            case 4 -> {
                prodiString = "Sistem Informasi";
            }

            case 6 -> {
                prodiString = "Pendidikan Teknologi Informasi";
            }

            case 7 -> {
                prodiString = "Teknologi Informasi";
            }
        }

        return "20" + angkatan + " " + prodiString;
    }

    public double getBeasiswa() {
        if (this.ipk >= 3.0 && this.ipk < 3.5) {
            return 50;
        } else if (this.ipk >= 3.5 && this.ipk <= 4.0) {
            return 75;
        } else {
            return 0;
        }
    }

    @Override
    public void display() {
        System.out.println("Nama : " + this.getNama());
        String gender = (this.gender()) ? "Laki-Laki" : "Perempuan";
        System.out.println("Jenis Kelamin : " + gender);
        System.out.println("NIK : " + this.getNIK());
        System.out.println("NIM : " + this.nim);
        System.out.printf("IPK : %.2f\n", this.ipk);
        System.out.println("Status : " + this.getStatus());
    }
}
