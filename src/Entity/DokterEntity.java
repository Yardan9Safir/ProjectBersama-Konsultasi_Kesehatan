package Entity;

public class DokterEntity extends KomponenKonsulEntity {

    private String spesialis;

    public DokterEntity(String nama,String spesialis) {
        super(nama);
        this.spesialis = spesialis;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }
}
