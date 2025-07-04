package model;

import lombok.*;

import java.util.HashSet;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class Product {
    private String name;
    private double price;
    private int quantity;
    public static int stock= 0;
    private Expires expiration;
    private Shipping shipping;





}
enum Expires{
    EXPIRES,
    NO_EXPIRE
}
enum Shipping{
    SHIPPING,
    NO_SHIPPING
}

