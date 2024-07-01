package uas_pbo1;

//class
public class Kost {
    //atribut dan enkapsulasi
    protected String namaPenghuni;
    protected String kodeKamar;
    protected String namaKost;

    //Constructor
    public Kost(String namaPenghuni, String kodeKamar, String namaKost) {
        this.namaPenghuni = namaPenghuni;
        this.kodeKamar = kodeKamar;
        this.namaKost = namaKost;
    }
    
    //mutator (setter)
    public void setNamaPenghuni(String namaPenghuni) {
        this.namaPenghuni = namaPenghuni;
    }

    public void setKodeKamar(String kodeKamar) {
        this.kodeKamar = kodeKamar;
    }
    
    public void setNamaKost(String namaKost) {
        this.namaKost = namaKost;
    }
    
    //accessor (getter)
    public String getNamaPenghuni() {
        return namaPenghuni;
    }

    public String getKodeKamar() {
        return kodeKamar;
    }
    
    public String getNamaKost() {
        return namaKost;
    }
    
    //method penambah
    public String infoKost() {
        return "Nama Penghuni: " + getNamaPenghuni() +
               "\nKode Kamar: " + getKodeKamar() +
               "\nNama Kost: " + getNamaKost();
    }
    
    //polymorphism (overloading)
    public String infoKost(String harga) {
        return infoKost() + "\nHarga: " + harga;
    }
}

