package com.comassky.dauna.dto;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import com.opencsv.bean.CsvIgnore;
import com.opencsv.bean.CsvNumber;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class HelloAssoCsv {

	@CsvBindByName(column = "Numéro")
	private int numero;

	@CsvBindByName(column = "Campagne")
	private String campagne;

	@CsvBindByName(column = "Formule")
	private String formule;

	@CsvBindByName(column = "Montant inscription")
	@CsvNumber("#0,00")
	private float montant;

	@CsvBindByName(column = "Code promo")
	private String codePromo;

	@CsvBindByName(column = "Statut")
	private String statut;

	@CsvBindByName(column = "Moyen de paiement")
	private String moyenDePaiement;

	@CsvBindByName(column = "Nom")
	private String nom;

	@CsvBindByName(column = "Prénom")
	private String prenom;

	@CsvBindByName(column = "Société")
	private String societe;

	@CsvBindByName(column = "Date")
	@CsvDate("dd/MM/yyyy HH:mm:ss")
	private LocalDateTime date;

	@CsvBindByName(column = "Email")
	private String email;

	@CsvBindByName(column = "Date de naissance")
	@CsvDate("dd/MM/yyyy")
	private LocalDate dateNaissance;

	@CsvBindByName(column = "Attestation")
	private String attestation;

	@CsvBindByName(column = "Reçu")
	private String recu;

	@CsvBindByName(column = "Numéro de reçu")
	private String numeroRecu;

	@CsvBindByName(column = "Billet")
	private String billet;

	@CsvBindByName(column = "Nom acheteur")
	private String nomAcheteur;

	@CsvBindByName(column = "Prénom acheteur")
	private String prenomAcheteur;

	@CsvBindByName(column = "Adresse acheteur")
	private String adresseAcheteur;

	@CsvBindByName(column = "Code Postal acheteur")
	private String codePostalAcheteur;

	@CsvBindByName(column = "Ville acheteur")
	private String villeAcheteur;

	@CsvBindByName(column = "Pays acheteur")
	private String paysAcheteur;

	public HelloAssoCsv() {}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCampagne() {
		return campagne;
	}

	public void setCampagne(String campagne) {
		this.campagne = campagne;
	}

	public String getFormule() {
		return formule;
	}

	public void setFormule(String formule) {
		this.formule = formule;
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

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getMoyenDePaiement() {
		return moyenDePaiement;
	}

	public void setMoyenDePaiement(String moyenDePaiement) {
		this.moyenDePaiement = moyenDePaiement;
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

	public String getSociete() {
		return societe;
	}

	public void setSociete(String societe) {
		this.societe = societe;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getAttestation() {
		return attestation;
	}

	public void setAttestation(String attestation) {
		this.attestation = attestation;
	}

	public String getRecu() {
		return recu;
	}

	public void setRecu(String recu) {
		this.recu = recu;
	}

	public String getNumeroRecu() {
		return numeroRecu;
	}

	public void setNumeroRecu(String numeroRecu) {
		this.numeroRecu = numeroRecu;
	}

	public String getBillet() {
		return billet;
	}

	public void setBillet(String billet) {
		this.billet = billet;
	}

	public String getNomAcheteur() {
		return nomAcheteur;
	}

	public void setNomAcheteur(String nomAcheteur) {
		this.nomAcheteur = nomAcheteur;
	}

	public String getPrenomAcheteur() {
		return prenomAcheteur;
	}

	public void setPrenomAcheteur(String prenomAcheteur) {
		this.prenomAcheteur = prenomAcheteur;
	}

	public String getAdresseAcheteur() {
		return adresseAcheteur;
	}

	public void setAdresseAcheteur(String adresseAcheteur) {
		this.adresseAcheteur = adresseAcheteur;
	}

	public String getCodePostalAcheteur() {
		return codePostalAcheteur;
	}

	public void setCodePostalAcheteur(String codePostalAcheteur) {
		this.codePostalAcheteur = codePostalAcheteur;
	}

	public String getVilleAcheteur() {
		return villeAcheteur;
	}

	public void setVilleAcheteur(String villeAcheteur) {
		this.villeAcheteur = villeAcheteur;
	}

	public String getPaysAcheteur() {
		return paysAcheteur;
	}

	public void setPaysAcheteur(String paysAcheteur) {
		this.paysAcheteur = paysAcheteur;
	}

	@Override
	public String toString() {
		return "HelloAssoCsv{" +
				"numero=" + numero +
				", campagne='" + campagne + '\'' +
				", formule='" + formule + '\'' +
				", montant=" + montant +
				", codePromo='" + codePromo + '\'' +
				", statut='" + statut + '\'' +
				", moyenDePaiement='" + moyenDePaiement + '\'' +
				", nom='" + nom + '\'' +
				", prenom='" + prenom + '\'' +
				", societe='" + societe + '\'' +
				", date=" + date +
				", email='" + email + '\'' +
				", dateNaissance=" + dateNaissance +
				", attestation='" + attestation + '\'' +
				", recu='" + recu + '\'' +
				", numeroRecu='" + numeroRecu + '\'' +
				", billet='" + billet + '\'' +
				", nomAcheteur='" + nomAcheteur + '\'' +
				", prenomAcheteur='" + prenomAcheteur + '\'' +
				", adresseAcheteur='" + adresseAcheteur + '\'' +
				", codePostalAcheteur='" + codePostalAcheteur + '\'' +
				", villeAcheteur='" + villeAcheteur + '\'' +
				", paysAcheteur='" + paysAcheteur + '\'' +
				'}';
	}


	public int getNombreTicketReel() {
		switch (this.formule) {
			case "Un carnet de 5 tickets":
				return 5;
			case "Un carnet de 10 tickets":
				return 10;
			case "Un billet":
				return 1;
		}
		return 0;
	}
}
