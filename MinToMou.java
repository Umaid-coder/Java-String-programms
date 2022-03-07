import  java.util.*;
  
  class  MinToMou
   {
    public  static void  main ( String  mithi [])
	{
	Scanner  sc = new  Scanner  ( System.in);
	System.out.println( " enter  the  value  of  Month " );
	double  Mon = sc.nextDouble();
	System.out.println( " enter  the  value  of  Minute");
	 double  Min= sc.nextDouble();
	 System.out.println( " Month = " + Mon*60*60*24*30 + "Minutes" );
	 System.out.println( " Minute = "  + Min/60*60*24*30 + "Month" );
	 }
}