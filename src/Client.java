import java.util.UUID;

public class Client {
    private UUID id;
    private String name;
    private String email;
    private Integer discountP;

    public Client() {
    }

    public Client(String name, String email, Integer discountP) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.discountP = discountP;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDiscountP(Integer discountP) {
        this.discountP = discountP;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getDiscountP() {
        return discountP;
    }

    @Override
    public String toString() {
        return "Cliente =" +
                " [ID = " + this.id +
                "] - [Nombre = " + this.name +
                "] - [Email = " + this.email +
                "] - [Descuento = " + this.discountP +
                "]";
    }
}

