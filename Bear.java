package bearsInZooGit;

import java.util.Comparator;

public class Bear /*implements Comparator<Bear>*/ {

	
	private String name;
	private int age;
	private int furLenght;
	
	public String getName() {
		return name;
	}
	
	public Bear(String name, int age, int furLenght) {
		setName(name);
		setAge(age);
		setFurLenght(furLenght);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getFurLenght() {
		return furLenght;
	}
	public void setFurLenght(int furLenght) {
		this.furLenght = furLenght;
	}

	@Override
	public String toString() {
		return "Bear [name=" + name + ", age=" + age + ", furLenght=" + furLenght + "] \n";
	}


//	@Override
//	public int compare(Bear o1, Bear o2) {
//		if (o1.getAge() == o2.getAge()){
//			return o1.getFurLenght() - o2.getFurLenght();
//		}
//		return o1.getAge() - o1.getAge();
//	}
	
	
}
