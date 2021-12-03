package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Struk {
    private String ID_struk;
    private ArrayList<Transaksi> items;
    private Date tanggal_pembuatan_struk;
    private Float total_pembelian;
    private Float total_pembayaran;
    private Float kembalian;
    private Boolean status;

    public Struk() {
        this.items = new ArrayList<>();
        this.status = false;
    }

    public Struk(String ID_struk, Date tanggal_pembuatan_struk, Float total_pembelian, Float total_pembayaran, Float kembalian, Boolean status) {
        this.ID_struk = ID_struk;
        this.tanggal_pembuatan_struk = tanggal_pembuatan_struk;
        this.total_pembelian = total_pembelian;
        this.total_pembayaran = total_pembayaran;
        this.kembalian = kembalian;
        this.status = status;
    }

    public Struk create_struk(String[] metadata) throws ParseException {
        String ID_struk = metadata[0];
        Date tanggal_pembuatan_struk = new SimpleDateFormat("dd/MM/yyyy").parse(metadata[1]);
        Float total_pembelian = Float.parseFloat(metadata[2]);
        Float total_pembayaran = Float.parseFloat(metadata[3]);
        Float kembalian = Float.parseFloat(metadata[4]);
        Boolean status = Boolean.parseBoolean(metadata[5]);

        return new Struk(ID_struk, tanggal_pembuatan_struk, total_pembelian, total_pembayaran, kembalian, status);
    }
}
