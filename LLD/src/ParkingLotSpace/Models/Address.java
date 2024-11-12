package ParkingLotSpace.Models;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;

@Getter
@Setter
@Builder
public class Address {
    public String street;
    public String block;
    public String city;
    public String state;
    public String country;
}
