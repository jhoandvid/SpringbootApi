package com.platzi.market.domain;

public class PurchaseItem {
    private int productoId;
    private int queantity;
    private double total;
    private boolean active;

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public int getQueantity() {
        return queantity;
    }

    public void setQueantity(int queantity) {
        this.queantity = queantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
