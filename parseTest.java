import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.junit.jupiter.api.Test;

class parseTest {

	@Test
	void test() throws FileNotFoundException, IOException {
		String[] en = new String[] {"A","a", "B", "b", "C", "c", "D", "d", "E", "e", "F", "f", "G","g","H", "h",
				"I","i","J","j","K","k","L","l","M","m", "N","n","O","o","P","p","Q","q","R","r","S"
				,"s","T","t","U","u","V","v","W","w","X","x","Y","y","Z","z"};
		
		String[] es = new String[] {"A", "a", "B" ,"b", "C" , "c", "D" , "d", "E", "e", "F", "f", "G", "g",
				"H" ,"h", "I", "i", "J", "j", "K", "k", "L", "l", "LL", "ll",
				"M" , "m", "N", "n","ñ", "O", "o", "P", "p", "Q", "q", "R", "r", "RR", "rr", "S", "s", "T", "t", "U" ,"u", "V", "v", "W", "w", "X", "x", "Y", "y", "Z", "z"};
		
		ArrayList<String> actual1 = parse.parse_lang("en");
		ArrayList<String> actual2 = parse.parse_lang("es");
		Random random = new Random();
		
	
		
		assertEquals(en[0], actual1.get(0));
		assertEquals(en[en.length-1], actual1.get(actual1.size()-1));
		
		assertEquals(es[0], actual2.get(0));
		assertEquals(es[es.length-1], actual2.get(actual2.size()-1));
		
		int r = random.nextInt(51);
		assertEquals(en[r], actual1.get(r));
		assertEquals(es[r], actual2.get(r));
		
		r = random.nextInt(51);
		assertEquals(en[r], actual1.get(r));
		assertEquals(es[r], actual2.get(r));
		
		r = random.nextInt(51);
		assertEquals(en[r], actual1.get(r));
		assertEquals(es[r], actual2.get(r));
		
	}
	
}
