package core.string.stringBuffer.stringBuilder;

class Animal_Class {
	  void whoAmI() {
	    System.out.println("I am a generic Animal_Class.");
	  }
	}
	class Dog extends Animal_Class {
	  void whoAmI() {
	    System.out.println("I am a Dog.");
	  }
	}
	class Cow extends Animal_Class {
	  void whoAmI() {
	    System.out.println("I am a Cow.");
	  }
	}
	class Snake extends Animal_Class {
	  void whoAmI() {
	    System.out.println("I am a Snake.");
	  }
	}

	class RuntimePolymorphismDemo {

	  public static void main(String[] args) {
	    Animal_Class ref1 = new Animal_Class();
	    Animal_Class ref2 = new Dog();
	    Animal_Class ref3 = new Cow();
	    Animal_Class ref4 = new Snake();
	    ref1.whoAmI();
	    ref2.whoAmI();
	    ref3.whoAmI();
	    ref4.whoAmI();
	  }
	}
	
	