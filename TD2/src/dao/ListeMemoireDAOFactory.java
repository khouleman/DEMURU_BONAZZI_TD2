package dao;

import ListeMemoire.ListeMemoireCategorieDAO;
import ListeMemoire.ListeMemoireClientDAO;
import ListeMemoire.ListeMemoireCommandeDAO;
import ListeMemoire.ListeMemoireLigneCommandeDAO;
import ListeMemoire.ListeMemoireProduitDAO;

public class ListeMemoireDAOFactory extends DAOFactory {

	@Override
	public CategorieDAO getCategorieDAO() {
		return ListeMemoireCategorieDAO.getInstance();
	}

	@Override
	public ClientDAO getClientDAO() {
		return ListeMemoireClientDAO.getInstance();
	}

	@Override
	public CommandeDAO getCommandeDAOO() {
		return ListeMemoireCommandeDAO.getInstance();
	}

	@Override
	public LigneCommandeDAO getLigneCommandeDAO() {
		return ListeMemoireLigneCommandeDAO.getInstance();
	}
	@Override
	public ProduitDAO getProduitDAO() {
		return ListeMemoireProduitDAO.getInstance();
	}

}
