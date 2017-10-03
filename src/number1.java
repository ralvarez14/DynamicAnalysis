public class number1{
    public static void main(String[] args){
	System.out.println("Welcome reverser. Recently I discovered that a malicious mad scientist");
	System.out.println("will release the T-virus into the world. Our only hope is to release");
	System.out.println("the triggering mechanism by entering a 5 passphrase sequence. The world is in danger");
	System.out.println("unless you (yes, you, the cs5375 student) discover the 5 passphrases before");
	System.out.println("all of the earth is taken over by flesh eating zombies ... :( ");
       
        // call the first tirgger
        trigger1(args[0]);
}
    
    // executes the first trigger
    public static void trigger1(String input){
	boolean c = false;
        boolean s = false;
        boolean exclamation = false;
        // do the iteration part
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == 'c')
                c = true;

            if(input.charAt(i) == 's')
                s = true;

            if(input.charAt(i) == '!')
                exclamation = true;
        }
        // print out the tigger diffuesed if a c && s found
        if(c && s && !exclamation){
            System.out.println(" Trigger 1 diffused ");
        }
	// Print out "wrong password". Kill code
        else{
            System.out.println(" Wrong! ");
	    System.exit(1);
        }
    }
}

