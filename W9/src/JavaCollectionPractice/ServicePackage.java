package JavaCollectionPractice;

public class ServicePackage {
    private String service;
    private int value;

    public ServicePackage(String service, int value) {
        this.service = service;
        this.value = value;
    }

    public ServicePackage(){
        this.service = null;
        this.value = 0;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}
