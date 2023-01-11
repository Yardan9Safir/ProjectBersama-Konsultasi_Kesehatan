package Views;

import All.ControllerAll;

public class DokterDanPasienCLI {

    public void cariData(int kode) {
        int i = 0;
        System.out.println("Antrian Pasien ke   : " + i);
        System.out.println("Nama Pasien         : " + ControllerAll.PasienCtrl.dataPasien().get(kode).getNama());
        System.out.println("Kategori Pasien     : " + ControllerAll.PasienCtrl.dataPasien().get(kode).getKategoriPasien());
        System.out.println("Nama Dokter         : " + ControllerAll.PasienCtrl.dataPasien().get(kode).getNama());
        System.out.println("Spesialisasi Dokter : " + ControllerAll.PasienCtrl.dataPasien().get(kode).getKategoriPasien());
        i++;
    }

}
