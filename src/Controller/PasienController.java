package Controller;

import All.ModelAll;
import Entity.PasienEntity;
import java.util.ArrayList;

public class PasienController {

    public void create(PasienEntity pasienE) {
        ModelAll.PasienMDL.tambah(pasienE);
    }

    public void update(int index, PasienEntity pasienE) {
        ModelAll.PasienMDL.ganti(index, pasienE);
    }

    public void delete(int index) {
        ModelAll.PasienMDL.hapus(index);
    }

    public ArrayList<PasienEntity> dataPasien() {
        return ModelAll.PasienMDL.read();
    }

}
