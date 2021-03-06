package echec;

import java.util.*;

public class Pion extends Piece implements Mouvement {

	
	public boolean _1erTour;
	
	
	public Pion(int x, int y, Couleur c) {
		super(x, y, c);
		_1erTour=true;
	}
	
	

	@Override
	public boolean bouger(Position pos) {
		// TODO Auto-generated method stub
		boolean temp=super.bouger(pos);
		if (temp )
			_1erTour=false;
		return temp;
		
	}



	@Override
	public
	List<Position> getMouvementPossible() {  //renvoi les cases de déplacement du pion 
		//mouvementPossible.clear();
		int x=position.getX();
		int y=position.getY();
		List<Position> mouvementPossible = new ArrayList<Position>();
		
		mouvementPossible.addAll(aCote());
		
		if(this.getCouleur().equals(Couleur.WHITE)  )	//si la piece est blanche elle monte
		{
			Position temp1=new Position(x,y+1);
			if (temp1.inBounds() && !this.bloqueAmi(temp1)&& !this.bloqueEnnemi(temp1))
				mouvementPossible.add(temp1.clone());
			
			Position temp2=new Position(x,y+2);
			if(_1erTour && !this.bloqueAmi(temp2)&& !this.bloqueEnnemi(temp1))		////règle du premier tour
				mouvementPossible.add(temp2.clone());
		}
		
		
		if(this.getCouleur().equals(Couleur.BLACK))	//si la piece est noir elle descend
		{
			Position temp1=new Position(x,y-1);
			if(temp1.inBounds() && !this.bloqueAmi(temp1)&& !this.bloqueEnnemi(temp1))
				mouvementPossible.add(temp1.clone());
			else if(this.bloqueAmi(temp1)) 
				return mouvementPossible;
			
			Position temp2=new Position(x,y-2);
			if(_1erTour && !this.bloqueAmi(temp2)&& !this.bloqueEnnemi(temp1))		//règle du premier tour +1 case
				mouvementPossible.add(temp2.clone());
			
			//rajouter mange par coté
			
			
		}
		
		
		return mouvementPossible;
	}
	
	
	
	//  		A changer si possible repetition inutile
	
	private List<Position> aCote()		//regarde si une piece se trouve a coté 
	{
		List<Position> mouvementPossible = new ArrayList<Position>();
		
		
		if( this.getCouleur().equals(Couleur.WHITE))		//si la piece est blanche
		{
			for (Piece other: Piece.getBlackPiece())		
			{
				if(position.getY()-other.position.getY()==-1)					// si un piece se trouve sur la colonne devant 
				{					
					if(Math.abs(position.getX()-other.position.getX())==1)	//si la distance horizontal entre 2 piece est de 1
					{
						int x=other.position.getX();
						int y=other.position.getY();
						Position temp1=new Position(other.position.getX(),y);		//prend sa position
						mouvementPossible.add(temp1);			// ajout aux mouvement possibles 
						
						
					}
					
				}
			}
		}
		
		if( this.getCouleur().equals(Couleur.BLACK))		//si la piece est noir
		{
			for (Piece other: Piece.getWhitePiece())		
			{
				if(position.getY()-other.position.getY()==1)				// si un piece se trouve sur la ligne au dessous
				{
					if (Math.abs(position.getX()-other.position.getX())==1)		// et collé à la piece actuelle en x
					{
						int x=other.position.getX();
						int y=other.position.getY();
						Position temp1=new Position(other.position.getX(),y);
						mouvementPossible.add(temp1.clone());
						
					}
				}
			}
		}
		return mouvementPossible;
	}


	
	@Override
	public String toString() {
		return "[pion "+super.position.getX()+","+super.position.getY()+"]" ;
	}
	/*
	public void Promotion()
	{
			int ytarget;
			if (this.couleur.equals(Couleur.WHITE))
				ytarget=8;
			else
				ytarget=1;
			
			
			if(position.getY()==ytarget)
			{
				Scanner entree = new Scanner(System.in);
				System.out.println("changer en quelle pièce ? (entrée en toute lettre)");
				String x=".";
				do{
						
					do{
						x = entree.nextLine();
						System.out.println(x);
					}
					while(!(x.equals("reine")||x.equals("tour")||
							x.equals("fou")||x.equals("cavalier")));
					x=x.toLowerCase();

					System.out.println(x);
					System.out.println(x.equals("tour"));
					if(x.equals("tour"))
					{
						Tour t=new Tour (position.getX(),position.getY(),this.couleur);

						this.destroy();
						
					}
					else if(x.equals("reine"))
					{
						this.destroy();
						Reine t=new Reine (position.getX(),position.getY(),this.couleur);
					}
					else if(x.equals("fou"))
					{
						this.destroy();
						Fou t=new Fou (position.getX(),position.getY(),this.couleur);
					}
					else if(x.equals("cavalier"));
					{
						this.destroy();
						Cavalier t=new Cavalier (position.getX(),position.getY(),this.couleur);
					}
				}while (!x.equals("tour")&& !x.equals("fou") && !x.equals("reine")&& !x.equals("cavalier"));
				
				entree.close();
			}
		}
		*/
	
	
	
}
