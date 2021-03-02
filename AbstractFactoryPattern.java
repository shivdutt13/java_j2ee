package com.creationalPatterns;

abstract class Computer {
	public abstract Parts getRAM(); 
	public abstract Parts getProcessor();
	public abstract Parts getMonitor();	 
} 

class Parts {

	public String specification;
	
	public Parts(String specification) {
		this.specification = specification;
	}
	public String getSpecification() {
		return specification;
	}
}  

class PC extends Computer {

	public Parts getRAM() {
		return new Parts("512 MB");
	} 
	public Parts getProcessor() {
		return new Parts("Celeron");
	}
	public Parts getMonitor() {
		return new Parts("15 inches");
	}
}  

class Workstation extends Computer {  

	public Parts getRAM() {
		return new Parts("1 GB");
	} 
	public Parts getProcessor() {
		return new Parts("Intel P 3");
	}
	public Parts getMonitor() {
		return new Parts("19 inches");
	}
}

class Server extends Computer{ 
	 
	public Parts getRAM() {
		return new Parts("4 GB");
	} 
	public Parts getProcessor() {
		return new Parts("Intel P 4");
	}
	public Parts getMonitor() {
		return new Parts("17 inches");
	}	 
} 


public class AbstractFactoryPattern {
	
	private Computer comp; 
	public static void main(String[] args) {
		AbstractFactoryPattern type = new AbstractFactoryPattern(); 
		Computer computer = type.getComputer("PC");
		System.out.println("Monitor: "+computer.getMonitor().getSpecification());
		System.out.println("RAM: "+computer.getRAM().getSpecification());
		System.out.println("Processor: "+computer.getProcessor().getSpecification());
	}    
	
	public Computer getComputer(String computerType) { 
		if (computerType.equals("PC"))
			comp = new PC();
		else if(computerType.equals("Workstation"))
			comp = new Workstation();
		else if(computerType.equals("Server"))
			comp = new Server(); 
		return comp;
	} 
}
