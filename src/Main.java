import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Eugenia", "mariuneira@hotmail.com", 25);

        System.out.println(client1.toString());

        SaleItem saleItem1 = new SaleItem("Jean", "pantalon talle M", 35000d, 10);
        SaleItem saleItem2 = new SaleItem("Remera", "remera talle m", 15000d, 10);

        List<SaleItem> saleItems = new ArrayList<>();
        saleItems.add(saleItem1);
        saleItems.add(saleItem2);

        Bill bill1 = new Bill(client1,saleItems);

        System.out.println("Total de la factura es "+bill1.totalAmount());

        System.out.println(bill1.toString());
        bill1.printItems();

    }
}
