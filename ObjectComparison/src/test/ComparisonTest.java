package test;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

import test.domain.Child;
import test.domain.GrandChild;
import test.domain.Parent;

public class ComparisonTest {
	
	private static final Set<Class<?>> WRAPPER_TYPES = getWrapperTypes();
	private static final Set<Class<?>> PREMITIVE_TYPES = getPremitiveTypes();
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Parent p1 = getFirstParent();
		Parent p2 = getSecondParent();
		
		compare(p1, p2);
	}
	
	private static void compare(Object o1, Object o2) throws IllegalArgumentException, IllegalAccessException {
		Field[] fields1 = o1.getClass().getDeclaredFields();
		Field[] fields2 = o2.getClass().getDeclaredFields();
		
		for (int i = 0; i < fields1.length; i++) {
			Class<?> type = fields1[i].getType();
			if (isWrapperType(type)) {
				fields1[i].setAccessible(true);
				fields2[i].setAccessible(true);
				Object object1 = fields1[i].get(o1);
				Object object2 = fields2[i].get(o2);
				System.out.println("field name: " + fields1[i].getName() + ", Field value in first object: " + object1 + ", Field value in second object: " + object2 + ", Are equal: " + areEqual(object1, object2, type));
			}
		}
	}
	
	private static boolean areEqual(Object object1, Object object2, Class<?> type) {
		if (WRAPPER_TYPES.contains(type)) {
			return object1 == object2;
		}
		if (PREMITIVE_TYPES.contains(type)) {
			return object1.equals(object2);
		}
		return false;
	}
	
	private static boolean isWrapperType(Class<?> type) {
		return WRAPPER_TYPES.contains(type) || PREMITIVE_TYPES.contains(type);
	}
	
	private static Set<Class<?>> getWrapperTypes() {
		Set<Class<?>> ret = new HashSet<Class<?>>();
		ret.add(Boolean.class);
		ret.add(Character.class);
		ret.add(Byte.class);
		ret.add(Short.class);
		ret.add(Integer.class);
		ret.add(Long.class);
		ret.add(Float.class);
		ret.add(Double.class);
		ret.add(Void.class);
		ret.add(int.class);
		ret.add(boolean.class);
		ret.add(float.class);
		ret.add(double.class);
		ret.add(short.class);
		ret.add(long.class);
		ret.add(byte.class);
		return ret;
	}
	
	private static Set<Class<?>> getPremitiveTypes() {
		Set<Class<?>> ret = new HashSet<Class<?>>();
		ret.add(int.class);
		ret.add(boolean.class);
		ret.add(float.class);
		ret.add(double.class);
		ret.add(short.class);
		ret.add(long.class);
		ret.add(byte.class);
		return ret;
	}
	
	private static Parent getFirstParent() {
		GrandChild gc = new GrandChild("granChild1", 1);
		Child c = new Child("child1", 1, gc);
		return new Parent("parent1", 1, 1, true, true, 1.1F, c);
	}
	
	private static Parent getSecondParent() {
		GrandChild gc = new GrandChild("granChild2", 2);
		Child c = new Child("child2", 2, gc);
		return new Parent("parent1", 2, 2, true, true, 2.2F, c);
	}
}
