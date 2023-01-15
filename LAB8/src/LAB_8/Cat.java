package LAB_8;

public class Cat extends animal implements Pet{
	
	
	private String name;
	
	 public void setName(String name) {
	  
	  this.name=name;  
	}
	
	public String getName() {
		
		return name;
	}
	
	
	
	
	public Cat(int legs, String name) {
		super(legs);
		this.name = name;
		System.out.println(name);
	}
	
	
	

	public Cat(int legs) {
		super(legs);
		legs=4;
	System.out.println("Kedinin su kadar bacagi vardir: "+legs);	
		
	}

	@Override
	public void Walk() {
		System.out.println("Kediler yuruyebilir");
		
		
	}

	@Override
	public void eat() {
		System.out.println("Kediler balık yer.");
		
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Kediler tırmalamaca oynar");
		
	}
	
	



	
}
