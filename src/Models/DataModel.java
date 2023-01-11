/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entity.DataPasienEntity;
import java.util.ArrayList;

public class DataModel {

    public ArrayList<DataPasienEntity> DatabasePasien = new ArrayList<>();

    public void create(DataPasienEntity datapasien) {
        DatabasePasien.add(datapasien);
    }

    public void update(int index, DataPasienEntity datapasien) {
        DatabasePasien.set(index, datapasien);
    }

    public void delete(int index) {
        DatabasePasien.remove(index);
    }

    public ArrayList<DataPasienEntity> getdataPasien() {
        return DatabasePasien;
    }

}
