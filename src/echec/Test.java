 package echec;

//import org.junit.jupiter.api.Test;

public class Test {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Joueur j1=new Joueur ("jean",Couleur.WHITE);
		 * 
		 * P
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * @Test
	public void pionDeclaration() throws Exception
	{
		Pion p1 = new Pion(5,5,Couleur.WHITE);
		assertEquals(p1.position.getX(),5);
		 getY
		couleur=couleur.white
		assertequal(Piece.tabpiece.length(),1);
	
	
	
	}
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		Pion p1 = new Pion(5,5,Couleur.WHITE);	//pion(x,y,couleur)
		Pion p2 = new Pion(5,5,Couleur.BLACK);
		Pion p3 =new Pion(6,6,Couleur.BLACK);
		Pion p4 =new Pion(4,6,Couleur.BLACK);
		
		
		@test 
		public void tdc () 
		 for Position count:p1.getMouvementPossible()
		 	
		
		
		System.out.println(p1.getMouvementPossible());
		System.out.println(p2.getMouvementPossible());
		System.out.println(p3.getMouvementPossible());
		System.out.println(p4.getMouvementPossible());
		
		
		
		
		System.out.println(Piece.tabPiece);
		
		*/
			// les deplacements basiques des pions fonctionnent + manger piece de cot�
		
		/*
		
		Fou f1= new Fou(5,5,Couleur.WHITE);
		System.out.println(f1.getMouvementPossible());
		System.out.println(Piece.tabPiece);
		
		
		Tour t1 = new Tour(5,5,Couleur.WHITE);
		System.out.println(t1.getMouvementPossible());
		System.out.println(Piece.tabPiece);
		
		
		Reine r1 = new Reine(5,5,Couleur.WHITE);
		System.out.println(r1.getMouvementPossible());
		System.out.println(Piece.tabPiece);
		*/
			//deplacements basiques tour,fou,reine dans le plateau ok
		
		
		/*
		Roi ro1= new Roi (5,5,Couleur.WHITE);
		Roi ro2= new Roi (8,5,Couleur.WHITE);
		Pion p = new Pion(6,5,Couleur.WHITE);
		
		
		System.out.println(ro1.getMouvementPossible());
		System.out.println(ro2.getMouvementPossible());
		System.out.println(Piece.tabPiece);

		
		Position test=new Position(4,5);
		System.out.println(ro1.bloqueAmi(test));
		
			test deplacements roi + bloquage ami pas de blocage ennemi a mettre
		*/
		/*
		Pion p3 =new Pion(6,6,Couleur.BLACK);
		Pion p4 =new Pion(6,5,Couleur.WHITE);
		Pion p5 =new Pion(5,5,Couleur.WHITE);
		System.out.println(p3.getMouvementPossible());
		*/
			//bloquage ami et ennemie pion + mange cot� ok
		
		
		/*
		Fou f1= new Fou(5,5,Couleur.WHITE);
		Pion p1= new Pion(7,7,Couleur.WHITE);
		Pion p2= new Pion(3,3,Couleur.BLACK);
		System.out.println(f1.getMouvementPossible());
		*/
			// bloquage ami et ennemie du fou ok     
			
		/*
		Cavalier c1 = new Cavalier(5,5,Couleur.WHITE);
		Pion p1= new Pion(7,6,Couleur.WHITE);
		System.out.println(c1.getMouvementPossible());
		*/
			//mouv cavalier fini
		/*
		Tour t1 = new Tour(5,5,Couleur.WHITE);
		Pion p1= new Pion(6,5,Couleur.WHITE);
		Pion p2= new Pion(4,5,Couleur.BLACK);
		System.out.println(t1.getMouvementPossible());
		*/ 	
			//blocage tour ok
		/*
		Reine r1 = new Reine(5,5,Couleur.WHITE);
		Pion p1= new Pion(6,5,Couleur.WHITE);
		Pion p2= new Pion(4,5,Couleur.BLACK);
		System.out.println(r1.getMouvementPossible());
		*/
			//blocage reine ok  
		
		//blocage fini toutes pieces
		
		//Partie p = new Partie("jean","pierre");
		//p.debutTour();
		/*System.out.println(Piece.tabPiece);
		Position pos=new Position(1,2);
		p.listeJoueurs.get(0).bougerT1(pos);
		System.out.println(Piece.tabPiece.get(0).position);
		System.out.println(pos);
		System.out.println(pos.equals(Piece.tabPiece.get(0).position));
		System.out.println(p.listeJoueurs.get(0).bougerT1(pos));
		System.out.println(p.listeJoueurs.get(0).tab);
		
		*/
		

		/*
		Position pos=new Position(6,6);
		Pion p1= new Pion(6,5,Couleur.WHITE);

		Piece.updateAll();
		
		System.out.println(p1.getMouvementPossible());
		System.out.println(p1.mouvementExecutable);
		System.out.println(p1.bouger(pos));
		System.out.println(Piece.getWhitePiece());
		System.out.println(p1._1erTour);*/
		
		//System.out.println(Piece.getWhitePiece().subList(0, Piece.getWhitePiece().size()));
		
		

		Partie p = new Partie("jean","pierre");
		
		while (!p.fini)
			p.debutTour();
		
		
		
		/*
		Position pos=new Position(5,6);
		Reine r2=new Reine (5,8,Couleur.BLACK);
		System.out.println(r2.bouger(pos));
		System.out.println(r2.getMouvementPossible());
		
		*/
		/*
		Reine r2=new Reine (5,8,Couleur.BLACK);
		System.out.println(r2.getCouleur().toString());
		
		String coul=r2.getCouleur().toString();
		coul=coul.substring(0,1).toLowerCase();
		System.out.println(coul);
		*/
		
		
		
	}
}
