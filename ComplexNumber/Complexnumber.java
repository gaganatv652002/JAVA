public class Complexnumber 
{
double real;
double img;
Complexnumber(double r,double i)
             {
             this.real=r;
             this.img=i;
             }
                      Complexnumber() {}
                        Complexnumber sum(Complexnumber c1,Complexnumber c2)
                        {
                         Complexnumber temp=new Complexnumber();
                         temp.real=c1.real+c2.real;
                         temp.img=c1.img+c2.img;
                         return temp;
                        }
                            public static void main(String[]args)
                            {
                            Complexnumber c1= new Complexnumber(2.3,5.2);
                            Complexnumber c2= new Complexnumber(3.2,3.5);
                            Complexnumber temp1=new Complexnumber();
                            temp1=temp1.sum(c1,c2);
                          System.out.println("sum is:"+temp1.real+"+"+temp1.img+"i");
                            }
}
