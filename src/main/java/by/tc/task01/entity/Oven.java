package by.tc.task01.entity;

import java.util.Objects;

public class Oven extends Appliance{

  //private static final long serialVersionUID = -3576810555810033208L;
  private int powerConsumption;
  private int weight;
  private int capacity;
  private int depth;
  private double height;
  private double width;

  private Oven() {
  }

  public Oven(int id, double sellingPrice, int quantity, int powerConsumption, int weight,
      int capacity, int depth, double height,
      double width) {
    super(id, sellingPrice, quantity);
    this.powerConsumption = powerConsumption;
    this.weight = weight;
    this.capacity = capacity;
    this.depth = depth;
    this.height = height;
    this.width = width;
  }

  public int getPowerConsumption() {
    return powerConsumption;
  }

  public int getWeight() {
    return weight;
  }

  public int getCapacity() {
    return capacity;
  }

  public int getDepth() {
    return depth;
  }

  public double getHeight() {
    return height;
  }

  public double getWidth() {
    return width;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Oven oven = (Oven) o;
    return powerConsumption == oven.powerConsumption && weight == oven.weight
        && capacity == oven.capacity && depth == oven.depth
        && Double.compare(oven.height, height) == 0
        && Double.compare(oven.width, width) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(powerConsumption, weight, capacity, depth, height, width);
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + " : " +
        "id=" + super.getId() +
        ", powerConsumption=" + powerConsumption +
        ", weight=" + weight +
        ", capacity=" + capacity +
        ", depth=" + depth +
        ", height=" + height +
        ", width=" + width +
        ", sellingPrice=" + super.getPrice() +
        ", quantity=" + super.getQuantity() +
        ';';
  }

  public static Builder newBuilder() {
    return new Oven().new Builder();
  }

  public class Builder extends Appliance.Builder {

    private Builder() {
    }

    @Override
    public Builder setID(int id) {
      super.setID(id);
      return this;
    }

    @Override
    public Builder setPrice(double Price) {
      super.setPrice(Price);
      return this;
    }

    @Override
    public Builder setQuantity(int quantity) {
      super.setQuantity(quantity);
      return this;
    }

    public Builder setPowerConsumption(int powerConsumption) {
      Oven.this.powerConsumption = powerConsumption;
      return this;
    }

    public Builder setWeight(int weight) {
      Oven.this.weight = weight;
      return this;
    }

    public Builder setCapacity(int capacity) {
      Oven.this.capacity = capacity;
      return this;
    }

    public Builder setDepth(int depth) {
      Oven.this.depth = depth;
      return this;
    }

    public Builder setHeight(double height) {
      Oven.this.height = height;
      return this;
    }

    public Builder setWidth(double width) {
      Oven.this.width = width;
      return this;
    }

    @Override
    public Oven build() {
      return Oven.this;
    }
  }
}



