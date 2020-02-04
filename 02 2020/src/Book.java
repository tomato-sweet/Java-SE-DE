public class Book{
	//属性
	public String name;
	public String writer;
	public int price;
	public String press;
	
	//构造方法
	public Book(){
		name="比特";
		writer="汤众";
		price=50;
		press="比特出版社";
	}
	Bike(String writer){
		writer=writer;
		name="比特";
		price=50;
		press="比特出版社";
	}
	
	//方法
	void setWriter(String writer){
		this.writer=writer;
	}
	void discount(){
		price*=0.05;
		if(price<=20){
			price=20;
		}
	}
}











