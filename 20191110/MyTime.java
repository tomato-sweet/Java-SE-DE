  public class MyTime{
	private int hour = 12;
	private int minute= 57;
	private int second= 30;

public MyTime() {
	}	
	public MyTime(int hour, int minute, int second) {
		if (hour < 0 || hour > 23) {
			System.out.println("不支持的小时");
			return;
		}
		
		if (minute < 0 || minute > 59) {
			System.out.println("不支持的分钟");
			return;
		}
		
		if (second < 0 || second > 59) {
			System.out.println("不支持的秒");
			return;
		}
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	//用12小时制显示 分为am和pm
	public String toString() {
		if(hour > 12){
			return String.format("%02d:%02d:%02d pm",hour,minute,second);
		}else{
		return String.format("%02d:%02d:%02d am", hour,minute,second);
		}
	}
	
	// 在当前对象上添加多少秒
	public void add(int seconds) {
		if (seconds < 0) {
			System.out.println("请使用 sub");
			return;
		}
		
		second += seconds;
		
		while (second > 59) {
			second -= 59;
			minute += 1;
			if (minute > 59) {
				hour += 1;
				minute = 0;
			}
		}
	}
	
	// 在当前对象上退后多少秒
	// 15h17m40s		后退 120秒
	// 15h17m(-80s)
	// 15h16m(-20s)
	// 15h15m40s
	public void sub(int seconds) {
		second -= seconds;
		while (second <= 0) {
			minute -= 1;
			if (minute < 0) {
				hour -= 1;
				minute = 59;
			}
			second += 59;
		}
	}
	
	public static void main(String[] args) {
		MyTime time = new MyTime(12,57,30);
		System.out.println(time);
		time.add(600);		// 13h07m40s pm
		System.out.println(time);
		time.sub(6000);		// 11h25m58s am
		System.out.println(time);
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	