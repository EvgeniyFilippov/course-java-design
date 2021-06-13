package main.java.com.rakovets.course.design.practice.solid;

import java.util.Date;

public class OrderInfo {
    private Date timeOfOrder;
    private String pizzaName;
    private Float price;

    public OrderInfo(Date timeOfOrder, String pizzaName, Float price) {
        this.timeOfOrder = timeOfOrder;
        this.pizzaName = pizzaName;
        this.price = price;
    }

    public Date getTimeOfOrder() {
        return timeOfOrder;
    }

    public void setTimeOfOrder(Date timeOfOrder) {
        this.timeOfOrder = timeOfOrder;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
