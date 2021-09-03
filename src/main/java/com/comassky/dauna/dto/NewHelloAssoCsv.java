package com.comassky.dauna.dto;

public class NewHelloAssoCsv extends HelloAssoCsv {

	public NewHelloAssoCsv(final HelloAssoCsv helloAssoCsv)  {
		this.setNumero(helloAssoCsv.getNumero());
		this.setDateNaissance(helloAssoCsv.getDateNaissance());
		this.setDate(helloAssoCsv.getDate());
		this.setCampagne(helloAssoCsv.getCampagne());
		this.setBillet(helloAssoCsv.getBillet());
		this.setCodePromo(helloAssoCsv.getCodePromo());
		this.setAttestation(helloAssoCsv.getAttestation());
		this.setAdresseAcheteur(helloAssoCsv.getAdresseAcheteur());
		this.setEmail(helloAssoCsv.getEmail());
		this.setVilleAcheteur(helloAssoCsv.getVilleAcheteur());
		this.setStatut(helloAssoCsv.getStatut());
		this.setRecu(helloAssoCsv.getRecu());
		this.setSociete(helloAssoCsv.getSociete());
		this.setPrenomAcheteur(helloAssoCsv.getPrenomAcheteur());
		this.setPrenom(helloAssoCsv.getPrenom());
		this.setPaysAcheteur(helloAssoCsv.getPaysAcheteur());
		this.setNomAcheteur(helloAssoCsv.getNomAcheteur());
		this.setNom(helloAssoCsv.getNom());
		this.setCodePostalAcheteur(helloAssoCsv.getCodePostalAcheteur());
		this.setFormule(helloAssoCsv.getFormule());
		this.setMoyenDePaiement(helloAssoCsv.getMoyenDePaiement());
	}

	@Override
	public String toString() {
		return "HelloAssoCsv{" +
				"numero=" + this.getNumero()+
				", campagne='" + getCampagne() + '\'' +
				", formule='" + getFormule() + '\'' +
				", montant=" + getMontant() +
				", codePromo='" + getCodePromo() + '\'' +
				", statut='" + getStatut() + '\'' +
				", moyenDePaiement='" + getMoyenDePaiement() + '\'' +
				", nom='" + getNom() + '\'' +
				", prenom='" + getPrenom() + '\'' +
				", societe='" + getSociete() + '\'' +
				", date=" + getDate() +
				", email='" + getEmail() + '\'' +
				", dateNaissance=" + getDateNaissance() +
				", attestation='" + getAttestation() + '\'' +
				", recu='" + getRecu() + '\'' +
				", numeroRecu='" + getNumeroRecu() + '\'' +
				", billet='" + getBillet() + '\'' +
				", nomAcheteur='" + getNomAcheteur() + '\'' +
				", prenomAcheteur='" + getPrenomAcheteur() + '\'' +
				", adresseAcheteur='" + getAdresseAcheteur()+ '\'' +
				", codePostalAcheteur='" + getCodePostalAcheteur() + '\'' +
				", villeAcheteur='" + getVilleAcheteur() + '\'' +
				", paysAcheteur='" + getPaysAcheteur() + '\'' +
				'}';
	}
}
