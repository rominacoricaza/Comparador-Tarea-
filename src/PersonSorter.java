public class PersonSorter {
	static Persona[] people={
		new Persona("JUan",21,72649311),
		new Persona("Ana",19,12345678),
		new Persona("Luis",15,1234444)
	};
	
	public static void sort(Persona[] people2, Comparator<Persona> c){
		for(int i=0;i<people2.length;i++){
				for(int j=1;j<people2.length;j++){
					if(c.compare(people2[i],people2[j])>0){
						Persona temp = people2[j];
						people2[i] = people2[j];
						people2[j] = temp;						
					}					
				}
		}		
	}
	
	public static void main(String[] args){
		Comparator<Persona> comparator=new DniComparator();
		
		sort(people,comparator);
		for(int i=0;i<people.length;i++){
			System.out.println(people[i].name + " - " + people[i].age + " - " + people[i].dni );
			
		}
		
	}
	
	
}
