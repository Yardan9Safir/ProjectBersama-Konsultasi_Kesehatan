package Models;

import Abstraction.PasienInterface;
import Entity.PasienEntity;
import java.util.ArrayList;
import java.util.Collection;

public class PasienModel implements PasienInterface {

    private ArrayList<PasienEntity> DatabasePasien;

    public PasienModel() {
        DatabasePasien = new ArrayList<>();
    }

    @Override
    public void tambah(PasienEntity pasienE) {
        DatabasePasien.addAll((Collection<? extends PasienEntity>) pasienE);
    }

    @Override
    public void ganti(int index, PasienEntity pasienE) {
        DatabasePasien.set(index, pasienE);
    }

    @Override
    public void hapus(int index) {
        DatabasePasien.remove(index);
    }

    public ArrayList<PasienEntity> read() {
        return DatabasePasien;
    }
}
