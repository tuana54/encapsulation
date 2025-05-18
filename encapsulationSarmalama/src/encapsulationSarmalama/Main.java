package encapsulationSarmalama;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book harryPotter=new Book("Harry Potter",150);
		Book lordOfTheRings=new Book("Lord Of The Rings",-100);
		// kod hata vermez ama anlamsızlık olur.
		/*lordOfTheRings.changePageNumber(-1000);
		
		System.out.println(lordOfTheRings.showPageNumber());*/
		lordOfTheRings.setName("alice harikalar diyarında");
		System.out.println(lordOfTheRings.getName());
		harryPotter.setPageNumber(500);
		System.out.println(harryPotter.getPageNumber());
	}

}
