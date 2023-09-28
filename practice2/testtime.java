package practice2;

public class testtime{
	public static void main(String[] args) {
		Time t=new Time(0,15,59);
		System.out.println(t.toUniversal());
		System.out.println(t.toStandard());
		Time a=new Time(23,15,5);
		System.out.println(t.add(a));
	}
}