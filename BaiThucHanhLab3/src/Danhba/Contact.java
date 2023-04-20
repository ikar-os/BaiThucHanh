package Danhba;

public class Contact {
    private String Tel;
    private String Name;

    public String getSdt() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Contact(){

    }

    public Contact(String Name, String Tel) {
        this.Name = Name;
        this.Tel = Tel;
    }

    public void InThongTin() {
        System.out.println("Ho Ten: "+this.Name +"\tSdt: " +this.Tel);
    }

    
}
