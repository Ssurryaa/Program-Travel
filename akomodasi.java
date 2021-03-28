package UTS;

public class akomodasi {
    String kendaraan;
    String tujuan;
    int biaya;

    public akomodasi (String kendaraan1, String tujuan1, int biaya1){
        this.kendaraan = kendaraan1;
        this.tujuan = tujuan1;
        this.biaya = biaya1;
    }
    void tampilakomodasi(){
        System.out.println("Pilihan Kendaraan  :"+kendaraan);
        System.out.println("Lokasi tujuan      :"+tujuan);
        System.out.println("Biaya Kendaraan    :"+biaya);

    }
}
