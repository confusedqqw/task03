package by.tc.task01.dao.impl;

import static by.tc.task01.construction.ConstructorAppImpl.*;
import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class ApplianceDAOImpl implements ApplianceDAO {

	private static final String APPS_FILE = "appliances_db.txt";
	private static BufferedReader reader;
	private static File file;
	private static FileReader fileReader;
	private static Map<String, Object> properAppFromDB = new HashMap<>();

	@Override
	public List<Appliance> find(Criteria criteria) {

		String filePath = Objects.requireNonNull(getClass().getClassLoader().getResource(APPS_FILE))
				.getPath();
		List<Appliance> appliances = new ArrayList<>();

		try {
			file = new File(filePath);
			fileReader = new FileReader(file);
			reader = new BufferedReader(fileReader);
			String line;
			while (reader.ready()) {
				line = reader.readLine();
				properAppFromDB = makeMap(line,criteria);
					if (!properAppFromDB.isEmpty() && criteria.compareMaps(properAppFromDB)) {
						initAppliance(appliances,criteria, properAppFromDB);
				}
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Check file path to appliances_db.txt. File is not fount", e);
		} catch (IOException e) {
			throw new RuntimeException("Error in getting data from file", e);
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				throw new RuntimeException("Error in closing BufferedReader", e);
			}
		}
		return appliances;
	}

	public String obtainFirstWord(String line) {
		String word = "";
		char space = ' ';
		if (!line.isEmpty()) {
			int i = line.indexOf(space);
			word = line.substring(0, i);
		}
		return word;
	}


	private static final String SIGNS_TO_REPLACE = "(;|:|=|,|\\s)+";
	private static final String NEW_DELIMETER = " ";
	public Map<String,Object> makeMap(String line, Criteria criteria) {
		Map<String, Object> paramsValuesDB = new HashMap<>();
		if (criteria.compareGroupName(obtainFirstWord(line))) {
			String[] parameters = line.replaceAll(SIGNS_TO_REPLACE, NEW_DELIMETER).split(NEW_DELIMETER);
			for (int i = 1; i < parameters.length; i += 2) {
				paramsValuesDB.put(parameters[i], parameters[i + 1]);
			}
		}
		return paramsValuesDB;
	}

	private static final Map<String, Object> PROPER_APP_CREATION = new HashMap<>();
	public List<Appliance> initAppliance(List<Appliance> appliances, Criteria criteria, Map<String,Object> map) {
		{
			PROPER_APP_CREATION.put(Oven.class.getSimpleName(),getInstance().constructOven(map,criteria));
			PROPER_APP_CREATION.put(TabletPC.class.getSimpleName(),getInstance().constructTabletPC(map,criteria));
			PROPER_APP_CREATION.put(Laptop.class.getSimpleName(),getInstance().constructLaptop(map,criteria));
			PROPER_APP_CREATION.put(Refrigerator.class.getSimpleName(),getInstance().constructRefrigerator(map,criteria));
			PROPER_APP_CREATION.put(Speakers.class.getSimpleName(),getInstance().constructSpeakers(map,criteria));
			PROPER_APP_CREATION.put(VacuumCleaner.class.getSimpleName(),getInstance().constructVacuumCleaner(map,criteria));
		}

			appliances.add((Appliance) PROPER_APP_CREATION.get(criteria.getGroupSearchName()));
		return appliances;
	}
}