import java.io.*;//needed for BufferedReader, InputStreamReader, etc.
/**A java program that displays the calendar of any year. 
*/
public class Calendar
{
//program execution starts here.
public static void main(String []args)throws IOException
{
//First creating a single shared BufferedReader for keyboard input
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader st=new BufferedReader(in);
//prompting the user
System.out.println("Which year's Calendar do you want");
int y=Integer.parseInt(st.readLine());//reading line of integer from the user
int d=0,r,day=5;//declared and initialised necessary variables
String mon[]={"January","February","March","April","May","June","July","August","September","October","November","December"}; 
int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
int a=Math.min(y,2015);
int b=Math.max(y,2015);
for(int i=a;i<b;i++)//for loop to calculate the no. of days between 1st Jan 2015 and 1st day of the given year.
{
if(i%4==0)//if the year being considered here is a leap year
d=d+2;
else
d++;
}
d=d%7;
if(y==a)//if the given year is in the past 
r=-1;
else//else if it is in the future from 2015.
r=1;
for(int i=0;i<d;i++)//for loop to calculate the day on the 1st Jan of the given year
{
day=day+r;
if(day>7)
day=1;
else if(day<1)
day=7;
}
day--;
if(y%4==0 && (y%100!=0 || y%400==0))//if the given year is a leap year
days[1]++;//the no. of days in february is increased by one
System.out.println("      Calendar "+y);
for(int i=0;i<12;i++)//for loop to display the months of the year
{
System.out.println("        "+mon[i]);
System.out.println("Sun Mon Tue Wed Thu Fri Sat");
for(int j=0;j<day;j++)//for loop to arrange the pattern
{
System.out.print("    ");
}
for(int j=1;j<=days[i];j++)//for loop to display the dates
{
if(j<10)
System.out.print("0");
System.out.print(j+"  ");
day++;
day=day%7;
if(day==0)//changing the line at the end of each week
System.out.println();
}
System.out.println();
}
System.out.println("\n Best of luck for "+(y+1)+"!!!");
}//End of main().
}//End of program.























