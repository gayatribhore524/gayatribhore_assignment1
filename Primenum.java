class Primenum
{
public static void main(String[] args)
{
int num=Integer.parseInt(args[0]);
int flag=0;
for(int j=2;j<num;j++)
{
if(num%j==0)
{
System.out.println(num+"is not prime number");
flag=1;
break;
}
}
if(flag==0)
System.out.println(num +"is prime number");
}
}