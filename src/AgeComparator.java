
public class AgeComparator implements Comparator <Persona>{

	/**
	 * @param <T>
	 * @param args
	 */
	
	public int compare(Persona source, Persona target){
				int r =  source.age - target.age;
		return r;
	}

 }

