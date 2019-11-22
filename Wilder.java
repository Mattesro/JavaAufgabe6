class Wilder 
{
    	// 2. attributes String
    	private String firstname;
    	private boolean present;

    	// 3. constructor
    	public Wilder(String firstname, boolean present) 
	{
        	this.firstname = firstname;
        	this.present = present;
    	}
    	
	// 4.1 getters
    	public String getfirstname() 
	{
        	return this.firstname;
    	}
    	public boolean getpresent() 
	{
        	return this.present;
    	}
    	
	// 4.2 setters
    	public void setfirstname(String firstname) 
	{
        	this.firstname = firstname;
    	}
        public void setpresent(boolean present) 
	{
        	this.present = present;
    	}
    	
	// 5. whoAmI() method
    	public String whoAmI() 
	{
		if (this.present) 
		{ 
			return "My name is " + this.firstname + " and I am present";
		} else { 
			return "My name is " + this.firstname + " and I am not present";
		}
	}
}

