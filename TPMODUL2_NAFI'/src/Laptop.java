public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    public void informasi() {
        System.out.println("Laptopp ini memiliki drive tipe" + " " + drive + " " + "dengan ram sebesar " + ram
                + " " + "GB dan processor secepat" + " " + processor + " " + "Ghz. " + "Selain itu Laptop ini "
                + (webcam == false ? "Tidak memiliki " : "memiliki ") + "webcam");
    }

    public void bukaGame(String nama_game) {
        System.out.println("Laptop berhasil membuka game " + nama_game);
    }

    public void kirimEmail(String email1) {
        System.out.println("Laptop berhasil mengirim email ke " + email1);
    }

    public void multiEmail(String email1, String email2) {
        System.out.println("Laptop berhasil mengirim email ke " + email1 + " " + "dan ke " + email2);
    }
}
