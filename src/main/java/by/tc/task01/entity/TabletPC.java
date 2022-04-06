package by.tc.task01.entity;

import java.util.Objects;

public class TabletPC extends Appliance {

  //private static final long serialVersionUID = 4654855715800489039L;
  private int batteryCapacity;
  private int displayInches;
  private int rom;
  private int flashMemoryCapacity;
  private String color;

  private TabletPC(){
  }

  public TabletPC(int batteryCapacity, int displayInches, int rom, int flashMemoryCapacity,
      String color) {
    this.batteryCapacity = batteryCapacity;
    this.displayInches = displayInches;
    this.rom = rom;
    this.flashMemoryCapacity = flashMemoryCapacity;
    this.color = color;
  }

  public double getBatteryCapacity() {
    return batteryCapacity;
  }

  public int getDisplayInches() {
    return displayInches;
  }

  public int getRom() {
    return rom;
  }

  public int getFlashMemoryCapacity() {
    return flashMemoryCapacity;
  }

  public String getColor() {
    return color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TabletPC tabletPC = (TabletPC) o;
    return Double.compare(tabletPC.batteryCapacity, batteryCapacity) == 0
        && displayInches == tabletPC.displayInches && rom == tabletPC.rom
        && flashMemoryCapacity == tabletPC.flashMemoryCapacity && Objects.equals(color,
        tabletPC.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batteryCapacity, displayInches, rom, flashMemoryCapacity, color);
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + " : " +
        "id=" + super.getId() +
        ", batteryCapacity=" + batteryCapacity +
        ", displayInches=" + displayInches +
        ", rom=" + rom +
        ", flashMemoryCapacity=" + flashMemoryCapacity +
        ", color='" + color + '\'' +
        ", sellingPrice=" + super.getPrice() +
        ", quantity=" + super.getQuantity() +
        ';';
  }

  public static Builder newBuilder() {
    return new TabletPC().new Builder();
  }

  public class Builder extends Appliance.Builder{

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

    public Builder setBatteryCapacity(int batteryCapacity) {
      TabletPC.this.batteryCapacity = batteryCapacity;
      return this;
    }

    public Builder setDisplayInches(int displayInches) {
      TabletPC.this.displayInches = displayInches;
      return this;
    }

    public Builder setRom(int rom) {
      TabletPC.this.rom = rom;
      return this;
    }

    public Builder setFlashMemoryCapacity(int flashMemoryCapacity) {
      TabletPC.this.flashMemoryCapacity = flashMemoryCapacity;
      return this;
    }

    public Builder setColor(String color) {
      TabletPC.this.color = color;
      return this;
    }

    @Override
    public TabletPC build() {
      return TabletPC.this;
    }
  }
}
