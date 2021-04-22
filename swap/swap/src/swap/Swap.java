
package swap;
import java.util.Random;
public class Swap {
	    static String swap(String str, int i, int j) 
	    { 
	    	char aux;
	    	char[] strc = str.toCharArray();
	    	
	    	aux = strc[i];
	    	strc[i] = strc[j];
	    	strc[j] = aux;
	    	
	    	return new String(strc);	    	
	    } 
	public static void main(String[] args) {
		 Random rand = new Random(); 
		 String s = "NocheLarga"; 
		 String animales[ ] = {"PERRO","GATO","CONEJO","PEZ","VACA","GALLO","SAPO","DELFIN","TIGRE","LEON","CEBRA","PANDA","KOALA","RATON"};
		 String r_animales[] = new String[animales.length];
		 
		 for(int i = 0; i < r_animales.length; i++)
		 { 
		        int rand_int = rand.nextInt(animales[i].length() - 1 ); 
		        int rand_int2 = rand.nextInt(animales[i].length() - 1 ); 
		        
		        while(rand_int == rand_int2) {
		        	rand_int2 = rand.nextInt(animales[i].length() - 1 );
		        }
					 r_animales[i] = swap(animales[i], rand_int, rand_int2);      
		 }

		 for(String w: r_animales) {
			 System.out.println(w);  	
		 } 
	}
}
