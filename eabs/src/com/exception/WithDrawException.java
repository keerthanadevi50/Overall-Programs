package com.exception;

	class WithDrawException extends Exception
	{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public WithDrawException()
		{
		super("Balance is nof Sufficient"); 
		}
		//It will be displayed when getMessage() will be called
		
		
		public String toString() //When we print exception object 
		{
		return "Balance is not sufficient";
		}
	}



