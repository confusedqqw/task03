package by.tc.task01.entity;

import java.util.Objects;

public class Laptop extends Appliance {

  //private static final long serialVersionUID = -2459112228730847590L;
  private double batteryCapacity;
  private String OS;
  private int rom;
  private int systemMemory;
  private double CPU;
  private int displayInches;

  private Laptop() {
  }

  public Laptop(int id, double sellingPrice, int quantity, double batteryCapacity, String os, int rom, int systemMemory, double cpu,
      int displayInches) {
    super(id, sellingPrice, quantity);
    this.batteryCapacity = batteryCapacity;
    this.OS = os;
    this.rom = rom;
    this.systemMemory = systemMemory;
    this.CPU = cpu;
    this.displayInches = displayInches;
  }

  public double getBatteryCapacity() {
    return batteryCapacity;
  }

  public String getOS() {
    return OS;
  }

  public int getRom() {
    return rom;
  }

  public int getSystemMemory() {
    return systemMemory;
  }

  public double getCPU() {
    return CPU;
  }

  public int getDisplayInches() {
    return displayInches;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Laptop laptop = (Laptop) o;
    return Double.compare(laptop.batteryCapacity, batteryCapacity) == 0
        && rom == laptop.rom && systemMemory == laptop.systemMemory
        && Double.compare(laptop.CPU, CPU) == 0 && displayInches == laptop.displayInches
        && Objects.equals(OS, laptop.OS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batteryCapacity, OS, rom, systemMemory, CPU, displayInches);
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + " : " +
        "id=" + super.getId() +
        "batteryCapacity=" + batteryCapacity +
        ", OS='" + OS + '\'' +
        ", memoryRom=" + rom +
        ", systemMemory=" + systemMemory +
        ", CPU=" + CPU +
        ", displayInches=" + displayInches +
        ", sellingPrice=" + super.getPrice() +
        ", quantity=" + super.getQuantity() +
        ';';
  }

  public static Builder newBuilder() {
    return new Laptop().new Builder();
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

    public Builder setBatteryCapacity(double batteryCapacity) {
      Laptop.this.batteryCapacity = batteryCapacity;
      return this;
    }

    public Builder setOS(String os) {
      Laptop.this.OS = os;
      return this;
    }

    public Builder setRom(int rom) {
      Laptop.this.rom = rom;
      return this;
    }

    public Builder setSystemMemory(int systemMemory) {
      Laptop.this.systemMemory = systemMemory;
      return this;
    }

    public Builder setCPU(double cpu) {
      Laptop.this.CPU = cpu;
      return this;
    }

    public Builder setDisplayInches(int displayInches) {
      Laptop.this.displayInches = displayInches;
      return this;
    }

    @Override
    public Laptop build() {
      return Laptop.this;
    }
  }
}
