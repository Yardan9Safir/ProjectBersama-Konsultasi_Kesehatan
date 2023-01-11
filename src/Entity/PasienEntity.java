package Entity;

public class PasienEntity extends KomponenKonsulEntity {

    private String kategoriPasien;

    public PasienEntity(String kategoriPasien, String nama) {
        super(nama);
        this.kategoriPasien = kategoriPasien;
    }

    public String getKategoriPasien() {
        return kategoriPasien;
    }

    public void setKategoriPasien(String kategoriPasien) {
        this.kategoriPasien = kategoriPasien;
    }

}
