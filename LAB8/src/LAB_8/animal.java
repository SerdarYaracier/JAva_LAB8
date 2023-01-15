package LAB_8;

public abstract class animal {
	
private int legs;


public animal( int legs) {

	this.legs=legs;
	
	System.out.println(legs +" kadar bacagi vardir");
	
}

public abstract void Walk();
public abstract void eat();
	

}
