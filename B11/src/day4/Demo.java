package day4;


class Car{
	public int grear, speed;
	boolean cluch, brake,accelerator;
	public void start()
	{
		
	}
	public void stop()
	{
		
	}
	public void setspeed(int i)
			{
		speed = i;
			}
	public int getspeed() 
	{
		return speed;
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car c1,c2;
c1 = new Car();
c2 = new Car();
c1.setspeed(100);
c2.setspeed(200);
System.out.println(c2.getspeed());

}
}