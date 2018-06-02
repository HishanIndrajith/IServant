package codezilla.iservant;

/**
 * Created by Hishan Indrajith on 5/23/2018.
 */

public class Offer {
    private String Address;
    private double latitude;
    private double longitude;
    private long max_payment;
    private String provider;
    private String type;

    public Offer(String address, double latitude, double longitude, long max_payment, String provider, String type) {
        Address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.max_payment = max_payment;
        this.provider = provider;
        this.type = type;
    }

    public Offer() {
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public long getMax_payment() {
        return max_payment;
    }

    public void setMax_payment(long max_payment) {
        this.max_payment = max_payment;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
