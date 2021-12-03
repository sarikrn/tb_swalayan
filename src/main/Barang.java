package main;

public class Barang {
    private String ID_barang;
    private String nama_barang;
    private Integer stok;
    private Float harga_satuan;

    public Barang() {
    }

    public Barang(String ID_barang, String nama_barang, Integer stok, Float harga_satuan) {
        this.ID_barang = ID_barang;
        this.nama_barang = nama_barang;
        this.stok = stok;
        this.harga_satuan = harga_satuan;
    }

    public Barang create_barang(String[] metadata){
        String ID_barang = metadata[0];
        String nama_barang = metadata[1];
        Integer stok = Integer.parseInt(metadata[2]);
        Float harga_satuan = Float.parseFloat(metadata[3]);

        return new Barang(ID_barang, nama_barang, stok, harga_satuan);
    }
}
