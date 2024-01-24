package flowcontrol.forloop;

public class AlphabetTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 for(int i=65; i<=122; i++){
			 if (i >= 91 && i<= 96) {
				 break;
			 }
				 
				 
			 char ch = (char) i ;
             System.out.println(i + " = " + ch);
        }

	}

}
