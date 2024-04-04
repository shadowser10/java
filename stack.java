import java.io.*;
import java.util.Scanner;
class stack{
int top,n,e;
int []arr;
public void create(int e){
 n=e;
 arr=new int[e];
top=-1;
}
 public void push(int value)
	{ 
 	 if (top==n-1)
	  { 
 		System.out.println("Stack is full");
	  }
	else
	 { 
	     arr[++top]=value;
	    System.out.println("pushed element :"+value);
	 }
       } 
 public void pop()
   { 
     if(top==-1)
      { 
         System.out.println("Stack is Empty");
       }
      else 
 	{ 
   System.out.println("popped element:"+arr[top]);
    top--;
   }
  }
 public void display()
    {
     if (top==-1)
       { 
        System.out.println("stack is empty");
       }
     else{
      System.out.println("Stack elements are: ");
      for(int i=0;i<=top;i++)
            System.out.println(arr[i]);
    } 
   }
 public void peek()
  {
    if(top==-1)
    System.out.println("Stack is empty");
  else
    System.out.println("Top element:"+arr[top]);
  } 
 public static void main(String args[])
{ stack s=new stack();
  Scanner sc =new Scanner(System.in);
  int value,e,ch=0;
 while(ch!=6){
 System.out.println("\n1.create \n 2.push \n 3.pop \n 4.peek \n 5.display \n 6.Exit \n Enter your choice");
 ch=sc.nextInt();

  switch(ch)
  { 
  case 1:
          System.out.println("Enter the no of elements\n");
          e=sc.nextInt();
          s.create(e);
            break;
   case 2: System.out.println("Enter the element ");
           value=sc.nextInt();
          s.push(value);
        break;
  case 3: s.pop();
          break;
  case 4: s.peek();
         break;
  case 5: s.display();
         break;
  case 6: break;
  default:System.out.println("Invalid ");
    break;
 }
}
}}
