package bearsInZooGit;

public class DemoZoo {

	public static void main(String[] args) {
		
		
		Zoo zoo = new Zoo();
		zoo.bears.add(new Bear("Asq", 2, 7));
		zoo.bears.add(new Bear("Galq", 1, 3));
		zoo.bears.add(new Bear("Dani", 5, 4));
		zoo.bears.add(new Bear("Asq", 5, 4));
		zoo.bears.add(new Bear("Asq", 5, 6));
		zoo.bears.add(new Bear("Doni", 6, 1));
		
	
		System.out.println(zoo.bears);
	}

}
