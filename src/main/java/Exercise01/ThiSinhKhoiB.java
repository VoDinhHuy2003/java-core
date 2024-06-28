package Exercise01;

public class ThiSinhKhoiB extends ThiSinh{

    public ThiSinhKhoiB(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String monThi() {
        return "Toán, Hóa, Sinh";
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiB{" +
                "soBaoDanh=" + soBaoDanh +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", mucUuTien=" + mucUuTien +
                '}';
    }
}
