package com.exception;

public class Defined {

	public void withDraw(int amount)throws WithDrawException
    {
        int balance =1000;
		if((balance-amount)<500)
            throw new WithDrawException();
        else
            System.out.println("Successful Transaction");  
    }
		    public static void main(String arg[])
		    { 
		        Defined obj=new Defined();
		        
		        try
		        {
		        obj.withDraw(700);
		        }
		        catch(WithDrawException xyz)
		        {
		            //System.out.println("Exception Arised:"+xyz); 
		            System.out.println("Exception Arised"+xyz.getMessage());
		        }
		    }

			
			

	           }
                     
