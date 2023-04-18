package HinhHoc;
public class HinhHoc {
    private final float Pi = 3.14f;
    private String ten;
    private float chuVi;
    private float dienTich;
    private float theTich;

    public float getPi() {
        return Pi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String Ten) {
        this.ten = Ten;
    }

    public float getChuVi() {
        return chuVi;
    }

    public void setChuVi(float chuVi) {
        this.chuVi = chuVi;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public float getTheTich() {
        return theTich;
    }

    public void setTheTich(float theTich) {
        this.theTich = theTich;
    }

    public HinhHoc() {}

    public void XuatTen() {
        System.out.println("===="+this.ten+"====");
    }

    public void InChuVi() {
        System.out.println("Chu vi = "+this.chuVi);
    }

    public void InDienTich() {
        System.out.println("Dien tich = "+this.dienTich);
    }

    public void InTheTich() {
        System.out.println("The tich = "+this.theTich);
    }

}
