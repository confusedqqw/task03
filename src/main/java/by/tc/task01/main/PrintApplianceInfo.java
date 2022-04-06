package by.tc.task01.main;

import by.tc.task01.entity.Appliance;
import java.util.List;

public final class PrintApplianceInfo {

	private PrintApplianceInfo(){}

	private static String available = " -> is available.\n";
	private static String notAvailable = "Appliance is not available.\n";
	public static void print(List<Appliance> appliance) {
		if (!appliance.isEmpty()) {
			for (Appliance elem : appliance) {
				System.out.println(elem.toString() + available);
			}
		}
		 else {
			System.out.println(notAvailable);
		}
	}
}
