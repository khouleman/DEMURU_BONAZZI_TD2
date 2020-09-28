package metier;

import java.sql.Date;
import java.time.LocalDate;


public class MCommande {
	private int idCommande;
	private int idClient;
	private Date dateCommande;
	

public MCommande(LocalDate dateCommande,int idClient) {
	this(-1,dateCommande,idClient);
}
	public MCommande(int idCommande,Date dateCommande,int idClient) {
		this.setId(idCommande);
		this.setdateCommande1(dateCommande);
		this.setidClient(idClient);
	}
	
	public MCommande(int idCommande,String dateCommande,int idClient) {
		this.setId(idCommande);
		this.setdateCommande2(dateCommande);
		this.setidClient(idClient);
	}
	public MCommande(int idCommande,LocalDate dateCommande,int idClient) {
		this.setId(idCommande);
		this.setdateCommande3(dateCommande);
		this.setidClient(idClient);
	}

	public MCommande(int id) {
		this.setId(id);
		}
	public int getId() {
		return idCommande;
	}

	public void setId(int idCommande) {
		this.idCommande = idCommande;
	}

	public int getidClient() {
		return idClient;
	}

	public void setidClient(int idClient) {
		this.idClient = idClient;
	}

	public Date getdateCommande() {
		return dateCommande;
	}

	public void setdateCommande1(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	public void setdateCommande2(String dateCommande) {
		this.dateCommande = java.sql.Date.valueOf(dateCommande);
	}
	public void setdateCommande3(LocalDate dateCommande) {
		this.dateCommande = java.sql.Date.valueOf(dateCommande);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MCommande other = (MCommande) obj;
		if (dateCommande == null) {
			if (other.dateCommande != null)
				return false;
		} else if (!dateCommande.equals(other.dateCommande))
			return false;
		if (idClient != other.idClient)
			return false;
		if (idCommande != other.idCommande)
			return false;
		return true;
	}
	
	
}

