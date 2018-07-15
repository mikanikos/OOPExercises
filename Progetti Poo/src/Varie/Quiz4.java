package Varie;

import java.util.*;

abstract class Vegetale1 {
	public String cresceIn() { return "..."; }
}

class Cactus extends Vegetale1 {
	public String cresceIn() { return "deserto"; }
}

class Albero extends Vegetale1 {
	public String cresceIn() { return "bosco"; }
}

class Pero extends Albero {
	public String cresceIn() { return "frutteto"; }
}

public class Quiz4 {
	public static void main(String args[]) {
		List<Vegetale1> vegetali = new ArrayList<Vegetale1>();
		Vegetale1 v = null;
		Albero a = new Albero();
		Vegetale1 vc = new Cactus();
		Albero ap = new Pero();
		Pero p = new Pero();
		v = a;
		vegetali.add(v);
		v = vc;
		vegetali.add(v);
		v = ap;
		vegetali.add(v);
		v = p;
		vegetali.add(v);
		for(Vegetale1 animale : vegetali)
			System.out.print(animale.cresceIn()+" ");
	}
}