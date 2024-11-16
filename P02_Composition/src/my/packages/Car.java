package my.packages;

public class Car{
	public void drive() {
		Engine e=new Engine();
		int status=e.start();
		
		if(status>=1)
		{
			System.out.println("journey started...composition.....");
		}else {
			System.out.println("occur some trouble....");
		}
	}
}
