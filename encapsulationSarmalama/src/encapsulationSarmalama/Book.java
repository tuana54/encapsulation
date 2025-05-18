package encapsulationSarmalama;

public class Book {
	private String name;
	private int pageNumber;
	//burdaki bütün değişkenleri private tanımlayacağız ve
	//erişmek istiyorsak metotlarla erişecez
	//biri değişkeni alabilmek biri de değişkeni dğeiştirebilmek için kullanıcaz
	// get metotları getirir set metotları değiştirir
	
	public Book(String name,int pageNumber) {
		this.name=name;
		if(pageNumber<0) {
			pageNumber=0;
		}
		this.pageNumber=pageNumber;
	}
	
	public int getPageNumber() {
		return this.pageNumber;
	}
	
	public void setPageNumber(int pageNumber) {
		//dışarıdan bir değer aldığı için parametre giriyoruz
		if(pageNumber<0) {
			pageNumber=0;
		}
		this.pageNumber = pageNumber;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		//dışarıdan bir değer aldığı için parametre giriyoruz
		this.name=name;
	}
}

