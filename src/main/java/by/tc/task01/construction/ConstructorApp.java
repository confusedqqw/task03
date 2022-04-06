package by.tc.task01.construction;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import java.util.Map;

public interface ConstructorApp {
  Appliance constructOven(Map<String,Object> map, Criteria criteria);
  Appliance constructTabletPC(Map<String,Object> map, Criteria criteria);
  Appliance constructLaptop(Map<String,Object> map, Criteria criteria);
  Appliance constructRefrigerator(Map<String, Object> map, Criteria criteria);
  Appliance constructSpeakers(Map<String, Object> map, Criteria criteria);
  Appliance constructVacuumCleaner(Map<String, Object> map, Criteria criteria);
}
