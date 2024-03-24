package list2.respository;

import list2.util.CurrencyFormat;
import list3.domain.Sale03;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;

@Log4j2

public class CalculatorRepository02 {
    private static List<Sale03> listSales = new ArrayList<>();

    public static void save(Sale03 sale) {
        log.info("Saving sale in the database...");
        listSales.add(sale);
        log.info("salved sale (:");
    }

    public static void printSales() {
        System.out.println("### VENDAS ###");
        for (Sale03 sale : listSales) {
            System.out.println(
                    "Valor: " + CurrencyFormat.format(sale.getValueSale()) +
                            ", disconto: " + CurrencyFormat.format(sale.getDiscount()) +
                            ", quantidade: " + sale.getQuantity()
            );
        }
    }
}
