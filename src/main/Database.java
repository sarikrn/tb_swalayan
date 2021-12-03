package main;

import java.io.*;
import java.util.ArrayList;

public class Database {
    public ArrayList<String[]> read(String separator, String file_name){
        if(!fileExist(file_name))
            return null;

        try (BufferedReader reader = new BufferedReader(new FileReader(file_name))){
            ArrayList<String[]> list = new ArrayList<>();

            int count = 0;
            String row = "";
            while((row = reader.readLine()) != null){
                /* skip the head/ title */
                if(count == 0){
                    count++;
                    continue;
                }

                list.add(row.split(separator));
            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void export( ArrayList<String[]> data, String separator, String file_name){
        try (FileWriter writer = new FileWriter(file_name)){
            for (String[] strings : data) {
                for (int i = 0; i < strings.length; i++) {
                    writer.append(strings[i]);
                    if(i < (strings.length-1))
                        writer.append(separator);
                }
                writer.append(System.lineSeparator());
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Boolean fileExist( String file_name ){
        File csvFile = new File(file_name);
        return csvFile.isFile();
    }
}
