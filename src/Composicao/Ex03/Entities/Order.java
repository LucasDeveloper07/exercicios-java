package Composicao.Ex03.Entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import Composicao.Ex03.EntitiesEnum.OrderStatus;

public class Order {

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private static DateTimeFormatter fmtBirth = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    private LocalDateTime moment;
    private OrderStatus status;

    private Client client;
    private ArrayList<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double total = 0.0;

        for (OrderItem item : items) {
            total += item.subTotal();
        }

        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nMomento do pedido: ");
        sb.append(fmt.format(moment) + "\n");
        sb.append("Status do pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(client.getName() + " (" + fmtBirth.format(client.getBirthyDate()) + ") - " + client.getEmail() + "\n");
        sb.append("Itens do pedido:\n");
        
        for (OrderItem item : items) {
            sb.append(item.getProduct().getName() + ", ");
            sb.append("Quantidade: " + item.getQuantity() + ", ");
            sb.append("Subtotal: " + String.format("R$%.2f\n", item.subTotal()));
        }

        sb.append("Total do pedido: ");
        sb.append(String.format("R$%.2f\n",total()));

        return sb.toString();
    }
}
