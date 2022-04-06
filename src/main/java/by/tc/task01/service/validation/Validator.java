package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

public final class Validator {

	private Validator() {}

	public static boolean criteriaValidator(Criteria criteria) {

		return criteria.compareWithCriteriaInEnumClasses() ;
	}
}