package Esercizi.Collezioni.Map;

import java.util.*;

/* Dove è l'errore? */
public class Esercizio {

	public Map<String, Integer> countWordOccurrences(String text){
		Map<String, Integer> word2count = new HashMap<>(); 
		Scanner scanner = new Scanner(text);
		while (scanner.hasNext()) {
			String word = scanner.next();
			Integer count = word2count.get(word);
			if(count == null)
				count = 1;
			else
				count++;
			word2count.put(word, count);
		}
		return word2count;
	}

	public static void main(String[] args) {
		Esercizio a = new Esercizio();
		Map<String, Integer> map = a.countWordOccurrences("ciao ciao mi chiamo andrea e dico ciao");
		for (Map.Entry<String, Integer> i : map.entrySet()) {
			System.out.println("Key = " + i.getKey());
			System.out.println("Value = " + i.getValue());
		}
	}
}

/* una volta compilato è equivalente a questo
public Map<String, Integer> countWordOccurrences(String text){
	Map<String, Integer> word2count = new HashMap<>(); 
	Scanner scanner = new Scanner(text);
	while (scanner.hasNext()) {
		String word = scanner.next();
		int count = word2count.get(word).intValue();
		if (count==0) {
			count = 1;
		}
		else {
			count = count + 1;
		}
		word2count.put(word, new Integer(count));
	}
	return word2count;
}
 */