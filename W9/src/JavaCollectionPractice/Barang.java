package JavaCollectionPractice;

import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Barang {
    private ServicePackage servicePackage;
    private City city;
    private int weight;
    private int quantity;
    private int priceItem;
    private String productName;

    public Barang() {
    }

    public Barang(Status status, ServicePackage servicePackage, City city, int weight, int quantity, int priceItem, String productName) {
        this.servicePackage = servicePackage;
        this.city = city;
        this.weight = weight;
        this.quantity = quantity;
        this.priceItem = priceItem;
        this.productName = productName;
    }

    @Override
    public String toString() {
        int total = (priceItem * quantity) + servicePackage.getValue();
        return productName + " | " +
                quantity + " | " +
                weight + " | " +
                city.getDestination() + " | " +
                city.getOrigin() + " | " +
                servicePackage.getService() + " | " +
                servicePackage.getValue() + " | " +
                total + " | ";
    }

    public List<Barang> readBarangArray(JsonReader reader) throws IOException {
        List<Barang> listBarang = new ArrayList<Barang>();

        reader.beginArray();
        while (reader.hasNext()){
            listBarang.add(readBarang(reader));
        }
        reader.endArray();
        return listBarang;
    }

    public Barang readBarang(JsonReader reader) throws IOException{
        Status status = null;
        ServicePackage servicePackage = null;
        City city = null;
        int weight = 0;
        int quantity = 0;
        int priceItem = 0;
        String productName = null;

        reader.beginObject();
        while (reader.hasNext()){
            String name = reader.nextName();

            if (name.equals("status")){
                status = readStatus(reader);

            } else if (name.equals("servicePackage")) {
                servicePackage = readServicePackage(reader);

            } else if (name.equals("city")){
                city = readCity(reader);

            } else if (name.equals("weight")){
                weight = reader.nextInt();

            } else if (name.equals("quantity")){
                quantity = reader.nextInt();

            } else if (name.equals("priceItem")){
                priceItem = reader.nextInt();

            } else if (name.equals("productName")){
                productName = reader.nextString();

            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return new Barang(status,servicePackage,city,weight,quantity,priceItem,productName);
    }

    public Status readStatus(JsonReader reader) throws IOException{
        int code = 0;
        String description = null;

        reader.beginObject();
        while (reader.hasNext()){
            String name = reader.nextName();

            if (name.equals("code")){
                code = reader.nextInt();

            } else  if (name.equals("description")){
                description = reader.nextString();

            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return new Status(code,description);
    }

    public ServicePackage readServicePackage(JsonReader reader) throws IOException{
        String service = null;
        int value = 0;

        reader.beginObject();
        while (reader.hasNext()){
            String name = reader.nextName();

            if (name.equals("service")){
                service = reader.nextString();

            } else  if (name.equals("value")){
                value = reader.nextInt();

            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return new ServicePackage(service,value);
    }

    public City readCity(JsonReader reader) throws IOException{
        String origin = null;
        String destination = null;

        reader.beginObject();
        while (reader.hasNext()){
            String name = reader.nextName();

            if (name.equals("origin")){
                origin = reader.nextString();

            } else  if (name.equals("destination")){
                destination = reader.nextString();

            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return new City(origin,destination);
    }
}