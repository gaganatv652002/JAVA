import java.util.Scanner;
interface Shape{
	public void getter();
	public void area();
	public void perimeter();
}
class Circle implements Shape{
	double r,a,p;
	Scanner sc=new Scanner(System.in);
	public void getter(){
		System.out.print("enter the radius of circle:");
		r=sc.nextDouble();
	}
	public void perimeter() {
		p=2*3.14*r;
		System.out.println(p);
	}
	public void area() {
		a=3.14*r*r;
		System.out.println(a);
	}
}
class Rectangle implements Shape{
	int l,b,p,a;
	Scanner sc=new Scanner(System.in);
	public void getter(){
		System.out.println("enter the length of rectangle:");
		l=sc.nextInt();
		System.out.println("enter the breadth of rectangle:");
		b=sc.nextInt();
	}
	public void perimeter() {
		p=2*(l+b);
		System.out.println(p);
	}
	public void area() {
		a=l*b;
		System.out.println(a);
	}
}
class Square implements Shape{
	int s,a,p;
	Scanner sc=new Scanner(System.in);
	public void getter(){
		System.out.println("enter the length of square:");
		s=sc.nextInt();
	}
	public void perimeter() {
		p=4*s;
		System.out.println(p);
	}
	public void area() {
		a=s*s;
		System.out.println(a);
	}
}
class Triangle implements Shape{
	double a,b,c,h,p;
	Scanner sc=new Scanner(System.in);
	public void getter(){
		System.out.print("enter the base of triangle:");
		b=sc.nextDouble();
		System.out.print("enter the height of triangle:");
		h=sc.nextDouble();
		System.out.print("enter the first side of triangle:");
		c=sc.nextDouble();
	}
	public void perimeter() {
		p=h+b+c;
		System.out.println(p);
	}
	public void area() {
		a=0.5*b*h;
		System.out.println(a);
	}
}
public class AreaInterface {
	public static void main(String args[]){
		int wish,ch;
		Scanner sc=new Scanner(System.in);
	 	Circle circ=new Circle();
	 	Rectangle rect=new Rectangle();
	 	Square sq=new Square();
	 	Triangle tri=new Triangle();
	
		System.out.println("1.Circle\n2.Square\n3.Triangle\n4.Rectangle\n");
		do{
			System.out.print("Enter your choice:");
			ch=sc.nextInt();
			switch(ch){
				case 1:	circ.getter();	
					System.out.print("Area of circle:");
					circ.area();
					System.out.print("Perimeter of circle:");
					circ.perimeter();
					break;
				case 2:sq.getter();
					System.out.print("Area of square:");
					sq.area();
					System.out.print("Perimeter of square:");
					sq.perimeter();
					break;	
				case 3:tri.getter();
					System.out.print("Area of triangle:");
					tri.area();
					System.out.print("Perimeter of triangle:");
					tri.perimeter();
					break;
				case 4:rect.getter();
					System.out.print("Area of rectangle:");
					rect.area();
					System.out.print("Perimeter of rectangle:");
					rect.perimeter();
					break;
			}System.out.println("Do you wish to continue(1/0):?");
			wish=sc.nextInt();
		}while(wish==1);
	}
}
	
 
 
