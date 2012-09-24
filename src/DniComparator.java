public class DniComparator implements Comparator<Persona> {

	/**
	 * @param args
	 */
	public int compare(Persona source, Persona target){
		
		return source.dni - target.dni;
	}
	
}
