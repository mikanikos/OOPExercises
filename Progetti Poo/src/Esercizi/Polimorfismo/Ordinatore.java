package Esercizi.Polimorfismo;

public class Ordinatore {

	public static void ordina(Comparabile[] lista){
		int imin;
		for (int ord=0; ord<lista.length-1; ord++){
			imin = ord;
			for (int i=ord+1; i<lista.length; i++)
				if (lista[i].minoreDi(lista[imin])){
					Comparabile temp=lista[i];
					lista[i]=lista[imin];
					lista[imin]=temp;
				}
		}
	}

	public static int ricercaBinaria(Comparabile[] v, Comparabile cercato) {
		ordina(v);
		int pos=-1,sx=0,dx=v.length,centro;
		while (sx<dx) {
			centro = (sx+dx)/2;
			if (v[centro].compara(cercato)==0)
				return centro;
			else {
				if (cercato.compara(v[centro])==-1)
					dx = centro;
				else
					sx = centro+1;
			}
		}
		return pos;
	}
}
