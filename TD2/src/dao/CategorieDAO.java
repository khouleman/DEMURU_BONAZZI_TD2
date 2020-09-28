package dao;

import java.util.ArrayList;

import metier.MCategorie;

public interface CategorieDAO extends DAO<MCategorie> {
	
public abstract ArrayList<MCategorie> getByIdTitreVisuel(int id, String t, String v) throws Exception;
}
