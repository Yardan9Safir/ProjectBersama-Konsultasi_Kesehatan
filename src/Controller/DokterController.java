package Controller;

import All.ModelAll;
import Entity.DokterEntity;
import java.util.ArrayList;

public class DokterController {

    public ArrayList<DokterEntity> getDataDokter() {
        return ModelAll.DokterMDL.read();
    }
    
    public void tambah(DokterEntity dokterE){
        ModelAll.DokterMDL.tambah(dokterE);
    }

    public void DataDokter() {
        String namaDokter[] = {"DR.ZAFIER Sp", "DR.MICHELLE Sp", "DR.EBBIYU Sp", "DR..ZAAD Sp"};
        String spesialis[] = {"Spesialis Kulit", "Spesialis Jantung", "Spesialis Gigi", "Spesialis Mata"};
        for (int i = 0; i < namaDokter.length; i++) {
            ModelAll.DokterMDL.tambah(new DokterEntity(namaDokter[i], spesialis[i]));
        }
    }
}
