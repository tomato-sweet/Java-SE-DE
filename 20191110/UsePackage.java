import peixinchen.tangzhong.Phone;

public class UsePackage {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.band = "华为";
		p.color = "红色";
		p.price = 1000;
		
		System.out.println(p.band);
}