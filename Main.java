public class Main {
    public static void main(String[] args) {

        BoNho boNho1 = new BoNho("SSD", 512);


        MayTinh mayTinh1 = new MayTinh("Laptop Dell XPS", boNho1);


        mayTinh1.hienThiThongTin();
    }
}
