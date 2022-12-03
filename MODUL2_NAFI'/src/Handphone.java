public class Handphone extends Perangkat {
    protected boolean fingerprint;

    public Handphone(int ram, boolean fingerprint, String drive, float processor) {
        super(drive, ram, processor);
        this.fingerprint=fingerprint;
    }

    public void informasi() {
        System.out.println("Handphone ini memiliki drive tipe" + " " + drive + " " + "dengan ram sebesar " + ram
                + " " + "GB dan processor secepat" + " " + processor + " " + "Ghz. " + "Selain itu handphone ini "
                + (fingerprint == false ? "Tidak memiliki " : "memiliki ") + "fingeprint"); 
    }

    public void telfon(int NoHP) {
        System.out.println("Handphone berhasil menyambungkan telfon ke No " + NoHP);
    }

    public void kirimSMS(int NoHP) {
        System.out.println("Handphone berhasil mengirim SMS ke No " + NoHP);
    }

    public void multiSMS(int NoHP, int NoHP1) {
        System.out.println("Handphone berhasil mengirim SMS ke No " + NoHP + " " + "dan " + NoHP1);
    }

}
