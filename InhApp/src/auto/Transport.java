package auto;

public abstract class Transport {

	
	private String enviroment ;
	
	public Transport() {}
	public Transport(String enviroment) {
		this.setEnviroment(enviroment);
	}
	
	public String getEnviroment() {
		return enviroment;
	}
	public void setEnviroment(String enviroment) {
		//HW1: if/else - switch/case
		// all type of land for transport
		// "air" , "water" , "under water", "land",...
		switch(enviroment) {
		case "air" :
		case "land" :
		case "water" :
		this.enviroment = enviroment;
		}
	}
	public void printInfo() {
		   
		System.out.println("###############################");
		if(enviroment != null) {
			System.out.println("Transport for " + enviroment);
		} else {
			System.out.println("Unknown enviroment! ");
		}
		System.out.println("###############################\n");

	}
}
