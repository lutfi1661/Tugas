package JavaCollectionPractice;

import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        try (JsonReader reader = new JsonReader(new FileReader("D:\\Education\\POLBAN\\Semester 2\\Teknik Pemrograman\\Practice\\Task\\Task 9\\barang.json"))){
            Barang obj = new Barang();
            List<Barang> dataBarang = obj.readBarangArray(reader);

            for (Barang barang : dataBarang){
                System.out.println(barang);
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }


}