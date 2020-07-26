package ide;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class DeveloperAssistantPlugin {
	
	public static List<String> getSuggestions(Class<?> sourceClass){ 
		List<String> listOfMethods = new ArrayList<>();
		for (Method m : sourceClass.getDeclaredMethods()){
		listOfMethods.add(m.getName());
		}
		for (Method m : sourceClass.getSuperclass().getDeclaredMethods()){
			listOfMethods.add(m.getName());
			}
		return listOfMethods;
    }
	
}
