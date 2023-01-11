package Models;

import Entity.DokterEntity;
import java.util.ArrayList;

public class DokterModel {

    private ArrayList<DokterEntity> DatabaseDokter = new ArrayList<>();

    public void tambah(DokterEntity dokterE) {
        DatabaseDokter.add(dokterE);
    }

    public ArrayList<DokterEntity> read() {
        return DatabaseDokter;
    }
}
