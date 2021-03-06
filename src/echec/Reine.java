package echec;

import java.util.ArrayList;
import java.util.List;

public class Reine extends Piece implements Mouvement{

	public Reine(int x, int y, Couleur c) {
		super(x, y, c);
		// TODO Auto-generated constructor stub
	}
	public
	List<Position> getMouvementPossible() {  //renvoi les cases de d�placement du fou
		//mouvementPossible.clear();
		List<Position> mouvementPossible = new ArrayList<Position>();
		int x=position.getX();
		int y=position.getY();
		Fou ftemp = new Fou(x,y);
		Tour Ttemp = new Tour(x,y, false); //mettre le 1er tour � faux
		
		
		mouvementPossible.addAll(ftemp.getMouvementPossible());	
		mouvementPossible.addAll(Ttemp.getMouvementPossible());

	
		
		
		return mouvementPossible;
	}
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[reine "+super.position.getX()+","+super.position.getY()+"]" ;
	}
	

}
