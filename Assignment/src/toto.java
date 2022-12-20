public class toto {

	  public static void main(String[] args) {
		  
	    String text = "les chaussettes de l'archiduchesse sont-elles sèches ou archisèches";
	    int count = 0;
	    int index = text.indexOf("ch");
	    while (index != -1) {
	      count++;
	      index = text.indexOf("ch", index + 1);
	    }
	    System.out.println("The string \"ch\" appears " + count + " times in the text.");
	  }
	}