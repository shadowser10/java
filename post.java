import java.io.*;
import java.util.Scanner;
class post
{
  int []arr;
  int top;
post()
{ 
   top=-1;
   int max=200;
   arr=new int[max];
}
public void push(int a)
 { 
   top++;

   arr[top]=a;
 }
public int pop()
{
  int p=arr[top];
  top--;
return p;
}
 int posteva(String exp)
   {
    for (int i=0;i<exp.length();i++)
{
   int top=-1;
   char  c =exp.charAt(i);
   if(Character.isDigit(c))
    push(c- '0');
 else {
       int val1=pop();
       int val2=pop();
 switch(c){
       case '+':push(val2+val1);
           break;
       case '-':push(val2-val1);
           break;
       case '*':push(val2*val1);
           break;
       case '/':push(val2/val1);
          break;
       case'^':
		double d=Math.pow(val2,val1)
	      ;int s=(int)d;
  		push(s);
break;
 
           }
        }
}
return pop();
}
public static void main(String args[])
{
  post ev=new post();
Scanner sc=new Scanner (System.in);
System.out.println("Enter the posfix expression: ");
 String exp=sc.nextLine();
System.out.println("Evaluated expression: "+ev.posteva(exp));
}
}
