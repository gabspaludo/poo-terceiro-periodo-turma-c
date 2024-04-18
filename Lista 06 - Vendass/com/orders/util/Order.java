package com.orders.util;

import java.util.Date;

public class Order { // Nome da classe em inglês

    Integer id;
    Date creationDate;
    Date paymentDate;
    Date dueDate;
    Customer customer;
    Salesperson salesperson;
    Store store;
    Item[] items = new Item[3];

    // Método para calcular o valor total do pedido
    public float calculateTotalPrice() {
        Float totalPrice = 0.0f;

        for (int i = 0; i < items.length; i++) {
            totalPrice += items[i].price;
        }

        System.out.println("Total Price: " + totalPrice); // Mensagem em inglês
        return totalPrice;
    }

    // Método para gerar a descrição da venda
    public void generateSaleDescription() {
        String message = "Creation Date: " + creationDate.toString()
                + ", Total Price: " + calculateTotalPrice() + "";
        System.out.println(message); // Mensagem em inglês
    }
}
