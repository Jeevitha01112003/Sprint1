public class Location {

    private int locationId;
    private String locationName;
    private String city;
    private int capacity;

    public Location() {

    }

    public Location(int locationId, String locationName, String city, int capacity) {
        this.locationId = locationId;
        this.locationName = locationName;
        this.city = city;
        this.capacity = capacity;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void displayLocation() {

        System.out.println("Location ID   : " + locationId);
        System.out.println("Location Name : " + locationName);
        System.out.println("City          : " + city);
        System.out.println("Capacity      : " + capacity);

    }

}