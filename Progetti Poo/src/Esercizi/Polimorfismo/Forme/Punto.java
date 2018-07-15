package Esercizi.Polimorfismo.Forme;

public class Punto implements Forma {
	private int x,y;
	
	public Punto (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(obj.getClass() == Cerchio.class && ((Cerchio)obj).getRaggio() == 0 &&
				((Cerchio)obj).getRiferimento().equals(this))
			return true;
		if(obj.getClass() == Rettangolo.class && 
				( ((Rettangolo)obj).getAltezza() == 0 || ((Rettangolo)obj).getBase() == 0 ) &&
				((Rettangolo)obj).getRiferimento().equals(this))
			return true;
		if(this.getClass() != obj.getClass()) return false;
		Punto that = (Punto)obj;
		return this.getX() == that.getX() && this.getY() == that.getY();
	}
	
	@Override
	public int hashCode() {
		return this.getX() + this.getY();
	}

	@Override
	public void trasla(int deltaX, int deltaY) {
		this.setX(this.getX() + deltaX);
		this.setY(this.getY() + deltaY);
	}
}