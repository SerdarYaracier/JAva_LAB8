package LAB_8;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat kedi= new Cat(4);
		kedi.eat();
		kedi.play();
		 
		
		System.out.println("------------------");
		
		animal orumcek = new Spider(6);
		orumcek.eat();
		
		System.out.println("------------------");
		
		Fish balik = new Fish(0,"Firuze");
		balik.eat();
		balik.play();
		balik.Walk();
		
		
				

	}

}
