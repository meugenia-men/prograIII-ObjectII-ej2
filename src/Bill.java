import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Bill {
    private UUID id;
    private LocalDateTime date;
    private Client client;
    private List<SaleItem> saleItems;

    public Bill() {
    }

    public Bill(Client client, List<SaleItem> saleItems) {
        this.id=UUID.randomUUID();
        this.date=LocalDateTime.now();
        this.client = client;
        this.saleItems = saleItems;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setSaleItems(List<SaleItem> saleItems) {
        this.saleItems = saleItems;
    }

    public UUID getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Client getClient() {
        return client;
    }

    public List<SaleItem> getSaleItems() {
        return saleItems;
    }

    /*método que calcule el monto final luego de aplicarle el descuento que posee el
    cliente*/
    public double totalAmount(){
        double total=0.0;
        for (SaleItem saleItem : saleItems){
            if(saleItem!=null){
                total+=saleItem.getUnitPrice();
            }
        }
        return total-((total*client.getDiscountP())/100);
    }

    @Override
    public String toString(){
        return "Factura [ ID = "+this.id+
                "] - [Fecha = "+this.date+
                "] - [Monto = "+this.totalAmount()+
                "] - [Descuento = "+this.client.getDiscountP()+
                "] - [Cliente = "+this.client.getName()+
                "] - [Email = "+this.client.getEmail()+
                "]";
    }

    public void printItems(){
        for(SaleItem item:saleItems){
            System.out.println("__________________________________________");
            System.out.println("ID = "+item.getId());
            System.out.println("Nombre = "+item.getName());
            System.out.println("Descripcion = "+item.getDescription());
            System.out.println("Precio Unitario = "+item.getUnitPrice());
        }
    }
}
