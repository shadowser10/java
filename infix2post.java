import java.io.*;
import java.util.Scanner;
class infix2post
{
  char []arr;
 int top;
 infix2post()
{ 
 top=-1;
 arr=new char[20];
 }
public char pop()
{ 
char p=arr[top];
 top--;
 return p;
} 
public void push(char a)
{ 
top++;
 arr[top]=a;
 } 
public boolean isempty()
{
 if(top ==-1)
  return true;
 else
 return false;
 } 
public char peek()
{ 
return arr[top];
}
   static int prec(char c)
   { 
     if(c=='^')
       return 3;
     else if (c=='/'||c=='*')
       return 2;
     else if(c=='+'||c=='-')
       return 1;
     else 
       return -1;
   }
static char asso(char c)
   {
    if(c=='^')
 	return 'R';
        return 'L';
   }
  static void infixtopostfix(String s)
    {
     infix2post ip=new infix2post();
       StringBuilder result= new StringBuilder();
    for( int i=0;i<s.length();i++)
     { 
  	    char c=s.charAt(i);
  	   if((c>='a'&& c<='z') || (c>='A' && c<='Z') || (c >= '0'&& c<= '9'))
         	{
   		  result.append(c);
                  }
           else if (c=='(')
              ip.push(c);
           else if(c==')')
              {
                while(!ip.isempty()&& ip.peek() != '(')
                      {
                        result.append(ip.pop());
                      }
                    ip.pop();
              }
           else
                 { 
            while(!ip.isempty()&& (prec(s.charAt(i)) < prec(ip.peek()) || prec(s.charAt(i))==prec(ip.peek()) &&asso(s.charAt(i))=='L'))
                {
                  result.append(ip.pop());
               }
                ip.push(c);
              }
            }
             while(!ip.isempty())
             {
                 result.append(ip.pop());
             }
            System.out.println(result);
          }  
public static void main(String args[])
{
 infix2post i2p=new infix2post();
 Scanner sc=new Scanner (System.in);
 System.out.println("Enter infix Expresiion");
 String exp=sc.nextLine();
 infixtopostfix(exp);
}}
