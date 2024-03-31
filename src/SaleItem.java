import java.util.UUID;

public class SaleItem {
    private UUID id;
    private String name;
    private String description;
    private Double unitPrice;
    private Integer amount;

    public SaleItem() {
    }

    public SaleItem(String name, String description, Double unitPrice, Integer amount) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public Integer getAmount() {
        return amount;
    }

    @Override
    public String toString(){
        return "-"+this.name+
                "/-"+this.unitPrice+
                ".";
    }
}
