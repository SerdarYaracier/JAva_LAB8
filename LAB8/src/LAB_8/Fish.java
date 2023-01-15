package LAB_8;

public class Fish extends animal implements Pet {
	
	
	
	private String name;
	
	 public void setName(String name) {
	  
	  this.name=name;  
	}
	
	private String getName(String name) {
		this.name=name;
		return name;
	}

	public Fish(int legs) {
		super(legs);
		// TODO Auto-generated constructor stub
	}
	
	public Fish(int legs, String name) {
		super(legs);
		this.name = name;
		System.out.println(name);
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Kayib balik Nemoyla oynarlar");
		
	}

	@Override
	public void Walk() {
		// TODO Auto-generated method stub
		System.out.println("Baliklar yuruyemez. Yuzerler");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("diger baliklari yerler");
		
	}
	

}
