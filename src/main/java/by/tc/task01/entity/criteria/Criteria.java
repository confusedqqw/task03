package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Criteria {

	private Criteria(){}

	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<>();

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public boolean compareMaps(Map<String,Object> mapToCompare) {
		int count = 0;
		for (Entry<String, Object> elemCriteria : criteria.entrySet()) {
			for (Entry<String, Object> elemMapToCompare : mapToCompare.entrySet()) {
				if ((elemCriteria.getKey().equals(elemMapToCompare.getKey())) && (elemCriteria.getValue()
						.toString()
						.equalsIgnoreCase(String.valueOf(elemMapToCompare.getValue())))
						&& (++count == criteria.size())) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean compareWithCriteriaInEnumClasses() {
		int counter = 0;
		for (Class<?> enumClass : SearchCriteria.class.getClasses()) {
			if (enumClass.getSimpleName().equals(getGroupSearchName())) {
				for (String s : criteria.keySet()) {
					for (Object enumConstant : enumClass.getEnumConstants()) {
						if (s.equals(enumConstant.toString()) && (++counter == numberOfCriteria())) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	public boolean compareGroupName(String firstWord) {
		return firstWord.equals(getGroupSearchName());
	}

	public int numberOfCriteria() {
		return criteria.size();
	}
}
