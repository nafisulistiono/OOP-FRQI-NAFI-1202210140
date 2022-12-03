public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat = new Perangkat("Adata", 2, 1.80f);
        perangkat.informasi();

        System.out.println();

        Handphone hp = new Handphone(8, false, "Adata", 2.2f);
        hp.informasi();
        hp.telfon(8215275);
        hp.kirimSMS(230903);
        hp.multiSMS(12345, 56789);

        System.out.println();

        Laptop laptop = new Laptop("Seagate", 16, 3.2f, false);
        laptop.informasi();
        laptop.bukaGame("valorant");
        laptop.kirimEmail("iniemail@gmail.com");
        laptop.multiEmail("iniemail@mail.com", "ituemail@mail.com");
    }
}