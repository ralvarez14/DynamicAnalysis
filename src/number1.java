public class number1{
    public static void main(String[] args){
	String input = args[0];
	boolean c = false;
	boolean s = false;
        boolean exclamation = false;
        
	for(int i = 0; i < input.length(); i++){
	    if(input.charAt(i) == 'c')
		c = true;
	    
	    if(input.charAt(i) == 's')
		s = true;
	    
	    if(input.charAt(i) == '!')
		exclamation = true;
	}
	
	if(c && s && !exclamation){
	    System.out.println(" Trigger 1 diffused ");
	}
	else{
	    System.out.println(" Wrong! ");
	}
    }
}