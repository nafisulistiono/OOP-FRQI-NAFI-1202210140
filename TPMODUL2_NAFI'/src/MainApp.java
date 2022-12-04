public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat = new Perangkat("Adata", 2, 1.80f);
        Handphone hp = new Handphone(8, false, "Adata", 2.2f);
        Laptop laptop = new Laptop("Seagate", 16, 3.2f, false);

        perangkat.informasi();

        System.out.println();

        hp.informasi();
        hp.telfon(62852112);
        hp.kirimSMS(62852112);
        hp.multiSMS(62852112, 629292211);

        System.out.println();

        laptop.informasi();
        laptop.bukaGame("Overwatch 2");
        laptop.kirimEmail("rezakecap@gmail.com");
        laptop.multiEmail("rezakecap@mail.com", "farhankebab@mail.com");
    }
}