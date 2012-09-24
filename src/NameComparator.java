
public class NameComparator implements Comparator<Persona> {
	/**
	 * @param args
	 */
	
	public int compare(Persona source, Persona target){
		
		return source.name.compareto(target.name);
	}
	
}
