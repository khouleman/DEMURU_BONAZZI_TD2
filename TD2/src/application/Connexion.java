package application;
import java.sql.*;
import java.util.Scanner;
	
		public class Connexion {
			
			public static Connection creeConnexion() {
			
				String url =
				"jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/demuru1u_cpoa2020";
				url += "?serverTimezone=Europe/Paris";
				String login = "demuru1u_appli";
				String pwd = "Derepskr123";
				Connection maConnection = null;
			
				try {
					maConnection = DriverManager.getConnection(url, login, pwd);
				} catch (SQLException sqle) {
					System.out.println("Erreur connexion" + sqle.getMessage());
				}
				
				return maConnection;
				
			}
			
			public void uneRequete() {
				try {
					Connection laConnexion = creeConnexion();
					Statement requete = laConnexion.createStatement();
					ResultSet res = requete.executeQuery("select titre, titre from Categorie");
					while (res.next()) {
						String nom = res.getString("titre");
						System.out.println(nom);
					}
				
					
					if (res != null)
						res.close();
					if (requete != null)
						requete.close();
					if (laConnexion != null)
						laConnexion.close();
					
				} catch (SQLException sqle) {
						System.out.println("Pb dans select " + sqle.getMessage());
						} 		 
				 
			}
			public static void main(String[] args) {
				@SuppressWarnings("resource")
				Scanner scanner=new Scanner(System.in);
				System.out.println("choisissez une table");
				System.out.println("1:Catégorie 2:Produit 3:Client");
				int partie = scanner.nextInt();
				
		// Classe Categorie
				
				if (partie==1) {
					System.out.println("Catégorie");
					System.out.println("Choisissez une action");
					System.out.println("1:Ajouter 2:Modifier 3:Supprimer 4:Liste des categories");
					int p=scanner.nextInt();
					if(p==1) {
						System.out.println("Ajouter");
						System.out.println("idCategorie=");
						int id=scanner.nextInt();
						System.out.println ("titre=");
						String titre=scanner.next();
						System.out.println ("visuel=");
						String visuel=scanner.next();
						 Categorie.addCategory(id, titre, visuel);
							}
					else if (p==2) {
						System.out.println("Modifier");
						System.out.println("Ajouter");
						System.out.println("idCategorie=");
						int id=scanner.nextInt();
						System.out.println ("titre=");
						String titre=scanner.next();
						System.out.println ("visuel=");
						String visuel=scanner.next();
						Categorie.modifyCategory(id, titre, visuel);
					}
					else if (p==3) {
						System.out.println("Supprimer");
						System.out.println("Modifier");
						System.out.println("Ajouter");
						System.out.println("idCategorie=");
						int id=scanner.nextInt();
						Categorie.deleteCategory(id);
					}
					else if(p==4){
						System.out.println("Liste des categories:");
						Categorie.afficheCateg();
					}
					else{
						System.out.println("Réessayez");
					}
				}
				
				
		// Classe Produit
				
				else if(partie==2) {
					System.out.println("Produit");
					System.out.println("Choisir une méthode");
					System.out.println("1:Ajouter 2:Modifier 3:Supprimer 4:Liste des produits");
					int p=scanner.nextInt();
					if(p==1) {
						System.out.println("Ajouter");
						System.out.println("idProduit=");
						int id=scanner.nextInt();
						System.out.println ("nom=");
						String nom=scanner.next();
						System.out.println ("description=");
						String description=scanner.next();
						System.out.println ("tarif=");
						float tarif=scanner.nextFloat();
						System.out.println ("visuel=");
						String visuel=scanner.next();
						System.out.println("idCategorie=");
						int idc=scanner.nextInt();
						Produit.addProduct(id, nom, description, tarif, visuel, idc);
							}
					else if(p==2) {
						System.out.println("Modifier");
						System.out.println("idProduit=");
						int id=scanner.nextInt();
						System.out.println ("nom=");
						String nom=scanner.next();
						System.out.println ("description=");
						String description=scanner.next();
						System.out.println ("tarif=");
						float tarif=scanner.nextFloat();
						System.out.println ("visuel=");
						String visuel=scanner.next();
						System.out.println("idCategorie=");
						int idc=scanner.nextInt();
						Produit.modifyProduct(id, nom, description, tarif, visuel, idc);
					}
					else if(p==3) {
						System.out.println("Supprimer");
						System.out.println("idProduit=");
						int id=scanner.nextInt();
						Produit.removeProduct(id);
					}
					else if(p==4) {
						System.out.println("Liste des produits:");
						Produit.afficheProduit();
					}
					else 
					{
						System.out.println("Réessayez");
					}
					
					
				}
				
		// Classe Client
				
				else if( partie==3) {
					System.out.println("Client");
					System.out.println("Choisir une méthode");
					System.out.println("1:Ajouter 2:Modifier 3:Supprimer 4:Liste des clients");
					int p=scanner.nextInt();
					if(p==1) {
						System.out.println("Ajouter");
						System.out.println("idClient=");
						int id=scanner.nextInt();
						System.out.println ("nom=");
						String nom=scanner.next();
						System.out.println ("prenom=");
						String prenom=scanner.next();
						System.out.println ("identifiant=");
						String iden=scanner.next();
						System.out.println ("mot de passe=");
						String mode=scanner.next();
						System.out.println("adrNumero=");
						String adr=scanner.next();
						System.out.println ("adrVoie=");
						String adr_voie=scanner.next();
						System.out.println ("adr_Code_Postal=");
						String adr_code_postal=scanner.next();
						System.out.println ("adrVille=");
						String adr_ville=scanner.next();
						System.out.println ("adrPays=");
						String adr_pays=scanner.next();
						Client.addClient(id, nom, prenom, iden, mode, adr, adr_voie, adr_code_postal, adr_ville, adr_pays);
							}
					else if(p==2) {
						System.out.println("Modifier");
						System.out.println("idClient=");
						int id=scanner.nextInt();
						System.out.println ("nom=");
						String nom=scanner.next();
						System.out.println ("prenom=");
						String prenom=scanner.next();
						System.out.println ("identifiant=");
						String iden=scanner.next();
						System.out.println ("mot de passe=");
						String mode=scanner.next();
						System.out.println("adr_numero=");
						String adr=scanner.next();
						System.out.println ("adr_voie=");
						String adr_voie=scanner.next();
						System.out.println ("adr_code_postal=");
						String adr_code_postal=scanner.next();
						System.out.println ("adr_ville=");
						String adr_ville=scanner.next();
						System.out.println ("adr_pays=");
						String adr_pays=scanner.next();
						Client.modifyClient(id, nom, prenom, iden, mode, adr, adr_voie, adr_code_postal, adr_ville, adr_pays);
							}
					else if (p==3) {
						System.out.println("Supprimer");
						System.out.println("idClient=");
						int id=scanner.nextInt();
						Client.removeClient(id);
					}
					else if(p==4)
					{
						System.out.println("Liste des clients:");
						Client.afficheClient();
					}
					else {
						System.out.println("Réessayez");
					}
				}
				
				
				else {
					System.out.println("Réessayez");
				}
			}
	}





