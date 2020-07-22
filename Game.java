import java.util.Scanner;
import java.util.*;
public class Game
{
public static void main(String args[])
{
Scanner sn= new Scanner(System.in);
int num=45;
int count=0;
int guess=0;
int guesses=0;
do
{
System.out.println("guess what no. I have?");
guess=sn.nextInt();
guesses++;
if(num>guess)
{
System.out.println("to low,try again");
}
else if(num<guess)
{
System.out.println("to high,try again?");
}
else
{
 System.out.println("you are right ,the number is"+num);
 System.out.println("you gueesed"+ guesses +"times");
}
}while (guess != num);
}  
}
