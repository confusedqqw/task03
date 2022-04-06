package by.tc.task01.entity.criteria;

public final class SearchCriteria {
	
	public static enum Oven{
		ID, POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH, PRICE, QUANTITY
	}
	
	public static enum Laptop{
		ID, BATTERY_CAPACITY, OS, ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHES, PRICE, QUANTITY
	}
	
	public static enum Refrigerator{
		ID, POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH, PRICE, QUANTITY
	}
	
	public static enum VacuumCleaner{
		ID, POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH, PRICE, QUANTITY
	}
	
	public static enum TabletPC{
		ID, BATTERY_CAPACITY, DISPLAY_INCHES, ROM, FLASH_MEMORY_CAPACITY, COLOR, PRICE, QUANTITY
	}
	
	public static enum Speakers{
		ID, POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE, CORD_LENGTH, PRICE, QUANTITY
	}
	
	private SearchCriteria() {}
}

