package bearsInZooGit;

import java.util.Comparator;
import java.util.TreeSet;

public class Zoo {

	TreeSet<Bear> bears;

	public Zoo() {
		Comparator<Bear> comparator = new Comparator<Bear>() {

			@Override
			public int compare(Bear o1, Bear o2) {
				if (o1.getName().equals(o2.getName())){
					if (o1.getAge() != o2.getAge()){
						return o1.getAge() - o2.getAge();
					} else {
						return o1.getFurLenght() - o2.getFurLenght();
					}
					
				}
				return o1.getName().compareTo(o2.getName());
				
		
				}
		};
		bears = new TreeSet<>(comparator);
	}

		}


