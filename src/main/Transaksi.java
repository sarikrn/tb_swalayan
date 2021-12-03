package main;

public class Transaksi {
    private String ID_transaksi;
    private String ID_struk;
    private String ID_barang;
    private Integer jumlah_barang;
    private Float total_harga;

    public Transaksi(String ID_transaksi, String ID_struk, String ID_barang, Integer jumlah_barang, Float total_harga) {
        this.ID_transaksi = ID_transaksi;
        this.ID_barang = ID_barang;
        this.jumlah_barang = jumlah_barang;
        this.total_harga = total_harga;
    }

    public Transaksi create_transaksi(String[] metadata){
        String ID_transaksi = metadata[0];
        String ID_struk = metadata[1];
        String ID_barang = metadata[2];
        Integer jumlah_barang = Integer.parseInt(metadata[3]);
        Float total_harga = Float.parseFloat(metadata[4]);

        return new Transaksi(ID_transaksi, ID_struk, ID_barang, jumlah_barang, total_harga);
    }
}
