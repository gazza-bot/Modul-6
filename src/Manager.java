public class Manager extends Manusia {
    private String departemen;

    public Manager(String depart){
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
