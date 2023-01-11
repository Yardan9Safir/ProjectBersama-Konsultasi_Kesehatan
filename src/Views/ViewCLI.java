package Views;

import All.ControllerAll;
import Entity.DataPasienEntity;
//import Entity.PasienEntity;
import java.util.Scanner;

public class ViewCLI {

    Scanner inputCLI = new Scanner(System.in);
    DokterDanPasienCLI dokterDanPasien = new DokterDanPasienCLI();

    public static void main(String[] args) {
        ViewCLI vn = new ViewCLI();
//        vn.menuUtama();
        ControllerAll.DokterCtrl.DataDokter();
        vn.menuDataPasien();
    }

    public void menuDataPasien() {
        boolean y = true;
        try {
            while (y) {
                System.out.println("SELAMAT DATANG!!"
                        + "\n1. Daftar Untuk Konsultasi"
                        + "\n2. Ganti  Data Konsultasi"
                        + "\n3. Hapus  Data Konsultasi"
                        + "\n4. Cari   Data Konsultasi"
                        + "\n5. Cetak Semua Data Konsultasi"
                        + "\n6. Keluar");
                System.out.print("Masukkan Pilihan Anda : ");
                int pilihan = inputCLI.nextInt();
                switch (pilihan) {
                    case 1:
                        inputDataPasien();
                        break;
                    case 2:
                        gantiData();
                        break;
                    case 3:
                        hapusData();
                        break;
                    case 4:
                        cariData();
                        break;
                    case 5:
                        cetakDataPasien();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan tidak sesuai");
                        break;
                }
                System.out.print("Input lagi ? Y/N : ");
                String yn = inputCLI.next();
                if (yn.equalsIgnoreCase("n")) {
                    y = false;
                    System.exit(0);
                } else {
                    menuDataPasien();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void cetakDataPasien() {
        if (dataKosong()) {
            for (int i = 0; i < ControllerAll.DataCtrl.dataPasien().size(); i++) {
                System.out.println("---");
                System.out.println("Antrian Konsultasi Ke : " + i);
                System.out.println("Nama Pasien           : " + ControllerAll.DataCtrl.dataPasien().get(i).getNamaPasienS());
                System.out.println("Kategori Pasien       : Pasien " + ControllerAll.DataCtrl.dataPasien().get(i).getKategoriPasienS());
                System.out.println("Dokter Yang Menangai ");
                System.out.println("Nama Dokter           : " + ControllerAll.DataCtrl.dataPasien().get(i).getNamaDokterS());
                System.out.println("Spesialisasi Dokter   : " + ControllerAll.DataCtrl.dataPasien().get(i).getSpesialisasiDokterS());
                System.out.println("---");
            }
        }

    }

    public void inputDataPasien() {
        try {
            Scanner input = new Scanner(System.in);
            boolean cekCLI = true;
            while (cekCLI) {
                String kategori = "kosong", dokterSpesialis = "kosong", Spesialisasi = "kosong";
                int i;
                System.out.println("DAFTAR ANTRIAN!!");
                System.out.print("Masukkan Nama : ");
                String nama = input.next();
                System.out.println("Pilih Kategori \n1. Pasien BPJS \n2. Pasien Reguler");
                System.out.print("Masukkan Kategori Pasien : ");
                int kategoriPasien = input.nextInt();
                switch (kategoriPasien) {
                    case 1:
                        kategori = "BPJS";
                        break;
                    case 2:
                        kategori = "Reguler";
                        break;
                    default:
                        System.out.println("Maaf Pilihan Anda Tidak Ada.");
                        inputDataPasien();
                        break;
                }
                System.out.println("Pilih Dokter Anda \n1. DR.ZAFIER Sp (Spesialis Kulit)\n2. DR.MICHELLE Sp (Spesialis Jantung)\n3. DR.EBBIYU Sp (Spesialis Gigi)\n4. DR.ZAAD Sp (Spesialis Mata)");
                System.out.print("Masukkan Pilihan Dokter Anda : ");
                int pilihanDokter = input.nextInt();
                switch (pilihanDokter) {
                    case 1:
                        i = 0;
                        dokterSpesialis = ControllerAll.DokterCtrl.getDataDokter().get(i).getNama();
                        Spesialisasi = ControllerAll.DokterCtrl.getDataDokter().get(i).getSpesialis();
                        break;
                    case 2:
                        i = 1;
                        dokterSpesialis = ControllerAll.DokterCtrl.getDataDokter().get(i).getNama();
                        Spesialisasi = ControllerAll.DokterCtrl.getDataDokter().get(i).getSpesialis();
                        break;
                    case 3:
                        i = 2;
                        dokterSpesialis = ControllerAll.DokterCtrl.getDataDokter().get(i).getNama();
                        Spesialisasi = ControllerAll.DokterCtrl.getDataDokter().get(i).getSpesialis();
                        break;
                    case 4:
                        i = 3;
                        dokterSpesialis = ControllerAll.DokterCtrl.getDataDokter().get(i).getNama();
                        Spesialisasi = ControllerAll.DokterCtrl.getDataDokter().get(i).getSpesialis();
                        break;
                    case 5:
                        i = 4;
                        dokterSpesialis = ControllerAll.DokterCtrl.getDataDokter().get(i).getNama();
                        Spesialisasi = ControllerAll.DokterCtrl.getDataDokter().get(i).getSpesialis();
                        break;
                    default:
                        System.out.println("Maaf Pilihan Anda Tidak Ada.");
                        inputDataPasien();
                        break;
                }
//            ControllerAll.PasienCtrl.create(new PasienEntity(kategori, nama));
//            ControllerAll.DokterCtrl.tambah(new DokterEntity(nama, Spesialisasi));
                ControllerAll.DataCtrl.create(new DataPasienEntity(nama, kategori, dokterSpesialis, Spesialisasi));
                System.out.println("Data Berhasil Ditambahkan!!!");

                System.out.print("Tambah Lagi ? (y/n) : ");
                String x = input.next();
                if (x.equalsIgnoreCase("y")) {
                    cekCLI = true;
                } else {
                    menuDataPasien();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void gantiData() {
        try {
            if (dataKosong()) {
                Scanner input = new Scanner(System.in);
                boolean cekGanti = true;
                while (cekGanti) {
                    String kategori = "kosong", dokterSpesialis = "kosong", Spesialisasi = "kosong";
                    int i;
                    System.out.println("Update Data Antrian!!");
                    System.out.println("Masukkan Index : ");
                    int index = input.nextInt();
                    System.out.print("Masukkan Nama : ");
                    String nama = input.next();
                    System.out.println("Pilih Kategori \n1. Pasien BPJS \n2. Pasien Reguler");
                    System.out.print("Masukkan Kategori Pasien : ");
                    int kategoriPasien = input.nextInt();
                    switch (kategoriPasien) {
                        case 1:
                            kategori = "BPJS";
                            break;
                        case 2:
                            kategori = "Reguler";
                            break;
                        default:
                            System.out.println("Maaf Pilihan Anda Tidak Ada.");
                            inputDataPasien();
                            break;
                    }
                    System.out.println("Pilih Dokter Anda \n1. DR.ZAFIER Sp (Spesialis Kulit)\n2. DR.MICHELLE Sp (Spesialis Jantung)\n3. DR.EBBIYU Sp (Spesialis Gigi)\n4. DR.ZAAD Sp (Spesialis Mata)");
                    System.out.print("Masukkan Pilihan Dokter Anda : ");
                    int pilihanDokter = input.nextInt();
                    switch (pilihanDokter) {
                        case 1:
                            i = 0;
                            dokterSpesialis = ControllerAll.DokterCtrl.getDataDokter().get(i).getNama();
                            Spesialisasi = ControllerAll.DokterCtrl.getDataDokter().get(i).getSpesialis();
                            break;
                        case 2:
                            i = 1;
                            dokterSpesialis = ControllerAll.DokterCtrl.getDataDokter().get(i).getNama();
                            Spesialisasi = ControllerAll.DokterCtrl.getDataDokter().get(i).getSpesialis();
                            break;
                        case 3:
                            i = 2;
                            dokterSpesialis = ControllerAll.DokterCtrl.getDataDokter().get(i).getNama();
                            Spesialisasi = ControllerAll.DokterCtrl.getDataDokter().get(i).getSpesialis();
                            break;
                        case 4:
                            i = 3;
                            dokterSpesialis = ControllerAll.DokterCtrl.getDataDokter().get(i).getNama();
                            Spesialisasi = ControllerAll.DokterCtrl.getDataDokter().get(i).getSpesialis();
                            break;
                        case 5:
                            i = 4;
                            dokterSpesialis = ControllerAll.DokterCtrl.getDataDokter().get(i).getNama();
                            Spesialisasi = ControllerAll.DokterCtrl.getDataDokter().get(i).getSpesialis();
                            break;
                        default:
                            System.out.println("Maaf Pilihan Anda Tidak Ada.");
                            inputDataPasien();
                            break;
                    }
//            ControllerAll.PasienCtrl.create(new PasienEntity(kategori, nama));
//            ControllerAll.DokterCtrl.tambah(new DokterEntity(nama, Spesialisasi));
                    ControllerAll.DataCtrl.update(index, new DataPasienEntity(nama, kategori, dokterSpesialis, Spesialisasi));
                    System.out.println("Data Berhasil Ditambahkan!!!");

                    System.out.print("Tambah Lagi ? (y/n) : ");
                    String x = input.next();
                    if (x.equalsIgnoreCase("y")) {
                        cekGanti = true;
                    } else {
                        menuDataPasien();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void hapusData() {
        try {
            if (dataKosong()) {
                Scanner input = new Scanner(System.in);
                boolean tf = true;
                while (tf) {
                    System.out.println("Hapus Data Antrian");
                    System.out.print("Masukkan Index : ");
                    int index = input.nextInt();
                    ControllerAll.DataCtrl.delete(index);
                    System.out.print("Tambah Lagi ? (y/n) : ");
                    String x = input.next();
                    if (x.equalsIgnoreCase("y")) {
                        tf = true;
                    } else {
                        menuDataPasien();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void cariData() {
        try {
            if (dataKosong()) {
                Scanner input = new Scanner(System.in);
                boolean tf = true;
                while (tf) {
                    System.out.println("Cari Data Antrian");

                    System.out.print("Masukkan Nama : ");
                    String nama = input.next();
                    for (int i = 0; i < ControllerAll.DataCtrl.dataPasien().size();) {
                        if (ControllerAll.DataCtrl.getIdByNama(nama) == i) {
                            System.out.println("---");
                            System.out.println("Antrian Konsultasi Ke : " + i);
                            System.out.println("Nama Pasien           : " + ControllerAll.DataCtrl.dataPasien().get(i).getNamaPasienS());
                            System.out.println("Kategori Pasien       : Pasien " + ControllerAll.DataCtrl.dataPasien().get(i).getKategoriPasienS());
                            System.out.println("Dokter Yang Menangai ");
                            System.out.println("Nama Dokter           : " + ControllerAll.DataCtrl.dataPasien().get(i).getNamaDokterS());
                            System.out.println("Spesialisasi Dokter   : " + ControllerAll.DataCtrl.dataPasien().get(i).getSpesialisasiDokterS());
                            System.out.println("---");
                            break;
                        } else {
                            i++;
                        }
                    }

                    System.out.print("Tambah Lagi ? (y/n) : ");
                    String x = input.next();
                    if (x.equalsIgnoreCase("y")) {
                        tf = true;
                    } else {
                        menuDataPasien();
                    }

                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean dataKosong() {
        if (ControllerAll.DataCtrl.dataPasien().isEmpty() == true) {
            System.out.println("Data kosong");
            return false;
        } else {
            return true;
        }
    }

//    public void menuUtama() {
//        boolean pilihanLogin = true;
//        try {
//            int menuPilihan;
//            while (pilihanLogin) {
//                System.out.println("SELAMAT DATANG!!"
//                        + "\n1. Daftar Konsultasi"
//                        + "\n2. Ganti Data Konsultasi"
//                        + "\n3. Hapus Data Konsultasi"
//                        + "\n4. Cari Data Konsultasi"
//                        + "\n5. Keluar");
//                System.out.print("Input Pilihan : ");
//                menuPilihan = inputCLI.nextInt();
//                switch (menuPilihan) {
//                    case 1:
//                        menuCreate();
//                        break;
//                    case 2:
//                        menuUpdate();
//                        break;
//                    case 3:
//                        menuHapus();
//                        break;
//                    case 4:
//                        Cari();
//                        break;
//                    case 5:
//                        System.exit(0);
//                        break;
//                    default:
//                        System.out.println("Pilihan tidak sesuai");
//                        break;
//                }
//                System.out.print("Input lagi ? Y/N : ");
//                String yn = inputCLI.next();
//                if (yn.equalsIgnoreCase("y")) {
//                    pilihanLogin = true;
//                } else {
//                    menuUtama();
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//    public void menuCreate() {
//        Scanner input = new Scanner(System.in);
//        boolean pilihanLogin = true;
//        try {
//            while (pilihanLogin) {
//                ControllerAll.DokterCtrl.DataDokter();
//
//                System.out.println("\nDAFTAR KONSULTASI");
//
//                System.out.print("Masukkan Nama Pasien  : ");
//                String nama = inputCLI.next();
//
//                int biaya = 0;
//                System.out.println("1.BPJS \n2.Reguler");
//                System.out.print("Pilih Kategori Pasien: ");
//                int pilihanktgr = inputCLI.nextInt();
//                String pilKategori;
//
//                if (pilihanktgr == 1) {
//                    pilKategori = "BPJS";
//                    biaya += 150000;
//                } else {
//                    pilKategori = "Reguler";
//                    biaya += 200000;
//                }
//
//                System.out.println("Pilih Dokter");
//                System.out.println("1. DR.ZAFIER Sp   (Spesialis Kulit)   -> Kode : 0 ");
//                System.out.println("2. DR.MICHELLE Sp (Spesialis Jantung) -> Kode : 1 ");
//                System.out.println("3. DR.EBBIYU Sp   (Spesialis Gigi)    -> Kode : 2 ");
//                System.out.println("4. DR.ZAAD Sp     (Spesialis Mata)    -> Kode : 3 ");
//                System.out.print("Input Pilihan untuk di update: ");
//                int b = input.nextInt();
//                String namadokter, spesialis;
//                switch (b) {
//                    case 1:
//                        namadokter = "DR.ZAFIER Sp";
//                        spesialis = " Spesialis Jantung";
//                        ControllerAll.PasienCtrl.create(new PasienEntity(nama, pilKategori));
//                        System.out.println("Kode Pasien : 0"
//                                + " Data Berhasil di buat");
//                        break;
//
//                    case 2:
//                        namadokter = "DR.MICHELLE Sp";
//                        spesialis = "Spesialis Mata";
//                        ControllerAll.PasienCtrl.create(new PasienEntity(nama, pilKategori));
//                        System.out.println("Kode Pasien : 1"
//                                + " Data Berhasil di buat");
//                        break;
//
//                    case 3:
//                        namadokter = "DR.EBBIYU Sp";
//                        spesialis = "Spesialis Kulit";
//                        ControllerAll.PasienCtrl.create(new PasienEntity(nama, pilKategori));
//                        System.out.println("Kode Pasien : 2"
//                                + " Data Berhasil di buat");
//                        break;
//
//                    case 4:
//                        namadokter = "DR.ZAAD Sp";
//                        spesialis = "Spesialis Gigi";
//                        ControllerAll.PasienCtrl.create(new PasienEntity(nama, pilKategori));
//                        System.out.println("Kode Pasien : 3"
//                                + " Data Berhasil di buat");
//                        break;
//
//                    default:
//                        namadokter = "Tidak ada";
//                        spesialis = "tidak ada";
//                        ControllerAll.PasienCtrl.create(new PasienEntity(nama, pilKategori));
//                        System.out.println("DATA Gagal dibuat");
//                        break;
//                }
//
//                System.out.print("Input lagi ? Y/N : ");
//                String yn = inputCLI.next();
//                if (yn.equalsIgnoreCase("y")) {
//                    pilihanLogin = true;
//                } else {
//                    menuUtama();
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//
//    public void menuUpdate() {
//        try {
//            Scanner input = new Scanner(System.in);
//            boolean pilUpdate = true;
//            while (pilUpdate) {
//                System.out.print("Masukkan kode Pasien : ");
//                int indexPasien = input.nextInt();
//
//                System.out.print("Masukkan Nama Pasien  : ");
//                String nama = inputCLI.next();
//
//                System.out.println("1.BPJS \n2.Reguler");
//                System.out.print("Pilih Kategori Pasien: ");
//                int pilihanktgr = inputCLI.nextInt();
//                String pilKategori = "-";
//
//                switch (pilihanktgr) {
//                    case 1:
//                        pilKategori = "BPJS";
//                        break;
//                    case 2:
//                        pilKategori = "Reguler";
//                        break;
//                    default:
//                        System.out.println("-");
//                        break;
//                }
//
//                System.out.println("Pilih Dokter");
//                System.out.println("1. DR.ZAFIER Sp   (Spesialis Kulit)   -> Kode : 0 ");
//                System.out.println("2. DR.MICHELLE Sp (Spesialis Jantung) -> Kode : 1 ");
//                System.out.println("3. DR.EBBIYU Sp   (Spesialis Gigi)    -> Kode : 2 ");
//                System.out.println("4. DR.ZAAD Sp     (Spesialis Mata)    -> Kode : 3 ");
//                System.out.print("Input Pilihan : ");
//                int b = input.nextInt();
//                String namadokter, spesialis;
//                switch (b) {
//                    case 1:
//                        namadokter = "DR.ZAFIER Sp";
//                        spesialis = " Spesialis Jantung";
//                        ControllerAll.PasienCtrl.update(indexPasien, new PasienEntity(nama, pilKategori));
//                        System.out.println("Data Berhasil di update");
//                        break;
//
//                    case 2:
//                        namadokter = "DR.MICHELLE Sp";
//                        spesialis = "Spesialis Mata";
//                        ControllerAll.PasienCtrl.update(indexPasien, new PasienEntity(nama, pilKategori));
//                        System.out.println("Data Berhasil di update");
//                        break;
//
//                    case 3:
//                        namadokter = "DR.EBBIYU Sp";
//                        spesialis = "Spesialis Kulit";
//                        ControllerAll.PasienCtrl.update(indexPasien, new PasienEntity(nama, pilKategori));
//                        System.out.println("Data Berhasil di update");
//                        break;
//
//                    case 4:
//                        namadokter = "DR.ZAAD Sp";
//                        spesialis = "Spesialis Gigi";
//                        ControllerAll.PasienCtrl.update(indexPasien, new PasienEntity(nama, pilKategori));
//                        System.out.println("Data Berhasil di update");
//                        break;
//
//                    default:
//                        namadokter = "-";
//                        spesialis = "-";
//                        ControllerAll.PasienCtrl.update(indexPasien, new PasienEntity(nama, pilKategori));
//                        System.out.println("-");
//                        break;
//                }
//                System.out.print("Input lagi ? Y/N : ");
//                String yn = inputCLI.next();
//                if (yn.equalsIgnoreCase("y")) {
//                    pilUpdate = true;
//                } else {
//                    menuUtama();
//                }
//
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//
//    public void menuHapus() {
//        try {
//            Scanner input = new Scanner(System.in);
//            boolean pildelete = true;
//            while (pildelete) {
//                System.out.println("MENU DELETE");
//                System.out.print("Masukkan Kode Pasien : ");
//                int i = input.nextInt();
//                ControllerAll.PasienCtrl.delete(i);
//
//                System.out.print("Input lagi ? Y/N : ");
//                String yn = inputCLI.next();
//                if (yn.equalsIgnoreCase("y")) {
//                    pildelete = true;
//                } else {
//                    menuUtama();
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//
//    public void Cari() {
//        try {
//            Scanner input = new Scanner(System.in);
//            boolean pildelete = true;
//            while (pildelete) {
//                System.out.println("DATA");
//                System.out.print("Masukkan Kode Pasien : ");
//                int kodeP = input.nextInt();
//                dokterDanPasien.cariData(kodeP);
//
//                System.out.print("Input lagi ? Y/N : ");
//                String yn = inputCLI.next();
//                if (yn.equalsIgnoreCase("y")) {
//                    pildelete = true;
//                } else {
//                    menuUtama();
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
}
