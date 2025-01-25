import static java.lang.System.nanoTime;

public class Reg{

public static void main(String args[]){

   
long a = System.nanoTime();
long year = 1981;
long  random_year = a % 44;
 year = year + random_year;
System.out.println(year);

String arr[] =  {"BIT","BCS","BME","BIN","BPR","BEL","BEX","BTR","BCE","BIM"};
 int random_arr = (int)a % 10;
System.out.println(arr[random_arr]);

