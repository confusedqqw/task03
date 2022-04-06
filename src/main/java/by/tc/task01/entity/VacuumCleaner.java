package by.tc.task01.entity;

import java.util.Objects;

public class VacuumCleaner extends Appliance {

  //private static final long serialVersionUID = 1061895506077096961L;
  private int powerConsumption;
  private String filterType;
  private String bagType;
  private String wandType;
  private int motorSpeedRegulation;
  private int cleaningWidth;

  private VacuumCleaner() {}

  public VacuumCleaner(int powerConsumption, String filterType, String bagType,
      String wandType, int motorSpeedRegulation, int cleaningWidth) {
    this.powerConsumption = powerConsumption;
    this.filterType = filterType;
    this.bagType = bagType;
    this.wandType = wandType;
    this.motorSpeedRegulation = motorSpeedRegulation;
    this.cleaningWidth = cleaningWidth;
  }

  public int getPowerConsumption() {
    return powerConsumption;
  }

  public String getFilterType() {
    return filterType;
  }

  public String getBagType() {
    return bagType;
  }

  public String getWandType() {
    return wandType;
  }

  public int getMotorSpeedRegulation() {
    return motorSpeedRegulation;
  }

  public int getCleaningWidth() {
    return cleaningWidth;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacuumCleaner that = (VacuumCleaner) o;
    return powerConsumption == that.powerConsumption
        && motorSpeedRegulation == that.motorSpeedRegulation && cleaningWidth == that.cleaningWidth
        && Objects.equals(filterType, that.filterType) && Objects.equals(bagType,
        that.bagType) && Objects.equals(wandType, that.wandType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation,
        cleaningWidth);
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + " : " +
        "powerConsumption=" + powerConsumption +
        ", filterType='" + filterType + '\'' +
        ", bagType='" + bagType + '\'' +
        ", wandType='" + wandType + '\'' +
        ", motorSpeedRegulation=" + motorSpeedRegulation +
        ", cleaningWidth=" + cleaningWidth +
        ';';
  }

  public static Builder newBuilder() {
    return new VacuumCleaner().new Builder();
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

    public Builder setPowerConsumption(int powerConsumption) {
      VacuumCleaner.this.powerConsumption = powerConsumption;
      return this;
    }

    public Builder setFilterType(String filterType) {
      VacuumCleaner.this.filterType = filterType;
      return this;
    }

    public Builder setBagType(String bagType) {
      VacuumCleaner.this.bagType = bagType;
      return this;
    }

    public Builder setWandType(String wandType) {
      VacuumCleaner.this.wandType = wandType;
      return this;
    }

    public Builder setMotorSpeedRegulation(int motorSpeedRegulation) {
      VacuumCleaner.this.motorSpeedRegulation = motorSpeedRegulation;
      return this;
    }

    public Builder setCleaningWidth(int cleaningWidth) {
      VacuumCleaner.this.cleaningWidth = cleaningWidth;
      return this;
    }

    @Override
    public VacuumCleaner build() {
      return VacuumCleaner.this;
    }
  }
}
