import java.util.Scanner;

class Employee{
	int eNo;
	String eName;
	double eSalary;
	
	Employee(int eNo,String eName,double eSalary){
		this.eNo=eNo;
		this.eName=eName;
		this.eSalary=eSalary;
	}
	
	void display(){
	
		System.out.println("Employee No:"+eNo);
		System.out.println("Employee Name:"+eName);
		System.out.println("Employee Salary:"+eSalary);
	}
}

class Employeee{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of employee:");
	int n=sc.nextInt();
	Employee[] employees=new Employee[n];
	
	for(int i=0;i<n;i++){
		System.out.println("Enter details for employee"+(i+1));
		System.out.println("Enter employee number:");
		int eNo=sc.nextInt();
		System.out.println("Enter employee name:");
		String eName=sc.next();
		System.out.println("Enter employee salary:");
		double eSalary=sc.nextDouble();
		employees[i]=new Employee(eNo,eName,eSalary);
	}
	
	System.out.println("Enter employee no to search");
	int searchNo=sc.nextInt();
	boolean found=false;
	for(int i=0;i<n;i++){
		if(employees[i].eNo==searchNo){
			System.out.println("Employee found");
			employees[i].display();
			found=true;
			break;
		}
	}
		if(!found){
			System.out.println("Employee with number "+searchNo+" not found");
		}
	}
}
