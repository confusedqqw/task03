package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Objects;

public class Appliance implements Serializable {

  private int id;
  private double price;
  private int quantity;

  protected Appliance() {
  }

  public Appliance(int id, double sellingPrice, int quantity) {
    this.id = id;
    this.price = sellingPrice;
    this.quantity = quantity;
  }

  public int getId() {
    return id;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Appliance appliance = (Appliance) o;
    return id == appliance.id && Double.compare(appliance.price, price) == 0
        && quantity == appliance.quantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, price, quantity);
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + " : " +
        "id=" + id +
        ", price=" + price +
        ", quantity=" + quantity +
        '}';
  }

  public static Builder newBuilder() {
    return new Appliance().new Builder();
  }

  public class Builder {

    protected Builder() {
    }

    public Builder setID(int id) {
      Appliance.this.id = id;
      return this;
    }

    public Builder setPrice(double Price) {
      Appliance.this.price = Price;
      return this;
    }

    public Builder setQuantity(int quantity) {
      Appliance.this.quantity = quantity;
      return this;
    }

    public Appliance build() {
      return Appliance.this;
    }
  }
}

