public class ChildDemo extends ParentDemo {
	
	//work of super keyword
	String name = "QA Testing";
	public void getString()
	{
		System.out.println(name);
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChildDemo cd = new ChildDemo();
       
       cd.getString();
	}

}
