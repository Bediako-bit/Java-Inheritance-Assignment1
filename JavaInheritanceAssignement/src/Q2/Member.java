package Q2;

    class Member {
    	String name;
    	int age;
    	String number;
    	String address;
    	int salary;
    	
    	 public void printSalary(){
    		    System.out.println(salary);
    		  }
    	 }
    
    	  class Employee extends Member{
    	  String specialization;
    	}

    	class Manager extends Member{
    	  String department;
    	}
    	
    	class Answer{
	public static void main(String[] args) {
		Employee x = new Employee();
		
		x.name= "Samuel Boateng";
		x.age= 23;
		x.number="0542991079";
		x.address= "62 Sakumo Cresecent Lartebiokorshie - Accra";
		x.specialization= "Graduate Trainee";
		
		Manager y = new Manager();
		
		y.name= "Funsho Adebiyi";
		y.age= 46;
		y.number= "0805050600";
		y.address= "43 Amina Court Estate, Abuja";
		y.department= "Service Department";
				}

}
