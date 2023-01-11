package Controller;

import All.ModelAll;
import Entity.DataPasienEntity;
import java.util.ArrayList;

public class DataController {

    public void create(DataPasienEntity datapasien) {
        ModelAll.DataPasienModel.create(datapasien);
    }

    public void update(int index, DataPasienEntity datapasien) {
        ModelAll.DataPasienModel.update(index, datapasien);
    }

    public void delete(int index) {
        ModelAll.DataPasienModel.delete(index);
    }

    public ArrayList<DataPasienEntity> dataPasien() {
        return ModelAll.DataPasienModel.getdataPasien();
    }
    
    public int getIdByNama(String nama){
        int j = 0;
        for(int i  = 0; i < ModelAll.DataPasienModel.DatabasePasien.size(); i++){
            if(ModelAll.DataPasienModel.DatabasePasien.get(i).getNamaPasienS().equals(nama)){
                break;
            }else{
                j++;
            }
        }
        return j;
    }

}
