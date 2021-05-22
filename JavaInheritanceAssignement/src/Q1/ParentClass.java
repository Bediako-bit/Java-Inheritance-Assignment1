package Q1;

  class ParentClass {
	  
	  public void pmethod(){
		  System.out.println("This is Parent class");
		  }
	  }
  class ChildClass extends ParentClass {
	  public void cmethod() {
	  System.out.println("This is Child class");
	  }
  }
  
  class Answer{
	  
	public static void main(String[] args) {
		
		ParentClass a = new ParentClass();
		ChildClass b = new ChildClass();
		
		a.pmethod();
		b.cmethod();
		b.pmethod();
		
	}

}
