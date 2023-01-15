package LAB_8;

public interface Pet {
		

	
	default void setName(String name) {
		
	}
	
	default String getName() {
		return null;
	}
	
	void play();
	
	

}
