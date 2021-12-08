package com.comassky.dauna.dto;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvNumber;

public class HelloAssoCsv {

	@CsvBindByPosition(position = 11)
	private int numero;

	@CsvBindByPosition(position = 0)
	private String dateAchat;

	//@CsvBindByName(column = "Email acheteur")
	@CsvBindByPosition(position = 1)
	private String emailAcheteur;

	//@CsvBindByName(column = "Nom")
	@CsvBindByPosition(position = 2)
	private String nom;

	//@CsvBindByName(column = "Prénom")
	@CsvBindByPosition(position = 3)
	private String prenom;

	@CsvBindByPosition(position = 4)
	//@CsvBindByName(column = "Status")
	private String status;

	@CsvBindByPosition(position = 5)
	//@CsvBindByName(column = "Tarif")
	private String tarif;

	@CsvBindByPosition(position = 6)
	//@CsvBindByName(column = "Montant (€)")
	@CsvNumber("#0,00")
	private float montant;

	@CsvBindByPosition(position = 7)
	//@CsvBindByName(column = "Code Promo")
	private String codePromo;

	@CsvBindByPosition(position = 8)
	//@CsvBindByName(column = "Url billet")
	private String urlBillet;

	@CsvBindByPosition(position = 9)
	//@CsvBindByName(column = "Champ complémentaire 1\n" +
	//		"Numéro de téléphone")
	private String telephone;

	@CsvBindByPosition(position = 10)
	//@CsvBindByName(column = "Champ complémentaire 2\n" +
	//		"Adresse email")
	private String emailBis;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(String dateAchat) {
		this.dateAchat = dateAchat;
	}

	public String getEmailAcheteur() {
		return emailAcheteur;
	}

	public void setEmailAcheteur(String emailAcheteur) {
		this.emailAcheteur = emailAcheteur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTarif() {
		return tarif;
	}

	public void setTarif(String tarif) {
		this.tarif = tarif;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public String getCodePromo() {
		return codePromo;
	}

	public void setCodePromo(String codePromo) {
		this.codePromo = codePromo;
	}

	public String getUrlBillet() {
		return urlBillet;
	}

	public void setUrlBillet(String urlBillet) {
		this.urlBillet = urlBillet;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmailBis() {
		return emailBis;
	}

	public void setEmailBis(String emailBis) {
		this.emailBis = emailBis;
	}
}
