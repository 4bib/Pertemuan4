public class Main {
    public static void main(String[] args) {
        BangunRuang balok = new Balok(5.0, 3.0, 2.0);
        BangunRuang kubus = new Kubus(4.0);

        System.out.println("Volume Balok        : " + balok.hitungVolume());
        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());

        System.out.println("Volume Kubus        : " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());
    }
}