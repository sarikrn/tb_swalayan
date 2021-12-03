package main;

import java.util.ArrayList;

public class Main {
    public static void init(){
        Database db = new Database();
        ArrayList<String[]> barangs = db.read(";", "data/barang.csv");

        
    }

    public static void main(String[] args) {

        Barang barang = new Barang();
        ArrayList<Barang> items = new ArrayList<>();

        for (String[] string : barangs) {
            Barang item = barang.create_barang(string);
            items.add(item);
        }
    }
}
