import java.util.Objects;

public class Address {
    //    Billing address

    private String Street;
    private String City;
    private String State;
    private String Zipcode;

    public Address(String street, String city, String state, String zipcode) {
        Street = street;
        City = city;
        State = state;
        Zipcode = zipcode;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
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
        return Objects.equals(Street, address.Street) && Objects.equals(City, address.City) && Objects.equals(State, address.State) && Objects.equals(Zipcode, address.Zipcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Street, City, State, Zipcode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "Street='" + Street + '\'' +
                ", City='" + City + '\'' +
                ", State='" + State + '\'' +
                ", Zipcode='" + Zipcode + '\'' +
                '}';
    }
}
