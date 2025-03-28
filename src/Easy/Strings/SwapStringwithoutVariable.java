package Easy.Strings;

class SwapStringwithoutVariable
{     
    public static void main(String args[]) 
    { 
    	String a = "Logitech";
    	String b = "Mouse";
    	
    	System.out.println("a = " + a + " and b = " + b);
    	
    	
    	a = a + b; // a -> LogitechMouse
    	
    	b = a.substring(0, a.length() - b.length()); // b(0, 13 - 5) -> b(0, 8) -> b -> Logitech
    	
    	a = a.substring(b.length()); // start from a(8) -> a -> Mouse
    	
    	System.out.println("a = " + a + "and b = " + b);
    }     
} 
