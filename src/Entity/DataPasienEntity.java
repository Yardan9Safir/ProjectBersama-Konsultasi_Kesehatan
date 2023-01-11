package Entity;

public class DataPasienEntity {

    private String namaPasienS;
    private String kategoriPasienS;
    private String namaDokterS;
    private String SpesialisasiDokterS;

    public DataPasienEntity(String namaPasienS, String kategoriPasienS, String namaDokterS, String SpesialisasiDokterS) {
        this.namaPasienS = namaPasienS;
        this.kategoriPasienS = kategoriPasienS;
        this.namaDokterS = namaDokterS;
        this.SpesialisasiDokterS = SpesialisasiDokterS;
    }

    public String getNamaDokterS() {
        return namaDokterS;
    }

    public void setNamaDokterS(String namaDokterS) {
        this.namaDokterS = namaDokterS;
    }

    public String getSpesialisasiDokterS() {
        return SpesialisasiDokterS;
    }

    public void setSpesialisasiDokterS(String SpesialisasiDokterS) {
        this.SpesialisasiDokterS = SpesialisasiDokterS;
    }

    public String getNamaPasienS() {
        return namaPasienS;
    }

    public void setNamaPasienS(String namaPasienS) {
        this.namaPasienS = namaPasienS;
    }

    public String getKategoriPasienS() {
        return kategoriPasienS;
    }

    public void setKategoriPasienS(String kategoriPasienS) {
        this.kategoriPasienS = kategoriPasienS;
    }

}
