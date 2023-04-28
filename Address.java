public abstract class Address{
    private String streetAddress;
    private String cityState;
    private int zipCode;



    public Address(String streetAddress, String cityState, int zipCode) {
        this.streetAddress = streetAddress;
        this.cityState = cityState;
        this.zipCode = zipCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCityState() {
        return cityState;
    }

    public void setCityState(String cityState) {
        this.cityState = cityState;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    @Override
    public String toString() {
        return {" +
                "streetAddress=" + streetAddress +
                ", cityState=" + cityState +
                ", zipCode=" + zipCode +
                '}';
    }
}
