package Q3;

   class Rectangle {
	   int length;
	   int breadth;
	   
	   public Rectangle(int l, int b){
		    length = l;
		    breadth = b;
		  }
	   public void printArea(){
		    System.out.println(length*breadth);
		  }

		  public void printPerimeter(){
		    System.out.println(2*(length+breadth));
		  }
		}
   
   class Square extends Rectangle{
	   int side;
	   public Square(int s){
	     super(s,s);
	   }
	 }
   class Ans{
	   public static void main(String[] args){
	     Rectangle r = new Rectangle(5,10);
	     r.printArea();
	     r.printPerimeter();

	     Square s = new Square(6);
	     s.printArea();
	     s.printPerimeter();
	   }
	   }
