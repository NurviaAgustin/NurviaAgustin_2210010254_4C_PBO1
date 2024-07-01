package uas_pbo1;

//inheritance
public class KostDetail extends Kost {
    //overriding
    public KostDetail(String namaPenghuni, String kodeKamar, String namaKost) {
        super(namaPenghuni, kodeKamar, namaKost);
    }
    
    public String getLantaiKamar() {
        if (kodeKamar.length() < 1) {
            return "Kode Kamar tidak valid";
        }
        String kodeLantai = kodeKamar.substring(0, 1);
        //seleksi if
        if (kodeLantai.equals("1")) {
            return "Lantai 1";
        } else if (kodeLantai.equals("2")) {
            return "Lantai 2";
        } else {
            return "Lantai tidak ada";
        }
    }
    
    public String getNomorKamar() {
        if (kodeKamar.length() < 3) {
            return "Kode Kamar tidak valid";
        }
        String kodeKamarSub = kodeKamar.substring(1, 3);
        //seleksi switch
        switch (kodeKamarSub) {
            case "01":
                return "01";
            case "02":
                return "02";
            case "03":
                return "03";
            case "04":
                return "04";
            default:
                return "Kamar Tidak Tersedia";
        }
    }
    
    public String getTipeKamar() {
        if (kodeKamar.length() < 4) {
            return "Kode Kamar tidak valid";
        }
        String kodeTipe = kodeKamar.substring(3);
        switch (kodeTipe) {
            case "F":
                return "Fasilitas";
            case "N":
                return "Non Fasilitas";
            default:
                return "Tipe Kamar Tidak Tersedia";
        }
    }
    
    //polymorphism (overriding)
    public String infoKost() {
        return super.infoKost() +
                "\nLantai Kamar: " + getLantaiKamar() +
                "\nNomor Kamar: " + getNomorKamar() +
                "\nTipe Kamar: " + getTipeKamar();
    }
}
  

