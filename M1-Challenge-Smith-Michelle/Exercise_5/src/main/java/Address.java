import java.util.Objects;

public class Address {
    //    Billing address

    private String Street1;
    private String Street2;
    private String City;
    private String State;
    private String Zipcode;

    public Address(String street1, String street2, String city, String state, String zipcode) {
        Street1 = street1;
        Street2 = street2;
        City = city;
        State = state;
        Zipcode = zipcode;
    }

    public String getStreet1() {
        return Street1;
    }

    public void setStreet1(String street1) {
        Street1 = street1;
    }

    public String getStreet2() {
        return Street2;
    }

    public void setStreet2(String street2) {
        Street2 = street2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String zipcode) {
        Zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(Street1, address.Street1) && Objects.equals(Street2, address.Street2) && Objects.equals(City, address.City) && Objects.equals(State, address.State) && Objects.equals(Zipcode, address.Zipcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Street1, Street2, City, State, Zipcode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "Street1='" + Street1 + '\'' +
                ", Street2='" + Street2 + '\'' +
                ", City='" + City + '\'' +
                ", State='" + State + '\'' +
                ", Zipcode='" + Zipcode + '\'' +
                '}';
    }
}
